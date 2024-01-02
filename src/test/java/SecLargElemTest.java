import org.example.SecLargElem;
import org.junit.Assert;
import org.junit.Test;

public class SecLargElemTest {
    @Test
    public void secondLargest(){
        SecLargElem secLargElem=new SecLargElem();
        Assert.assertEquals(6,secLargElem.secondLargestElement(new int[]{1,2,3,4,5,6,7}));
    }
}
