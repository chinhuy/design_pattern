package src.patterns.simple_factory;

public class CalendarDemoApp {
  public static void main(String[] args) {
    ZoneFactory zoneFactory = new ZoneFactory();
    Calendar calendar = new PacificCalendar(zoneFactory);
    calendar.createCalendar();
  }
}
