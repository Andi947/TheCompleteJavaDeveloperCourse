package com.andi947;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Andrea on 2017/05/01.
 */
public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object obj){

 // checks to see if it compares to itself

        if(this == obj){
            return true;
        }
 //To ensure subclasses don't compare equal:
 // checks actual class of obj being compared against class of object the method is in

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        // checks for null first to avoid NullPointerException - thus will return false instead
        if((obj == null) || (obj.getClass()!= this.getClass())){
            return false;
        }

 // if not null, then it will compare the two obj by their getName()

        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {  // return this.name.hashCode() would work due to generics, but not proper
        System.out.println("hashCode() called");
        return this.name.hashCode() + 57;   // adding the number 57 to the hashCode number
    }
}
