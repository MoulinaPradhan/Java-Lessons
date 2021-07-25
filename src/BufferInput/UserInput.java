import java.io.*;



public class UserInput {
 public static void main(String[] args) throws IOException {
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(sc.readLine());
while(t-->0)
{
    String input[] = sc.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
     int m = Integer.parseInt(input[1]);
     
     int [][]arr = new int[n][m];
     
     for(int i=0;i<n;i++){
      input = sc.readLine().split(" ");
      for(int j=0;j<m;j++){
          arr[i][j] = Integer.parseInt(input[j]);   
     }
} 


System.out.println("Print the array :");
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        System.out.print(arr[i][j]+" ");
 }   
}
}
 }
}
