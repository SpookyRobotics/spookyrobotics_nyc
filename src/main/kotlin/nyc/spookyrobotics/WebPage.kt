package nyc.spookyrobotics

abstract class WebPage {
    abstract fun path(): String
    abstract fun content(): String
    abstract fun title(): String
    fun writePageToDisk() {}
    fun buildCharset() : String = "<meta charset=\"utf-8\">"
    fun buildTitle() : String = "<title>${title()}</title>"
    fun buildViewport() : String = "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">"

}
