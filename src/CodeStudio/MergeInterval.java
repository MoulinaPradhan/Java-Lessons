import java.util.*;

 class Interval {
    int start; int finish;

    Interval(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}
public class MergeInterval {
   public static void main(String[] args) {
       Interval intervals[] = new Interval[5];
       intervals[0] = new Interval(1,4);
       intervals[1]= new  Interval(3,5);
       intervals[2] = new Interval(6, 8);
       intervals[3] = new Interval(10, 12);
       intervals[4] = new Interval(8, 9);

       List<Interval> list = new ArrayList<>();
       list = mergeIntervals(intervals);
       for(Interval e: list){
           System.out.println(e.start+" "+e.finish);
       }
    // System.out.println(mergeIntervals(intervals));
   } 
   public static List<Interval> mergeIntervals(Interval[] intervals) {
    List<Interval> list = new ArrayList<>();
    Arrays.sort(intervals,(a,b)->a.start-b.start);
    list.add(intervals[0]);
    for(int i=1;i<intervals.length;i++){
        if(list.get(list.size()-1).finish >= intervals[i].start){
            list.get(list.size()-1).finish =Math.max(intervals[i].finish, list.get(list.size()-1).finish);
        }else
        list.add(intervals[i]);
    }
    // System.out.println(list.get(0).start+"  "+list.get(0).finish);
    return list;   
}
}
