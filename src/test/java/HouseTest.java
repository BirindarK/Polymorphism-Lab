import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HouseTest {
    House house;

    @BeforeEach
    public void setUp(){
        house = new House("Smiths", 4, 3,"22.05.2004",6500,"Walsall",4,"Family","House",3,3,true,true,false);
    }

    @Test
    public void getNumberOfPets(){
        assertThat(house.getNumberOfPets()).isEqualTo(3);
    }

    @Test
    public void getHasGarden(){
        assertThat(house.getHasGarden()).isEqualTo(true);
    }

    @Test
    public void getHasPorch(){
        assertThat(house.getHasPorch()).isEqualTo(true);
    }

    @Test
    public void getcanBeExtended(){
        assertThat(house.getcanBeExtended()).isEqualTo(false);
    }




}
