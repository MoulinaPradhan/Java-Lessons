
import java.util.ArrayList;

public class NumbersSmaller {
    public static void main(String[] args) {
        int nums[]={8,1,2,2,3};
        int result[]=new int[nums.length];

        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    result[i]++;
                }
            }
        }
        // return result;
  



System.out.println("-----");
for(int e: result)System.out.println(e);

    }
}
