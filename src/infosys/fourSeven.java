

public class fourSeven {
    public static void main(String[] args) {
        String s= "3,1,6,4,2,3,7,2";
        String arr[] = s.split(",");

     boolean visi[]= new boolean[arr.length];
     boolean flag=false;
     for(int i=0;i<arr.length;i++){
         if(arr[i].equals("4")) flag = true;
         visi[i]=flag;
         if(arr[i].equals("7")) flag = false;
     }
   
int sum =0;String str="";
for(int i=0;i<arr.length;i++){
    if(visi[i]){
      str+=arr[i];
    }else{
        sum+=Integer.parseInt(arr[i]);
    }
}
int newSum = Integer.parseInt(str)+sum;
System.out.println(newSum);


    }


}
