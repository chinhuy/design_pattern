package src.patterns.adapter;


public class DuckSimulator {
  public static void testDuck(Duck duck){
    duck.fly();
    duck.quack();
  }
  public static void main(String[] args) {
    Duck duck;
    
    //mallard Duck
    duck = new MallardDuck();
    testDuck(duck);

    //wild turkey
    Turkey turkey = new WildTurkey();
    DuckAdapter duckAdapter = new DuckAdapter(turkey);
    testDuck(duckAdapter);

    //drone
    Drone drone = new SupperDrone();
    DroneAdapter droneAdapter = new DroneAdapter(drone);
    testDuck(droneAdapter);
  }
  
}
