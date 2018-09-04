import io.javalin.Javalin
import nyc.spookyrobotics.WebPage

fun main(args: Array<String>) {
    val app = Javalin.create().start(7000)
    app.get("/") { ctx -> ctx.result("Hello World") }
}