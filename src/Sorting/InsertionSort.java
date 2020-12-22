package src.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={5,7,2};
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
          for(int j=i-1;j>=0;j--){
            if(arr[j+1]<arr[j]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
              arr[j]=temp;
             
            }
              }
        }
        for(int e :arr){
            System.out.println(e);
        }
    }
}
