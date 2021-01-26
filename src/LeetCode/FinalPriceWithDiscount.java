package src.LeetCode;
import java.util.*;

public class FinalPriceWithDiscount {
public static void main(String[] args) {
    int prices[]= {8,4,6,2,3};
    int i;
    int j;
    int[] out = new int[prices.length];
    
    for(i = 0; i < prices.length; i++)
    {
        out[i] = prices[i];
    }
    
    
    for(i = 0; i < prices.length - 1; i++)
    {
        for(j = i + 1; j < prices.length; j++)
        {
            if(prices[i] >= prices[j])
            {
                out[i] = prices[i] - prices[j];
                break;
            }
        }
        
    }
    out[i] = prices[i];
    System.out.println(out);


}    
}
