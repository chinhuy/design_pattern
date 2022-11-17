package src.patterns.simple_factory;

public class ZoneFactory {
  public Zone createZone(String zoneId){
    Zone zone;
    switch(zoneId){
      case "Central":
       zone = new ZoneUSCentral();
       break;
      case "Mountain":
       zone = new ZoneUSMountain();
       break;
      case "Pacific":
       zone = new ZoneUSPacific();
       break;
      case "Eastern":
       zone = new ZoneUSEastern();
       break;
       default:
        zone = null;
        break;
    }
    return zone;
  }
}
