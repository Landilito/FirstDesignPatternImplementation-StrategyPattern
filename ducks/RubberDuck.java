import behaviors.fly.*;
import behaviors.quack.*;
public class RubberDuck extends Duck{

  public RubberDuck(){
    flyBehavior = new NoFly();
    quackBehavior = new Squack();
  }
  
  @Override
public void display() {
	// TODO Auto-generated method stub
	
}
}