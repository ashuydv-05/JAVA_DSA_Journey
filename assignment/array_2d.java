package assignment;

/*Print the number of 7’s that are inthe 2d array.
array = { {4,7,8},{8,8,7} }; OUTPUT -2;

Print out the sum of the numbers inthe second row of the “nums” array
nums = { {1,4,9},{11,4,3},{2,2,3} } OUTPUT - 18;

Write a program to FindTransposeofa Matrix.

 */

public class array_2d {
    // SOLUTION - 01;
    public static void sol_1(int arr[][]){
        int count =0,  key =7;
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(key==arr[i][j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    //SOLUTION -02;
     public static void sol_2(int arr[][]){
        int sum =0;
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(i==1) sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }

    //TRANSPOSE
    public static void transpose(int arr[][]){
        int trans[][]=new int[arr[0].length][arr.length];
         for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                trans[j][i]=arr[i][j];
            }
        }
        //printing
        for(int i =0;i<trans.length;i++){
            for(int j = 0;j<trans[0].length;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }

    //SOLUTION - 03;


    public static void main(String args[]){
        int arr[][]={{1,2,3},
                     {4,5,6}};
        // sol_1(arr);

        //int arr[][]={ {1,4,9},
                    //   {11,4,3},
                    //   {2,2,3} };
        transpose(arr);
        
        
    }
    
}
