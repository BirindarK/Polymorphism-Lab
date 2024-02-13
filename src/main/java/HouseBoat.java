import interfaces.IOwn;

public class HouseBoat implements IOwn {
    private String name;
    private boolean hasAMotor;

    private int numberOfEngines;

    public HouseBoat(String name, boolean hasAMotor, int numberOfEngines) {
        this.name = name;
        this.hasAMotor = hasAMotor;
        this.numberOfEngines = numberOfEngines;
    }

public String getName(){
        return this.name;
}

public boolean getHasAMotor(){
        return this.hasAMotor;
}

public int getNumberOfEngines(){
        return this.numberOfEngines;
}

    public String isOwner (String ownerStatus) {
        return this.name +" "+ ownerStatus +" this property";

    }



}
