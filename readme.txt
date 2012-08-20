Making jodatime available to Processing

How to use:
```java
import net.hellonico.jodatime.*;

TimeLibrary time;
PFont font;
void setup() {
  size(500,100);
  smooth();
  frameRate(1);
  
  font = loadFont("Digital-7-30.vlw");
  time = new TimeLibrary(this);
  
  textFont(font, 32);
}

void draw() {
  background(0);
  text(time.getTimeString(), 50, 50);
}
```