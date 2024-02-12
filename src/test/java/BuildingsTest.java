import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BuildingsTest {

    Building building;

    private int room;
    private int bathroom;

    private int squareFeet;




    @BeforeEach
    public void setUp(){
        building = new Building(4, 3, "22.09.2022", 5000, "London");
    }

    @Test
    public void getNumberOfRooms(){
        assertThat(building.getNumberOfRooms()).isEqualTo(4);
}

    @Test
    public void getNumberOfBathrooms(){
        assertThat(building.getNumberOfBathrooms()).isEqualTo(3);
    }

    @Test
    public void getDateOfConstruction(){
        assertThat(building.getDateOfConstruction()).isEqualTo("22.09.2022");
    }

    @Test
    public void getSquareFootage(){
        assertThat(building.getSquareFootage()).isEqualTo(5000);
    }

    @Test
    public void getLocation(){
        assertThat(building.getLocation()).isEqualTo("London");
    }



    @Test
    public void canAddRoom(){
        building.addRoom(room);
        assertThat(building.getNumberOfRooms()).isEqualTo(5 );

}

    @Test
    public void canAddBathroom(){
        building.addBathroom(bathroom);
        assertThat(building.getNumberOfBathrooms()).isEqualTo(4);

    }

    @Test
    public void canAddSquareFootage(){
        building.addSquareFootage(squareFeet);
        assertThat(building.getSquareFootage()).isEqualTo(6000);

    }















}
