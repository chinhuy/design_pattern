package src.patterns.observer;

public class SimpleObserver implements Observer{
  private Subject subject;
  private int value;

  public SimpleObserver(Subject subject){
    this.subject = subject;
    System.out.println("Register observer " + this.toString());
    this.subject.registerObserver(this);
  }
  @Override
  public void update(int value) {
    this.value = value;
    display();
  }
  public void display(){
    System.out.println("The updated value of " + this.toString() + " is " + value);
  }
}
