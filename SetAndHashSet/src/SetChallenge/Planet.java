package SetChallenge;



/**
 * Created by Andrea on 2017/05/03.
 */
public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

/** A Planet specific overrride of the addSatellite - better idea than in HeavenlyBody class **/

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getKey().getBodyType() == BodyTypes.MOON){
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
