public class productOfNumbers {
   public static void main(String[] args) {
       System.out.println(pro(100, 5));
   } 
   public static int pro (int x, int y){
if(x ==0 || y ==0) return 0;
else if(x==1) return y;
else if( y ==1) return x;
return x+pro(x,y-1);
   }
}
