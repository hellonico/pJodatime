import net.hellonico.jodatime.*;

TimeLibrary time;
String [] locs = new String[] {
  "Asia/Tokyo",
  "America/New_York",
  "Europe/Paris",
  "Asia/Shanghai"
};
Location[] locations = new Location[locs.length];
PFont font;

void setup() {
  size(400,250);
  smooth();
  font = loadFont("Digital-7-30.vlw");
  time = new TimeLibrary(this);
  // println(time.getTimezones());
  for(int i = 0 ; i< locs.length; i++) {
    locations[i] = new Location(time, locs[i], i*50+20); 
  }

  frameRate(1);
}

void draw() {
  background(255);
  fill(0, 0, 0);
  for(int i=0 ; i<locations.length ; i++) {
     locations[i].display(font); 
  }
}
