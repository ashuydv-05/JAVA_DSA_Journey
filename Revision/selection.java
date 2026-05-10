package Revision;

public class selection {
    public static void print(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selection(int arr[]){
        for(int j =0;j<arr.length;j++){
        //position where to fill 
        int min = Integer.MAX_VALUE;
        for(int i =j;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                }
        }
    }
        print(arr);
    }
    public static void main(String args[]){
        int ar[]= {5,1,2,4,3};
        selection(ar);


    }
}
