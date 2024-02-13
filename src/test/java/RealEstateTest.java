import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RealEstateTest {

    RealEstateAgent agent;
    Building house1;
    Building house2;

    @BeforeEach
    public void setUp(){
        agent = new RealEstateAgent("Paul", "house");
    }

    @Test
    public void getBuildingType(){
        assertThat(agent.getBuildingType()).isEqualTo("house");
    }

    @Test
    public void countBuilding(){
        assertThat(agent.countBuilding()).isEqualTo(0);
    }

    @Test
    public void addBuilding(){
        Building house1 = new House("Smiths", 4, 3,"22.05.2004",6500,"Walsall",4,"Family","House",3,3,true,true,false);
        Residential flat = new Flat("Aloha Apartments", 2, 1,"22.05.2023",3000,"Kent",2,"Students","Flat",1,15,true,125);
        Building office = new Office(32,10,"30.07.2019",10000,"Dorset","Jacobs","Office",250000, 140, true, 10);
        Commercial hotel = new Hotel(300,310,"24.06.2010",10000,"Cardiff","Hilton","Hotel", 250500,"Double Room", true,350);

        agent.addBuilding(house1);
        agent.addBuilding(flat);
        agent.addBuilding(hotel);
        agent.addBuilding(office);
        assertThat(agent.countBuilding()).isEqualTo(4);
    }

    @Test
    public void removeBuilding(){
        Building house1 = new House("Smiths", 4, 3,"22.05.2004",6500,"Walsall",4,"Family","House",3,3,true,true,false);
        Residential flat = new Flat("Aloha Apartments", 2, 1,"22.05.2023",3000,"Kent",2,"Students","Flat",1,15,true,125);
        Building office = new Office(32,10,"30.07.2019",10000,"Dorset","Jacobs","Office",250000, 140, true, 10);
        Commercial hotel = new Hotel(300,310,"24.06.2010",10000,"Cardiff","Hilton","Hotel", 250500,"Double Room", true,350);

        agent.addBuilding(house1);
        agent.addBuilding(flat);
        agent.addBuilding(hotel);
        agent.addBuilding(office);
        House house2 = new House("Scotts", 7, 8,"13.05.2019",10000,"Sutton",7,"Students","House",4,0,true,false,true);
        agent.addBuilding(house2);
        agent.removeBuilding(house1);
        assertThat(agent.countBuilding()).isEqualTo(4);
    }

}
