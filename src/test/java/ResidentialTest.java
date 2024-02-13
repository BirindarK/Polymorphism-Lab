import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ResidentialTest {

    Residential residential;

    @BeforeEach
    public void setUp() {
        residential = new Residential("Smiths", 4, 3, "23.04.2005", 4500, "Bath", 4, "Family", "House", 3);
    }

    @Test
    public void getName(){
        assertThat(residential.getName()).isEqualTo("Smiths");
    }

    @Test
    public void getNumberOfOccupants(){
        assertThat(residential.getNumberOfOccupants()).isEqualTo(4);
    }

    @Test
    public void getTypeOfOccupant(){
        assertThat(residential.getTypeOfOccupant()).isEqualTo("Family");

    }

    @Test
    public void getTypeOfResidentialProperty(){
        assertThat(residential.getTypeOfResidentialProperty()).isEqualTo("House");
    }

    @Test
    public void getNumberOfStories(){
        assertThat(residential.getNumberOfStories()).isEqualTo(3);
    }








}
