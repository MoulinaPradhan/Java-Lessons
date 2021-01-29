package src.LeetCode;

public class ShuffleArray {
    public static void main(String[] args) {
        int nums[]={ 2,5,1,3,4,7 };
        int n=3;
        int arr[]=new int [nums.length];
    

        for(int i=0;i<arr.length;i++){
       
            if(i%2 ==0){
                arr[i]=nums[i/2];
               
       
               
            }else arr[i]=nums[i/2+n];
         }   
        
  
  
    for(int e: arr)System.out.print(e);
  
  
  
  
  
    }




}
