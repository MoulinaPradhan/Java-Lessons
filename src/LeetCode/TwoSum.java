

import javax.lang.model.element.Element;

public class TwoSum {
    public static void main(String[] args) {
        int numbers[] ={2,7,11,15};
        int target =9;
int i=0;
        int a=0,b=0;
        int j=numbers.length-1;
        while(i <j){
            if(numbers[i] + numbers[j] == target){
                a=i+1;
                b=j+1;
            }
            else if( numbers[i]+numbers[j] < target){
                i++;
            }
            else{
                j--;
            }
        }
        
   
        int arr[]= {a,b};
       for(int e:arr)System.out.println(e);
    }
}
