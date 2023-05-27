import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CampingTest {

    @Test
    public void testSetName() {
        Camping camping = new Camping("Campsite", "City", true, 50.0, 4, true, "Country");
        camping.setName("New Campsite");
        assertEquals("New Campsite", camping.getName());
    }

}
