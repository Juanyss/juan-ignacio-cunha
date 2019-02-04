import org.junit.Assert;
import org.junit.Test;


public class SimpleTest {

    //Had to add a plugin to compile with java 1.8 or change settings on IntelliJ
    @Test
    public void candidateTest(){
        Candidates test1 = new Candidates();

        Assert.assertEquals(8,test1.candidates().size());
        // Compare number of candidates

    }

}
