import org.example.FindMaxEleArray;
import org.junit.Assert;
import org.junit.Test;

public class FindMaxEleArrayTest {
    @Test
    public void testFindMax(){
        FindMaxEleArray findMaxEleArray = new FindMaxEleArray();
        Assert.assertEquals(9,findMaxEleArray.findMax(new int[]{1,3,8,9,5,3}));
    }
}
