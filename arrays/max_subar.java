package arrays;
//BRUTE FORCE TIME COMPLEXITY ON3
public class max_subar{
    public static void subarray(int arr[]){
        int cursum=0;
       
        int maxsum = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            int start = i;
            for(int j =i;j<arr.length;j++){
                int end = j;
                cursum=0;
                for(int k = start;k<=end;k++){
                    
                    cursum+=arr[k];  
                    
                    System.out.println(arr[k]+ " ");
                    System.out.println("Current sum=" + cursum); 
                    
                }
                if(cursum>maxsum){
                    maxsum= cursum;
                }
                System.out.println();
            }
        }
        System.out.print("Maximum sub ="+maxsum);
        
    }
    public static void main(String args[]){
        int num[]={-2,3,4};
        subarray(num);

    }
    
}
