package src.LeetCode;
import java.util.*;

/**
 * Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

 

Example 1:

Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.
Example 2:

Input: date = "2019-02-10"
Output: 41
Example 3:

Input: date = "2003-03-01"
Output: 60
Example 4:

Input: date = "2004-03-01"
Output: 61

 */

public class DayOfYear {
    public static int dayOfYear(String date) {
        int month = Integer.parseInt(date.substring(5,7));
        int year = Integer.parseInt(date.substring(0,4));
        int day = Integer.parseInt(date.substring(8));
        Map<Integer, Integer> map = new HashMap<>();
        int daysSoFar = 0;
        map.put(1,31);
        map.put(2,28);
        map.put(3,31);
        map.put(4,30);
        map.put(5,31);
        map.put(6,30);
        map.put(7,31);
        map.put(8,31);
        map.put(9,30);
        map.put(10,31);
        map.put(11,30);
        map.put(12,31);
        
        for(int i = 1; i < month; i++){
            daysSoFar += map.get(i);
        }
        
        daysSoFar += day;
        
        boolean leap = false;
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) leap = true;
        if(leap && month > 2){
            daysSoFar += 1;
        }
        
        return daysSoFar;
    
    }
    public static void main(String[] args) {
        String date = "2019-01-09";
      System.out.println(dayOfYear(date));
    }
}
