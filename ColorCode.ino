#include <Adafruit_NeoPixel.h>
#define LED_PIN    3
#define LED_COUNT 120
Adafruit_NeoPixel strip(LED_COUNT, LED_PIN, NEO_GRB + NEO_KHZ800);

/**
  Java program will send an color by serial port.
  Here, the color code received will be transformed
  from hexadecimal to RGB and then, the color will
  be showed in strip.
  Henrique Braga
**/
void setup() {
  Serial.begin(9600);
  strip.begin();
  strip.setBrightness(50);
}

      long r;
      long g;
      long b;

void loop() {
     
      while(Serial.available() > 0){  
      String hexcolor = Serial.readString();
      long number = strtol( &hexcolor[1], NULL, 16);


      r = number >> 16;
      g = number >> 8 & 0xFF;
      b = number & 0xFF;
      

      colorWipe(strip.Color(r,   g,   b));
      delay(2000);

      }
}


void colorWipe(uint32_t color) {
  for(int i=0; i<strip.numPixels(); i++) { 
    strip.setPixelColor(i, color);         
    strip.show();                          
  }
}
