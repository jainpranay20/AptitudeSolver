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




    @Test
    @DisplayName("fact()=>follows path [1,2,3,6,7]")
    public void testFractionToPercentageConverter()
    {
        assertEquals("Value of b cannot be zero",aptitudeFunction.fractionToPercentageConverter(10, 0));
    }
    @Test
    @DisplayName("fact()=>follows path [1,2,4,6,7]")
    public void testFractionToPercentageConverter1()
    {
        assertEquals("50.0",aptitudeFunction.fractionToPercentageConverter(20, 40));
    }



    @Test
    @DisplayName("fact()=>follows path [1,2,3,5,7]")
    public void testCompoundInterest()
    {
        assertEquals("Either principal value or rate value or time value is invalid",aptitudeFunction.compoundInterest(0,10,20));
    }
    @Test
    @DisplayName("fact()=>follows path [1,2,4,6,7]")
    public void testCompoundInterest1()
    {
        assertEquals("Amount is: 1610.5100000000004 Interest is: 610.5100000000004",aptitudeFunction.compoundInterest(1000,10,5));
    }


    @Test
    @DisplayName("fact()=>follows path [1,2,3,7,8]")
    public void testNthTermOfGP()
    {
        assertEquals("Invalid value of n",aptitudeFunction.findFirstNTermsGP(10,10,0));
    }
    @Test
    @DisplayName("fact()=>follows path [1,2,4,5,4,6,8]")
    public void testNthTermOfGP1()
    {
        assertEquals("10.0,100.0,1000.0",aptitudeFunction.findFirstNTermsGP(10,10,3));
    }
    @Test
    @DisplayName("fact()=>follows path [1,2,4,6,8]")
    public void testNthTermOfGP2()
    {
        assertEquals("10.0",aptitudeFunction.findFirstNTermsGP(10,10,1));
    }
*/
    @Test
    @DisplayName("fact()=>follows path [1,2,3,5,2,4,7,9,11]")
    public void getCountOfDays()
    {
        assertEquals("Invalid input",aptitudeFunction.getCountOfDays(new int[]{}));
    }

    @Test
    @DisplayName("fact()=>follows path [1,2,3,6,2,4,7,9,11]")
    public void getCountOfDays1()
    {
        assertEquals("1.0",aptitudeFunction.getCountOfDays(new int[]{1}));
    }
    @Test
    @DisplayName("fact()=>follows path [1,2,4,7,9,11]")
    public void getCountOfDays2()
    {
        assertEquals("Invalid input",aptitudeFunction.getCountOfDays(new int[]{}));
    }


}
