import behaviors.fly.RocketPoweredFly;

class Main {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    Duck rubby = new RubberDuck();
    Duck model = new ModelDuck();

    // mallard.performFly();
    // rubby.performFly();

    model.performFly();
    model.setFlyBehavior(new RocketPoweredFly());
    model.performFly();
  }
}