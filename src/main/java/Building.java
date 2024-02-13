import java.util.ArrayList;

public class Building {

    private Building addBuilding;
    private int numberOfRooms;
    private int numberOfBathrooms;
    private String dateOfConstruction;
    private int squareFootage;
    private String location;


    public Building (int numberOfRooms, int numberOfBathrooms, String dateOfConstruction, int squareFootage, String location) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.dateOfConstruction = dateOfConstruction;
        this.squareFootage = squareFootage;
        this.location = location;
    }


//Getters and Setters

public int getNumberOfRooms(){
        return this.numberOfRooms;
}

public int getNumberOfBathrooms(){
        return this.numberOfBathrooms;
}

public String getDateOfConstruction(){
        return this.dateOfConstruction;
}

public int getSquareFootage(){
        return this.squareFootage;
}

public String getLocation(){
        return this.location;
}

public void addRoom(int room){
        this.numberOfRooms += 1;

}

public void addBathroom(int bathroom){
        this.numberOfBathrooms += 1;
    }

public void addSquareFootage(int squareFeet) {
    this.squareFootage += 1000;
}



}
