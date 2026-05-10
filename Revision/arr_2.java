package Revision;

public class arr_2 {
    //SEARCHING ALGO
    //LINEAR
    public static void linear(int arr[], int key){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.print("KEY FOUND AT INDEX"+ i);
            }
        }
    }
    //BINARY SEARCH
    public static void binear(int arr[], int key){
        int start=0;
        int end=arr
    }

    //LARGEST ELEMENTS IN ARRAY
    public static void large(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            // if(max<arr[i]){
            //    max=arr[i];
            // }
            max=Math.max(arr[i],max);
        }
        System.out.print(max);
    }
    //SMALLEST 
      public static void small(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            // if(min>arr[i]){
            //    min=arr[i];
            // }
            min=Math.min(arr[i],min);
        }
        System.out.print(min);
    }


    public static void main(String args[]){
        int ar[]={-2,-3,-4,-5,-6,-24,-34,-1};
        int key= 34;
        //linear(ar,key);
        large(ar);
        small(ar);
    }
    
}
