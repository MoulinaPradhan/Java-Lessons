package src.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={2,1,4,3,7,9};
       
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;i++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                  arr[j]=temp;
                 
                }
            }
        }
       for(int item :arr){
           System.out.print(item+ " ");
       }
    }
}
