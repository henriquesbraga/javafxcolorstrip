# ColorStrip Color Changer
An JavaFX Application that changes the color of ws2812b led strip.
<hr>

This application change the color of ws2812b strip via desktop.

You have to upload the colorCode.ino to your arduino and launch the program.
Open terminal on the project folder and type "mvn clean package" to generate jar in /target folder.

After connecting your led strip in the schema below, connecting in an usb port and uploading the code,
open the javafx program, select the port that arduino is in, click "Connect" and choose a color, then "click Send Color".
You also will need AdafruitNeoPixel library.


Future implementations will include: Insert effects and change brightness by parameters.

<img src="https://drive.google.com/uc?id=1-L16oTVt4A1jLp_IGwwbISFn3VZ-FFVQ"/>
<img src="https://drive.google.com/uc?id=1SiyKkddvJx7vLywvJZZY7CdrbZPHa97V"/>

<img src="https://media.giphy.com/media/TjpaYS1LVASLAZriqv/giphy.gif"/>

![](https://media.giphy.com/media/TjpaYS1LVASLAZriqv/giphy.gif)
