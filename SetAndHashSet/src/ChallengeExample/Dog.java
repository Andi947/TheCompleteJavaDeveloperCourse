package ChallengeExample;

/**
 * Created by Andrea on 2017/05/02.
 */
public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj instanceof Dog){   // only if they are the same obj; if different obj, use HeavenlyBody comparison
            String objName = ((Dog) obj).getName();
            return this.name.equals(objName);
        }

        return false;
    }

}
