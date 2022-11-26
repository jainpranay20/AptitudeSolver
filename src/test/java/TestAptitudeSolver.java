import org.example.AptitudeFunction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestAptitudeSolver
{
    private AptitudeFunction aptitudeFunction;

    @BeforeEach
    void setup()
    {
        aptitudeFunction = new AptitudeFunction();
    }

    @Test
    @DisplayName("fact()=>follows path [1,2,3,6,7]")
    public void testPercentageChange()
    {
        assertEquals("Invalid original value",aptitudeFunction.percentageChange(0, 10));
    }
}
