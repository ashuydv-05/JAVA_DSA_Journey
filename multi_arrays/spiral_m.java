package multi_arrays;

public class spiral_m {
    public static void spiral(int matrix[][]){
        int n = matrix.length;
        int m= matrix[0].length;
        int start_row=0;
        int end_row=n-1; // due to indexing
        int start_col=0;
        int end_col=m-1;

        while(start_row <= end_row && start_col <= end_col){
            //top
            for(int i = start_col;i<=end_col;i++){
                System.out.print(matrix[start_row][i]+ " ");
            }
            //right
            for(int i = start_row +1;i<=end_row;i++){
                System.out.print(matrix[i][end_col]+ " ");
            }
            //bottom
            for(int i = end_col-1;i>=start_col;i--){
                // if(start_row==end_row){
                //     break;
                // }
                System.out.print(matrix[end_row][i]+ " ");
            }
            //left
            for(int i = end_row -1;i>=start_row+1;i--){
                // if(start_col == end_col){
                //     return;
                // }
                System.out.print(matrix[i][start_col]+ " ");
            }
            start_col++;
            start_row++;
            end_col--;
            end_row--;
            
        }
        System.out.println();
    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4,},
                        {5,6,7,8,},
                        {9,10,11,12},
                        {13,14,15,16}};
        int matrix1[][]={{1,2,3,4,5}};                
        spiral(matrix);      
        spiral(matrix1);       
    }
    
}
