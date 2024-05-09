import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HouseCatTest {

    HouseCat keyboardCat; // Declare a HouseCat object

    @BeforeEach
    public void initCat() {
        // Initialize the HouseCat object before each test
        keyboardCat = new HouseCat("Keyboard Cat", 7);
    }

    @Test
    public void testGetWeight() {
        // Verify that the getWeight() method returns the correct weight
        assertEquals(7, keyboardCat.getWeight(), 0.001);
    }
}