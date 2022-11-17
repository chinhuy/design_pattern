package src.patterns.simple_factory;

public class PacificCalendar extends Calendar{

  public PacificCalendar(ZoneFactory zoneFactory) {
    zone = zoneFactory.createZone("Pacific");
  }

  @Override
  public void createCalendar() {
    System.out.println("Creating calendar....");
    this.print();
  }
  
}
