#!/bin/sh
### BEGIN INIT INFO
# Provides:          SpookyRobotics Website Service
# Required-Start:    $all
# Required-Stop:
# Default-Start:     2 3 4 5
# Default-Stop:
# Short-Description: Launches the SpookyRobotics jar
### END INIT INFO
SERVICE_NAME=SpookyRoboticsBackend
PATH_TO_JAR=/usr/local/bin/spookyrobotics_backend.jar
PID_PATH_NAME=/tmp/SpookyRoboticsBackend-pid
timestamp=`date +%F.%H.%M.%S`
monitorName=spookyrobotics.monitor.$timestamp
LAUNCH_COMMAND="java -jar $PATH_TO_JAR start dev > /home/spooky/monitors/$monitorName 2>&1"

. /lib/lsb/init-functions

case $1 in
    start)
        echo "Starting $SERVICE_NAME ..."
        if [ ! -f $PID_PATH_NAME ]; then
            $LAUNCH_COMMAND &
            echo $! > $PID_PATH_NAME
            echo "$SERVICE_NAME started ..."
        else
            echo "$SERVICE_NAME is already running ..."
        fi
    ;;
    stop)
        if [ -f $PID_PATH_NAME ]; then
            PID=$(cat $PID_PATH_NAME);
            echo "$SERVICE_NAME stoping ..."
            kill $PID;
            echo "$SERVICE_NAME stopped ..."
            rm $PID_PATH_NAME
        else
            echo "$SERVICE_NAME is not running ..."
        fi
    ;;
    restart)
        if [ -f $PID_PATH_NAME ]; then
            PID=$(cat $PID_PATH_NAME);
            echo "$SERVICE_NAME stopping ...";
            kill $PID;
            echo "$SERVICE_NAME stopped ...";
            rm $PID_PATH_NAME
            echo "$SERVICE_NAME starting ..."
            $LAUNCH_COMMAND &
            echo $! > $PID_PATH_NAME
            echo "$SERVICE_NAME started ..."
        else
            echo "$SERVICE_NAME is not running ..."
        fi
    ;;
    status)
    	status_of_proc -p $PID_PATH_NAME $PATH_TO_JAR $SERVICE_NAME && exit 0 || exit $?
    ;;
esac 
