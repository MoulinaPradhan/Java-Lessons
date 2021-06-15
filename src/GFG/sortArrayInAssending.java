public class sortArrayInAssending {
    static void rearrangeEvenAndOdd(int arr[], int n)
    {
       
        int j = -1,temp;
     
 
        for (int i = 0; i < n; i++) {
     
            if (arr[i] % 2 == 0) {
                 j++;
     
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //next traversal for odd
        int k=-1;
        for (int i = 0; i < n; i++) {
     
            if (arr[i] % 2 == 0) {
                if(arr[i]%5 ==0){
                if(arr[i] < arr[i+1]) {    
                temp = arr[i];    
                arr[i] = arr[i+1];    
                arr[i+1] = temp;    
                    }     

                    k++;
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                
            }
                 
            }else{
                if(arr[i]%5 ==0){
                    
                    k++;
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                
            }
            }
        }

    }
     
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 2,10,4,20,1,7,3,5};
        int n = arr.length;
     
        rearrangeEvenAndOdd(arr, n);
     
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
