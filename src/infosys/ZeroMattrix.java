// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.




public class ZeroMattrix {
    public static void main(String[] args) {
        int mat[][]={{4,2,0,6},{3,2,9,7},{1,9,2,0},{3,6,1,4}};

        int rows[] = new int [mat.length];
        int cols[] = new int[mat[0].length];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j] ==0){
                    rows[i]=-1;
                    cols[j] =-1;
                }
            }
        }

        for(int i=0;i<rows.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(rows[i] ==-1){
                    mat[i][j]=0;
                }
       
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<cols.length;j++){
                if(cols[j] == -1){
                    mat[i][j] =0;
                }
            }
        }
        }

    }