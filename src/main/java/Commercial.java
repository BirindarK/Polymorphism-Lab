public abstract class Commercial extends Building {
    private String companyName;
    private String typeOfCommercialProperty;
    private int profitGenerated;

    public Commercial(int numberOfRooms, int numberOfBathrooms, String dateOfConstruction, int squareFootage, String location, String companyName, String typeOfCommercialProperty, int profitGenerated){
        super(numberOfRooms, numberOfBathrooms, dateOfConstruction, squareFootage, location);
        this.companyName = companyName;
        this.typeOfCommercialProperty = typeOfCommercialProperty;
        this.profitGenerated = profitGenerated;

    }

    public String getCompanyName(){
        return this.companyName;
    }

    public String getTypeOfCommercialProperty(){
        return this.typeOfCommercialProperty;
    }

    public int getProfitGenerated(){
        return this.profitGenerated;
    }

}
