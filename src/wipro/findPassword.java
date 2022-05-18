import java.util.*;
import java.io.*;
public class findPassword
{
      public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
     System.out.println(findpassword(a,b,c,d,e));
        sc.close();

    }
    public static int stable(int n)
    {
        int first=n%10;
        int c=n;
        Map<Integer, Integer> map= new HashMap<>();
        while(n>0)
        {
            int d=n%10;
        map.put(d,map.getOrDefault(d, 1)+1);
            n=n/10;
        }
        int check=map.get(first);
        while(c>0)
        {
            int d=c%10;
            if(map.get(d)!=check)
            return 0;
            c=c/10;
        }
        return 1;
    }
    public static int findpassword(int input1,int input2,int input3,int input4,int input5)
    {

        int stablenumber=stable(input1)+stable(input2)+stable(input3)+stable(input4)+stable(input5);
        int notstable=5-stablenumber;
        return (notstable*10)+stablenumber;

    }
 
}