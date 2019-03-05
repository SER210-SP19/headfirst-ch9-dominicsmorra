package edu.quinnipiac.myapplication;

public class Workout {
    private String name;
    private String description;

    public static final Workout workouts[] =  {
            new Workout("limb loosener", "5 handstand" ),
            new Workout("core", "10 sit ups" ),
            new Workout("wimp", "5 pull ups" ),
            new Workout("strength and length", "kettleball swing" )
    };


    public Workout(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public String toString(){
        return this.name;
    }



}
