import net.hellonico.jodatime.*;

class Location {
  PFont sfont = createFont("",10);
  TimeLibrary library;
  String location;
  int displayY;
  
  public Location(TimeLibrary _library, String _location, int _displayY) {
    this.library = _library;
    this.location = _location;
    this.displayY = _displayY;
  }
  
  public void display(PFont font) {
    textFont(sfont, 10);
    text(location, 5, displayY);
    textFont(font, 32); 
    text(time.getTimeString(location), 5, displayY+25);
  }
  
}
