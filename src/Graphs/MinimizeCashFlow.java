//  _______         _______
//  | 0   |___1000_>|   1  |         
//  |_____|         |______|
//       \           /
//        \         /  5000
// 2000    \       /
//          V_____v      
//         |   2  | 
//         |______|

public class MinimizeCashFlow {

    public static int getMax(int ammount[]){
        int maxId=0;
        for(int i=1;i<ammount.length;i++){
            if(ammount[i]> ammount[maxId] ){
                maxId=i;
            }}
            return maxId;
        
    }
    public static int getMin(int ammount[]){
        int minId=0;
        for(int i=1;i<ammount.length;i++){
            if(ammount[i]< ammount[minId] ){
                minId=i;
            }}
            return minId;
        
    }
    public static void minCashFlowRec(int amount[]){
        int mxCredit = getMax(amount);
        int mxDebit = getMin(amount);
        if (amount[mxCredit] == 0 && amount[mxDebit] == 0)
        return;
        int min = Math.min(-amount[mxDebit], amount[mxCredit]);
        amount[mxCredit]-=min;
        amount[mxDebit] += min;

        //If the minimum is the maximum amount to be
        System.out.println("Person "+mxDebit+" pays "+min +" to person "+mxCredit);
   minCashFlowRec(amount);
    }
  
    public static void minCashFlow(int graph[][]){
        int n = graph.length;
        int amount[] = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                amount[i] += graph[j][i]-graph[i][j];
            }
        }
        minCashFlowRec(amount);
    }
  
    public static void main(String[] args) {
    // graph[i][j] indicates the amount
        // that person i needs to pay person j
        int graph[][] = { {0, 1000, 2000},
                            {0, 0, 5000},
                            {0, 0, 0},};
     
  minCashFlow(graph);
                        
}  
}
