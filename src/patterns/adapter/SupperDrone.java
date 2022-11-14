package src.patterns.adapter;

public class SupperDrone implements Drone{

  @Override
  public void beep() {
    System.out.println("Beep beep beep");
  }

  @Override
  public void spin_rotor() {
    System.out.println("Rotors are spinning");
  }

  @Override
  public void take_off() {
    System.out.println("Taking off");
  }
  
}
