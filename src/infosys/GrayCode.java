// https://practice.geeksforgeeks.org/problems/gray-code-1611215248/1/#
import java.util.ArrayList;

public class GrayCode {
    public static void main(String[] args) {
        System.out.println(graycode(4));
    }
    public static ArrayList<String> graycode(int n){
        if(n==1){
            ArrayList<String> list = new ArrayList<>();
            list.add("0");
            list.add("1");
            return list;
        }
        ArrayList<String> ans = graycode(n-1);
        ArrayList<String> small = new ArrayList<>();
        for(int i=0;i<ans.size();i++){
            small.add("0"+ans.get(i));
                }

                for(int i=ans.size()-1;i>=0;i--){
                    small.add("1"+ans.get(i));
                }
                return small;
            }
        }

