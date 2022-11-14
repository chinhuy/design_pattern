package src.patterns.adapter;

public class DuckAdapter implements Duck{

  private Turkey turkey;
  public DuckAdapter(Turkey turkey){
    this.turkey = turkey;
  }

  @Override
  public void fly() {
    for (int i = 0; i < 5; i++) {
      turkey.fly();
    }
  }

  @Override
  public void quack() {
    turkey.gobble();
  }
  
}
