package sorting;

public class bubble {
    public static void bubble(int arr[]){
        for(int turn =0; turn<arr.length-1;turn++){
            for(int j =0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swaapp
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
     public static void bubble_2(int arr[]){
        for(int turn =0; turn<arr.length-1;turn++){
            int swap =0;
            for(int j =0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swaapp
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                System.out.println("Array already sorted"); 
                break;
            }
            
            
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]){
        //int ar[]={1,4,6,7,3,8,9};
        int arr[]={2,1,3,4,5,6};
        // bubble(ar);
        bubble_2(arr);
    }
    
}
