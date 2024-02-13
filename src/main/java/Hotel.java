public class Hotel extends Commercial{

   private String roomType;
   private boolean hasPool;
   private int numberOfGuests;


   public Hotel(int numberOfRooms, int numberOfBathrooms, String dateOfConstruction, int squareFootage, String location, String companyName, String typeOfCommercialProperty, int profitGenerated,String roomType, boolean hasPool,int numberOfGuests) {
       super(numberOfRooms, numberOfBathrooms, dateOfConstruction, squareFootage, location, companyName, typeOfCommercialProperty,profitGenerated);
       this.roomType = roomType;
       this.hasPool = hasPool;
       this.numberOfGuests = numberOfGuests;

   }

    public String getRoomType(){
        return this.roomType;
    }

    public boolean getHasPool(){

       return this.hasPool;
    }

    public int getNumberOfGuests(){
        return this.numberOfGuests;
    }

}
