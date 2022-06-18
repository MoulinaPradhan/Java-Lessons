import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class checkTest {
    public static void main(String[] args) {
        
    }
    public static int higher(int x, int y){
        if(x> y) return x;
        return y;
    }
    @Test
public void testHigher(){
    assertEquals(25, higher(24, 25));
    assertEquals(4, higher(3, 4));
}
}



