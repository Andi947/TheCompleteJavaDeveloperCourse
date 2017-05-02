package ChallengeExample;

/**
 * Created by Andrea on 2017/05/02.
 */
public class DogMain {
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover));  // true - Labrador is an instance of Dog
        System.out.println(rover.equals(rover2));  // false - Dog is not an instance of Labrador

        // remove the override in Labrador -> both are true

        // to ensure that Dog equals() override is not overridden by subclasses - make Dog's equal() a final method
        // thus no other instances of this method will be allowed for this class' subclasses


    }
}
