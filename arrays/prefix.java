package arrays;
//TIME COMPLEXICITY O(n2)
public class prefix {
    public static void perfix_s(int num[]){
        //create new prefix array
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix_sum[] = new int[num.length];
        prefix_sum[0]=num[0];
        for(int i =1;i<num.length;i++){
            prefix_sum[i]=num[i]+prefix_sum[i-1];
        }
        for(int i=0;i<=num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){ //irrespective of j=i or j=j+1
                int end=j;
                cursum = start ==0? prefix_sum[0]: prefix_sum[end]-prefix_sum[start-1];
            }
            if(cursum>maxsum){
                maxsum=cursum;
            }

        }
        System.out.println();
        System.out.print("MAX SUM =" + maxsum);
        
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        perfix_s(arr);
    }
    
}
