public class previousSlot {
    public static void main(String[] args) {
        String s ="5624381275";
        int n = s.length()/2;
        int arr[] = new int[n];
        int j=1;
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(String.valueOf(s.charAt(j)));
            arr[i] = arr[i]*arr[i];
            j=j+2;
        }
        for(int r:arr){
            System.out.println(r);
        }
    }
}
