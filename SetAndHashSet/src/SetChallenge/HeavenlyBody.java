package SetChallenge;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by Andrea on 2017/05/01.
 */
public /*abstract*/ class HeavenlyBody {
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    // don't know how to support bodyType in HeavenlyBody: Checked solution to see...
    // create an int bodyType-> create instances for each body type through int (eg int STAR = 1;)
    // constants through enum -> public enum BodyTypes {STAR, etc}
    private final Key key;

    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<HeavenlyBody>();
        this.key = new Key(name, bodyType);
    }


    public Double getOrbitalPeriod() {
        return orbitalPeriod;
    }


    public Key getKey() {
        return key;
    }

    public boolean addSatellite(HeavenlyBody moon){
        return this.satellites.add(moon);
    }


/**   MY METHOD FOR ADDSATELLITE()
    public boolean addSatellite(HeavenlyBody satellite){
        if(this.bodyType == BodyTypes.PLANET) {
            if (satellite.bodyType == BodyTypes.MOON) {
                return this.satellites.add(satellite);
            } else {
                System.out.println("This satellite cannot be added to a planet");
                return false;
            }
        } else if(this.bodyType == BodyTypes.STAR){
            return this.satellites.add(satellite);
        } else {
            System.out.println("This heavenly body cannot have satellites");
            return false;
        }
    }
**/

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

   /** check that the obj we're comparing is of class type HeavenlyBody; if so, we then check
    * to see if it has the same name, if so, we then check if the body types are the same, if not,
    * then they are not the same object i.e. not equal**/

    @Override
    public final boolean equals(Object obj){

        if(this == obj){
            return true;
        }
        // For Challenge - use instanceOf()
        if((obj instanceof HeavenlyBody)){
            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyType){
        return new Key(name, bodyType);
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ": " + this.orbitalPeriod;
    }  // overwrites the toString to help us call the full name

    public static final class Key{
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;

            if (this.name.equals(key.getName())) {
                return this.bodyType == key.getBodyType();
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }
}
