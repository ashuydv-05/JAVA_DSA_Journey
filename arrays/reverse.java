package arrays;
//reverse of array 
public class reverse {
    public static void rev(int arr[]){
        int first=0, last=arr.length -1;
        System.out.println("Enter function");
        while(first<last){
            System.out.println("Enter loop");
            //SWAPPING
            int temp = arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
            System.out.println("loop complete");

        }
        System.out.println("out of the loop");

        
    }
    public static void main(String args[]){
        int arr[]={2,5,745,14,7,-4};
        rev(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    
}
