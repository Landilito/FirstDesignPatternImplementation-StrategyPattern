package behaviors.fly;
import behaviors.FlyBehavior;

public class RocketPoweredFly implements FlyBehavior{
   @Override
public void fly() {
	System.out.println("I fly with a rocket");
}

}