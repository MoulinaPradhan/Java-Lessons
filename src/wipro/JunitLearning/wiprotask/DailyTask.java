package JunitLearning.wiprotask;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DailyTask {
    class TestStringConcat{
     
    }
public static String doStringConcat (String s1, String s2){
    return s1+" "+s2;
}
@Test
public void testDoStringConcat(){
    assertEquals("24 25", doStringConcat("24", "25"));

}
}

