import behaviors.fly.*;
import behaviors.quack.*;
public class ModelDuck extends Duck{

  public ModelDuck(){
    flyBehavior = new NoFly();
    quackBehavior = new Squack();
  }

  @Override
public void display() {
	// TODO Auto-generated method stub
	
}
}