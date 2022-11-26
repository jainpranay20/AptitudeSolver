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
    public void testPercentageChange1()
    {
        assertEquals("Invalid original value",aptitudeFunction.percentageChange(0, 10));
    }

    @Test
    @DisplayName("fact()=>follows path [1,2,4,5,7]")
    public void testPercentageChange2()
    {
        assertEquals("50.0",aptitudeFunction.percentageChange(10, 15));
    }

    @Test
    @DisplayName("fact()=>follows path [1,2,3,7,8]")
    public void testFindFirstNTermsAP1()
    {
        assertEquals("Invalid count input",aptitudeFunction.findFirstNTermsAP(1, 3, -1));
    }

    @Test
    @DisplayName("fact()=>follows path [1,2,4,6,8]")
    public void testFindFirstNTermsAP2()
    {
        assertEquals("1.0",aptitudeFunction.findFirstNTermsAP(1, 3, 1));
    }

    @Test
    @DisplayName("fact()=>follows path [1,2,4,5,4,5,4,6,8]")
    public void testFindFirstNTermsAP3()
    {
        assertEquals("1.0,4.0,7.0",aptitudeFunction.findFirstNTermsAP(1, 3, 3));
    }

    @Test
    @DisplayName("fact()=>follows path [1,3,5,7]")
    public void testSimpleInterest1()
    {
        assertEquals("Either principal value or rate value or time value is invalid",aptitudeFunction.simpleInterest(100, 3, 0));
    }

    @Test
    @DisplayName("fact()=>follows path [1,2,4,6,7]")
    public void testSimpleInterest2()
    {
        assertEquals("20.0",aptitudeFunction.simpleInterest(100, 10, 2));
    }

    @Test
    @DisplayName("fact()=>follows path [1,2,6,8]")
    public void testCompareProfitLoss1()
    {
        assertEquals("Either costPrice value or sellingPrice value is invalid",aptitudeFunction.compareProfitLoss(-100, 100));
    }

    @Test
    @DisplayName("fact()=>follows path [1,3,7,8]")
    public void testCompareProfitLoss2()
    {
        assertEquals("loss: 20.0, loss percent: 20.0%",aptitudeFunction.compareProfitLoss(100, 80));
    }

    @Test
    @DisplayName("fact()=>follows path [1,4,7,8]")
    public void testCompareProfitLoss3()
    {
        assertEquals("profit: 20.0, profit percent: 20.0%",aptitudeFunction.compareProfitLoss(100, 120));
    }

    @Test
    @DisplayName("fact()=>follows path [1,5,7,8]")
    public void testCompareProfitLoss4()
    {
        assertEquals("No profit, No loss",aptitudeFunction.compareProfitLoss(100, 100));
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
