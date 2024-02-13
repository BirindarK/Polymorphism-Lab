import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HouseBoatTest {

    HouseBoat houseBoat;


    @BeforeEach
    public void setUp() {
        houseBoat = new HouseBoat("Adam", true, 2);
    }

    @Test
    public void getName() {
        assertThat(houseBoat.getName()).isEqualTo("Adam");
    }

    @Test
    public void getHasAMotor() {
        assertThat(houseBoat.getHasAMotor()).isEqualTo(true);
    }

    @Test
    public void getNumberOfEngines() {
        assertThat(houseBoat.getNumberOfEngines()).isEqualTo(2);
    }

    @Test

//    public void isOwner(){
//        boolean isOwner = true;
//        String expected = "It is true that Adam owns the property";
//        assertThat(houseBoat.isOwner()).isEqualTo(expected);
//
//    }

    public void isOwner() {
        String result = houseBoat.isOwner("owns");
        assertThat(result).isEqualTo("Adam owns this property");
    }

}

