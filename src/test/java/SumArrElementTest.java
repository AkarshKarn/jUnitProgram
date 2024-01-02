import org.example.SumArrElement;
import org.junit.Assert;
import org.junit.Test;

public class SumArrElementTest {
    @Test
    public void testSumArr(){
        SumArrElement sumArrElement=new SumArrElement();
        Assert.assertEquals(10,sumArrElement.sumOfArray(new int[]{1,2,3,4}));
    }
}
