package sorting;

public class selection {
    public static void selection(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            int minPos = i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[minPos] > arr[j] ){
                    minPos=j;
                }
            }
            //swapping
            int temp= arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        //printing
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]){
        int ar[] = {5,4,3,6,1,2};
        selection(ar);
    }
    
}
