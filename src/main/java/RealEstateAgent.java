import java.util.ArrayList;

public class RealEstateAgent {

    private String name;
    private String buildingType;

    private ArrayList<Building> listing;

    public RealEstateAgent(String name, String buildingType){
        this.name = name;
        this.buildingType = buildingType;
        this.listing = new ArrayList<>();
    }

    public String getBuildingType(){
        return this.buildingType;
    }
    public int countBuilding(){
        return this.listing.size();
    }

    public void addBuilding(Building building){
        this.listing.add(building);
    }

    public void removeBuilding(Building building){
        this.listing.remove(building);
    }

}
