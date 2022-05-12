package behaviors.fly;
import behaviors.FlyBehavior;

public class NoFly implements FlyBehavior{
  @Override
public void fly() {
	System.out.println("I cant fly");
}
}