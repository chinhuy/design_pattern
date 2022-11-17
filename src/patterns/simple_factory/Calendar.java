package src.patterns.simple_factory;

public abstract class Calendar {
  protected Zone zone;
  public void print() {
    System.out.println("Display name: " + zone.displayName + ", offset: " + zone.offset);
  }
  public abstract void createCalendar();
}
