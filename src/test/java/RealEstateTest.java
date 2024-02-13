import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RealEstateTest {

    RealEstateAgent agent;

    //Come back to this when Other classes are created
    Building house1;
    Building flat1;
    Building hotel1;
    Building office1;



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
        Building building = new Building(4,3,"22.05.2004",6000,"London");
        agent.addBuilding(building);
        assertThat(agent.countBuilding()).isEqualTo(1);
    }

    @Test
    public void removeBuilding(){
        Building building = new Building(4,3,"22.05.2004",6000,"London");
        agent.removeBuilding(building);
        assertThat(agent.countBuilding()).isEqualTo(0);
    }

}
