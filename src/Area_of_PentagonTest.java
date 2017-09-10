import org.junit.Assert;

import static org.junit.Assert.*;

public class Area_of_PentagonTest {
    @org.junit.Test
   // Tests the code with expected value
    public void area() throws Exception {
        double expected = 45.67799834619069;
        System.out.println(Area_of_Pentagon.Area(5));
        Assert.assertEquals( expected , Area_of_Pentagon.Area(5), 0.002 );
    }


}