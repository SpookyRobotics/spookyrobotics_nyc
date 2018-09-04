package nyc.spookyrobotics

abstract class WebPage {
    abstract fun url(): String
    abstract fun content(): String
    abstract fun writePageToDisk()
}
