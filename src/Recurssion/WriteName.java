public class WriteName {
    public static void main(String[] args) {
        name("Moulina", 0);
        oneToN(1, 10);
        NToOne(10, 1);
    }
    public static  void name (String s,int count){
        if(count==5)return;
        System.out.println(s); // T.C - O(n) 
        name(s, count+1);      // S.C- O(n) (internal stack memory)
    }
    // print 1-N
public static void oneToN(int start,int n){
if(start> n)return;
System.out.println(start);
oneToN(start+1, n);
    }

    // print N-1
    public static void NToOne(int start,int n){
        if(start<n) return;
        System.out.println(start);
        NToOne(start-1, n);
    }
}
