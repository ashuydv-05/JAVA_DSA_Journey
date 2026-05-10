package sorting;


public class insertion {
    public static void insertion(int arr[])
    { /*picking elements from sorted array with
        index 1; 
        */
        for(int i =1;i<arr.length;i++){
            int curr=arr[i];
            //int curr=i;
            int prev =i-1;
            //this would return prev value.
            while(prev>=0 && arr[prev]> curr){
                arr[prev+1]= arr[prev];
                prev --;
            }
            arr[prev+1]=curr;
        }
        // printing
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
    public static void main(String args[]){
        int ar[]={5,1,4,3,6,2};
        insertion(ar);
        
    }
    
}
