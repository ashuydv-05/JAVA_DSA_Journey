package multi_arrays;
import java.util.*;
public class ip_op {
    //SEARCHING A NUMBER
    public static void search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j= 0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.print("key is found at"+ "("+i+","+j+")");
                }     

            }
        }
        System.out.print("Key not found");
    }
    //MAX VALUE;
    public static void Max(int matrix[][]){
        int max= Integer.MIN_VALUE;
          for(int i=0;i<matrix.length;i++){
            for(int j= 0;j<matrix[0].length;j++){
                //max=Math.max(matrix[i][j],max);
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.print("Max value ="+ max);

    }
    public static void main(String args[]){
        System.out.print("Enter the number for matix 3X3");
        //2d declaration
        int matrix[][]= new int[3][3];
        int n=3;
        int m=3;
        // int n = matrix.length = for row length
        // int m = matrix[0].length = for column length of first row
        Scanner sc = new Scanner(System.in);
        //taking user input
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //printing the array
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");

            }
            System.out.println();
        }
        //search(matrix,5);
        Max(matrix);

    }   
}
