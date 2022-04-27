public class MaxMin {
    public static void main(String[] args) {
     int n =3,k=15;
	 int a[]={4 ,9 ,8};
	 int l[] = {1,4,1};
	 int r[] ={1,7,9};

	 System.out.println(isPossible(n, k, a, l, r));
    }
	public static int isPossible(int n, int k, int[] a, int[] l, int[] r) {
		int sum =0;
		for(int i=0;i<n;i++){
			sum += a[i];
		}
		
		if(Math.abs(sum - k)%2 ==0) return 1;
		else return 0;
	}
}

