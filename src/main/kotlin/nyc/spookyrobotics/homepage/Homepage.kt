package nyc.spookyrobotics.homepage

import nyc.spookyrobotics.WebPage

class Homepage : WebPage() {
    override fun path(): String = "/"

    override fun content(): String = """<!DOCTYPE html>
<html lang="en">
  <head>
    <title>SpookyRobotics</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="utf-8">
    <style>      /* Mobile First Design */

      .parent {
          display: grid;
          grid-template-columns: 1fr;
          grid-template-rows: 1fr 1fr 1fr 1fr;
          text-align: center;
          height: 100vh;
      }

      .contact-info {
        grid-template-columns: 1fr 1fr 1fr 1fr;
      }
      .title_bar {
          display: grid;
          grid-template-columns: 1fr;
          text-align: left;
          text-align: center;
      }

      .scaling_image {
        display: block;
        max-width: 80vw;
        max-height: 80vh;
        margin-left: auto;
        margin-right: auto;
      }

      .header_links {
        list-style-type: none;
        margin: 0;
        padding: 0;
      }

      .header_item {
        display: inline;
        width: 60px;
        background-color: #555;
        color: white;
      }

      /* Tablet Design */
      @media only screen and (min-width: 900px) {}

      /* Desktop Design */
      @media only screen and (min-width: 1200px) {}
    </style>
  </head>
  <body>
  <div class="parent">
    <div class="title_bar">
      <b>SpookyRobotics</b> <br>An Open Source Hardware Company
    </div>
    <div class="header">
      <ul class="header_links">
        <li><a class="header_item" href="https://spookyrobotics.nyc">Home</a></li>
        <li><a class="header_item" href="https://spookyrobotics.nyc/about.html">About</a></li>
        <li><a class="header_item" href="https://spookyrobotics.nyc/getting-started.html">Getting Started</a></li>
        <li><a class="header_item" href="https://github.com/spookyrobotics">Github</a></li>
      </ul>
    </div>
    <div>
      <h2>Spooky Glove</h2>
      <img class="scaling_image" src="jpg/sensor_on_plaster_hand.jpg" />
      <div class="section_description">
        <p>A wearable device for controlling electronics </p>
      </div>
    </div>
    <div>
      <h2>Handheld RGB</h2>
      <img class="scaling_image" src="jpg/rgb_matrix_in_hand.jpg" />
      <div class="section_description">
        <p>A Handheld RGB array</p>
      </div>
    </div>
  </div>
  </body>
</html>
"""

}