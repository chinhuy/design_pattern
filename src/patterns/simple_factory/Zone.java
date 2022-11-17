package src.patterns.simple_factory;

public abstract class Zone {
  protected String displayName;
  protected int offset;
  public String getDisplayName(){
    return displayName;
  }
  public int getOffset() {
    return offset;
  }
}
