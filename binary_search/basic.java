package binary_search;

public class basic {
    //binary search fucntion
    public static void bs(int arr[], int target){
        int low =0;
        int high = arr.length-1;
        //int mid = low + (high - low)/2;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                System.out.print("Targert found at:"+ low);
            }
            if(target<=arr[mid]) high=mid-1;
            else low = mid +1;
        }
    }
    public static void main(String args[]){
        int arr[]={23,45,65,78,99,567};
        int num= 567;
        bs(arr,num);
        
    }
    
}

