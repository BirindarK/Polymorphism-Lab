import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OfficeTest {
    Office office;

    @BeforeEach
    public void setUp(){
        office = new Office(32,10,"30.07.2019",10000,"Dorset","Jacobs","Office",250000, 140, true, 10);
    }

    @Test
    public void getNumberOfEmployee(){
        assertThat(office.getNumberOfEmployee()).isEqualTo(140);
    }

    @Test
    public void getHasConferenceRoom(){
        assertThat(office.getHasConferenceRoom()).isEqualTo(true);
    }

    @Test
    public void getProximityToClient(){
        assertThat(office.getProximityToClient()).isEqualTo(10);
    }










}
