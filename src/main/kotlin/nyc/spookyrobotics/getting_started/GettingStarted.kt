package nyc.spookyrobotics.getting_started

import nyc.spookyrobotics.WebPage

class GettingStarted : WebPage() {
    override fun title(): String = "Getting Started: SpookyRobotics"

    override fun path(): String = "/getting-started.html"

    override fun content(): String = """
<!DOCTYPE html>
<html lang="en">
  <head>
    ${buildTitle()}
    ${buildViewport()}
    ${buildCharset()}
    <style>
      .parent {
          display: grid;
          grid-template-columns: 1fr ;
          grid-template-rows: 1fr 4fr 4fr 1fr;
          text-align: center;
          height: 100vh;
      }

      /* Mobile First Design */
      .title_bar {
          display: grid;
          grid-template-columns: 1fr;
          text-align: left;
          text-align: center;
      }

      .scaling_image {
        display: block;
        margin: auto;
        width:40%;
      }

      /* Tablet Design */
      @media only screen and (min-width: 900px) {

      }

      /* Desktop Design */
      @media only screen and (min-width: 1200px) {
      }


    </style>
  </head>
  <body>
  <div class="parent">
    <div class="title_bar">
      <p> <b>SpookyRobotics</b> <p>An Open Source Hardware Company </p>
    </div>
    <div class="project_section section_one">
      <hr>
      <h2>A Spooky Engineer</h2>
      <img class="scaling_image" src="jpg/chip_top.jpg" />
      <div class="section_description">
        <p>
          My philosophy for educational engineering:
        </p>
      </div>
      <hr>
    </div>
    <div class="project_section section_two">
      <h2>Development Environment</h2>
      <img class="scaling_image" src="jpg/parts_layout.jpg" />
      <div class="section_description">
        <p>
          All projects on this site are designed to be replicated, using the following open sources tools:
        </p>
      </div>
      <hr>
    </div>

    <div class="footer">
      <a href="https://spookyrobotics.nyc">Home</a><br>
      <a href="https://spookyrobotics.nyc/about.html">About</a><br>
      <a href="https://spookyrobotics.nyc/getting-started.html">Getting Started</a><br>
      <a href="https://github.com/spookyrobotics">Github</a>
    </div>
  </div>
  </body>
</html>

"""

}