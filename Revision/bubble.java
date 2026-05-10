package Revision;
//BUBBLE SORT
public class bubble {
    public static void print(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubble_1(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            System.out.println("num of outer loop"+i);
            int swap = 0;
        for(int j =0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                //SWAP
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap++;
                System.out.println("swapping");
            }
        }
         if(swap==0){
            System.out.println("Array already sorted");
            break;
         }
    }
    print(arr);
    }
    public static void main(String args[]){
        int arr[]={2,3,4,5,1};
        bubble_1(arr);
    }
    
}
