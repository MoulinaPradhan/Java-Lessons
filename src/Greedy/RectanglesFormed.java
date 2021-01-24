package src.Greedy;

public class RectanglesFormed {
    public int countGoodRectangles(int[][] rectangles) {  
	int ans = -1;
	int count = 0;

	for (int[] rectangle : rectangles) {

		int min = Math.min(rectangle[0], rectangle[1]);
		if (min > ans) {
			ans = min;
			count = 1;
		} else if (min == ans)
			count++;
	}

	return count;
}
    public static void main(String[] args) {
        int  rectangles[][] = { {5,8},{3,9},{5,12},{16,5}};
       
    }
}
