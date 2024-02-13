

public class Residential extends Building {

    private int numberOfOccupants;
    private String typeOfOccupant;
    private String typeOfResidentialProperty;
    private int numberOfStories;

    private String name;



    public Residential(String name, int numberOfRooms, int numberOfBathrooms, String dateOfConstruction, int squareFootage, String location, int numberOfOccupants, String typeOfOccupant, String typeOfResidentialProperty, int numberOfStories) {
        super(numberOfRooms, numberOfBathrooms, dateOfConstruction, squareFootage, location);
        this.numberOfOccupants = numberOfOccupants;
        this.typeOfOccupant = typeOfOccupant;
        this.typeOfResidentialProperty = typeOfResidentialProperty;
        this.numberOfStories = numberOfStories;
        this.name = name;


    }


    public String getName(){
        return this.name;
    }

    public int getNumberOfOccupants(){
        return this.numberOfOccupants;
    }

    public String getTypeOfOccupant(){
        return this.typeOfOccupant;
    }

    public String getTypeOfResidentialProperty(){
        return this.typeOfResidentialProperty;
    }

    public int getNumberOfStories(){
        return this.numberOfStories;
    }


}
