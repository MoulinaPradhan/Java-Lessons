

import java.util.Arrays;

public class BoxesInTruck {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {

Arrays.sort(boxTypes,(a,b) ->b[1]-a[1] );
int result=0;
for(int i=0;i<boxTypes.length;i++){
    int boxes = boxTypes[i][0];
    int units= boxTypes[i][1];
    if(boxes <= truckSize) {
        truckSize -= boxes;
        result += boxes * units;
    }else {
        result += units * truckSize;
        truckSize = 0;
        return result;
    }
}
return result;
    }
}
