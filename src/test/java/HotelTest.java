import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HotelTest {
    Hotel hotel;

    @BeforeEach
    public void setUp(){
        hotel = new Hotel(300,310,"24.06.2010",10000,"Cardiff","Hilton","Hotel", 250500,"Double Room", true,350);
    }

    @Test
    public void getRoomType(){
        assertThat(hotel.getRoomType()).isEqualTo("Double Room");
    }

    @Test
    public void getHasPool(){
        assertThat(hotel.getHasPool()).isEqualTo(true);
    }

    @Test
    public void getNumberOfGuests(){
        assertThat(hotel.getNumberOfGuests()).isEqualTo(350);
    }

}
