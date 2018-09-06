import io.javalin.Javalin
import io.javalin.staticfiles.Location
import nyc.spookyrobotics.about.About
import nyc.spookyrobotics.getting_started.GettingStarted
import nyc.spookyrobotics.homepage.Homepage
import java.nio.file.Paths

val PORT: Int = 7000

fun main(args: Array<String>) {

    val path = Paths.get("html").toAbsolutePath().toString()
    val app = Javalin.create().apply {
        enableStaticFiles(path, Location.EXTERNAL)
        port(PORT)
    }.start()
}


fun createDynamicPages() {
    val paths = listOf(
            Homepage(),
            About(),
            GettingStarted()
    )
    val app = Javalin.create().apply {
        port(PORT)
    }.start()
    paths.forEach {
        app.get(it.path()){ ctx -> ctx.result(it.content())}
    }
}