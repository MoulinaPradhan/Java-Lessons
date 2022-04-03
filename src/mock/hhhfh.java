import java.util.*;
import java.io.*;
import java.lang.Math;
public class hhhfh
{
    public static int calculateMoney(int N, int Q, int[] A, int[] B, int[] L, int[] R)
    {
        int result = 0;
        for(int i=0;i<Q;i++){
            for(int j=0;j<N;j++){
                if(B[j]>=L[i]&& B[j]<=R[i])
                result+=A[j];
            }
            if(i==0)
               System.out.println(result);
            else
              System.out.println(" "+result);
            result=0;
        }
        return 0;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String ip[] = new String[2];
        ip = sc.nextLine().split(" ");
        int N = Integer.parseInt(ip[0]);
        int Q = Integer.parseInt(ip[1]);
         
        String AString[] = new String[N];
        AString= sc.nextLine().split(" ");
        int[] A = new int[N];
        for(int i=0; i<N;i++)
        {
            A[i] = Integer.parseInt(AString[i]);
        }
        String BString[] = new String[N];
        BString= sc.nextLine().split(" ");
        int[] B = new int[N];
        for(int i=0;i<N;i++)
        {
            B[i] =  Integer.parseInt(BString[i]);
        }
        int L[] = new int[Q];
        int R[] = new int[Q];
        for(int i=0;i<Q;i++)
        {
            String op[] = new String[2];
            op= sc.nextLine().split(" ");
            L[i] = Integer.parseInt(op[0]);
            R[i] = Integer.parseInt(op[1]);
        }
        sc.close();
        calculateMoney(N,Q,A,B,L,R);
    }
}
