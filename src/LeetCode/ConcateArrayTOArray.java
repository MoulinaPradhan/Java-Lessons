
import java.util.Map;

public class ConcateArrayTOArray {
    public boolean canFormArray(int[] arr, int[][] pieces) {
   Map<Integer,int[]> map = new HashMap<>();
    for(int i=0; i< pieces.length; i++){
map.put(pieces[i][0],pieces[i]);
    }
    int i=0;
    while(i<arr.length){
        int num=arr[i];
        if(!map.containsKey(num)){
            return false;
        }
        int [] piece = map.get(num);
        int j=0;
        while( j < piece.length){
            if(piece[j] != arr[i]){
                return false;
            }
            j++;
            i++;
        }
    }
    return true;
    } 
}
