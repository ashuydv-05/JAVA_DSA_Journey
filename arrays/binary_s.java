package arrays;

public class binary_s {
    public static int Binary_s(int num[],int key){
        int start=0, end=num.length-1;
        
        while(start<=end){
            int mid=(start + end)/2;
            if(num[mid]==key){
                //System.out.println("Found the key at index"+mid);
                return mid;
            }
            else if(num[mid]<key){
                start=mid+1;// right 
            }
            else{
                end=mid-1;// left
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={-4,-2,5,6,7,8,34,56,863}; //SORTED ARRAY NEEDED
        int key= 34;
        System.out.println("Found the key at index"+Binary_s(arr,key));
    }
    
}
