package arrays;
/* {2,4,7,9,5}
these are the following pairs.
2,4 2,7 2,9 2,5
4,7 4,9 4,5
7,9 7,5
9,5
 */
public class pair {
    // declare array outside the loop then return.
    //public static int[] pairs(int arr[]){
    public static void pairs(int arr[]){
        int xyz[] = new int[35];
        for(int i =0;i<arr.length;i++){
            //System.out.println("enter first ");
            for(int j= i+1;j<arr.length;j++){
               // System.out.println("enter second");
                //pairs_1[] ={ i, j};
                 xyz[0]= arr[i];
                 xyz[1]= arr[j];
                //System.out.println(xyz); wrong way to print the arrays. this print 
                //memory address location
                //System.out.println("array filled ");
                 //return new int[]{arr[i], arr[j]};
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
             //System.out.println();
        }
        
        //return pairs_1;
        //return new int[0];
    }
    public static void main(String args[]){
        int  arr_1[]={12,43,54,};
        pairs(arr_1);
       
    }
    
    
}
