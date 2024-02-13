public class Flat extends Residential{
    private int floorNumber;
    private boolean hasLobby;
    private int flatNumber;

    public Flat(String name, int numberOfRooms, int numberOfBathrooms, String dateOfConstruction, int squareFootage, String location, int numberOfOccupants, String typeOfOccupant, String typeOfResidentialProperty, int numberOfStories, int floorNumber, boolean hasLobby, int flatNumber){
        super( name, numberOfRooms, numberOfBathrooms, dateOfConstruction, squareFootage, location, numberOfOccupants, typeOfOccupant, typeOfResidentialProperty, numberOfStories);
        this.floorNumber = floorNumber;
        this.hasLobby = hasLobby;
        this.flatNumber = flatNumber;
    }

    public int getFloorNumber(){
        return this.floorNumber;
    }
    public boolean getHasLobby(){
        return this.hasLobby;
    }
    public int getFlatNumber(){
        return this.flatNumber;
    }

}
