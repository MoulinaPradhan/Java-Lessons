public class FindPin {
    public static void main(String[] args) {
        System.out.println(findPain(3521, 2452, 1352,37));
    }
    public static int even =0;
    public static int odd =0;
    public static int findPain(int ip1,int ip2,int ip3,int ip4){
        int ans = 0;
        sum(ip1) ;sum(ip2);sum(ip3);
        if(ip4%2==0){
        ans =even -odd;
     
        }else{
            ans = odd-even;
        }
return ans;
    }
    public static void sum(int ip){
        while(ip>0){
            int rem =ip%10;
            if(rem%2==0){
                even+=rem;
            }else{
                odd+=rem;
            }
            ip=ip/10;
        }
    }
}
