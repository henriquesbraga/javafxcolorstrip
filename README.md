# ColorStrip Color Changer
An JavaFX Application that changes the color of ws2812b led strip.
<hr>

This application change the color of ws2812b strip via desktop.

The strip connection is: 5v in ardunino input 5v, GND in arduino GND and data pin in Digital input 3.
For better color enhancement, you will need an external 5v power supply because arduino doesn't have power to keep especific color
that need too much power (white, for exemple) so, i set the brightness in arduino in 50 (strip.setBrightness(50))
if you have a external power supply, you can delete this line.

You have to upload the colorCode.ino to your arduino and launch the program.
Open terminal on the project folder and type "mvn clean package" to generate jar in /target folder.

After connecting your led strip in the schema below, connecting in an usb port and uploading the code,
open the javafx program, select the port that arduino is in, click "Connect" and choose a color, then "click Send Color".
You also will need AdafruitNeoPixel library.


Future implementations will include: Insert effects and change brightness by parameters.

Libraries used: JSerialComm, Jfoenix and Adafruit NeoPixel.

JavaFX in JDK 11 using a maven project. (You will need maven to generate .jar)


