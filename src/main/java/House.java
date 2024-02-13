public class House extends Residential {

    private int numberOfPets;
    private boolean hasGarden;
    private boolean hasPorch;
    private boolean canBeExtended;

    public House(String name, int numberOfRooms, int numberOfBathrooms, String dateOfConstruction, int squareFootage, String location, int numberOfOccupants, String typeOfOccupant, String typeOfResidentialProperty, int numberOfStories, int numberOfPets, boolean hasGarden, boolean hasPorch, boolean canBeExtended){
        super( name, numberOfRooms, numberOfBathrooms, dateOfConstruction, squareFootage, location, numberOfOccupants, typeOfOccupant, typeOfResidentialProperty, numberOfStories);
        this.numberOfPets = numberOfPets;
        this.hasGarden = hasGarden;
        this.hasPorch = hasPorch;
        this.canBeExtended = canBeExtended;
    }

    public int getNumberOfPets(){
        return this.numberOfPets;
    }

    public boolean getHasGarden(){
        return this.hasGarden;
    }
    public boolean getHasPorch(){
        return this.hasPorch;
    }

    public boolean getcanBeExtended(){
        return this.canBeExtended;
    }

}
