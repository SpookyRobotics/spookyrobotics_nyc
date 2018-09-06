package nyc.spookyrobotics

abstract class WebPage {
    abstract fun path(): String
    abstract fun content(): String
    fun writePageToDisk() {}
}
