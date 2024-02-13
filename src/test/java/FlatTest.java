import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlatTest {

    Flat flat;

    @BeforeEach
    public void setUp(){
        flat = new Flat("Aloha Apartments", 2, 1,"22.05.2023",3000,"Kent",2,"Students","Flat",1,15,true,125);
    }

    @Test
    public void getFloorNumber(){
        assertThat(flat.getFloorNumber()).isEqualTo(15);
    }

    @Test
    public void getHasLobby(){
        assertThat(flat.getHasLobby()).isEqualTo(true);
    }

    @Test
    public void getFlatNumber(){
        assertThat(flat.getFlatNumber()).isEqualTo(125);
    }
}
