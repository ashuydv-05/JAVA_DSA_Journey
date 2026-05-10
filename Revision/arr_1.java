package Revision;
//pass by reference
public class arr_1 {
    public static int[] update(int ar[]){
        //int arr[]={1,2,3};
        for(int i= 0; i<ar.length;i++){
            ar[i]++;
        }
        return ar;
    }
    public static void main(String args[]){
        int arr[]={1,2,3};
        update(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
