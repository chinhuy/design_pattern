package src.patterns.adapter;

public class WildTurkey implements Turkey{

  public WildTurkey() {
    System.out.println("I am a wild turkey!");
  }

  @Override
  public void fly() {
    System.out.println("I am able to fly!");
    
  }

  @Override
  public void gobble() {
    System.out.println("Gobble! Gooble!");
  }
  
}
