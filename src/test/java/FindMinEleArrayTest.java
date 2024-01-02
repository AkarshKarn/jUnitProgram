import org.example.FindMinEleArray;
import org.junit.Assert;
import org.junit.Test;

public class FindMinEleArrayTest {
    @Test
    public void testFindMin(){
        FindMinEleArray findMinEleArray= new FindMinEleArray();
        Assert.assertEquals(1,findMinEleArray.findMinArr(new int[]{1,5,8,4,9,6}));
    }
}
