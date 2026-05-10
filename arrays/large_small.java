package arrays;


public class large_small {
    public static int large(int n[]){
        int large =Integer.MIN_VALUE;// - infinity
        for(int i =0;i<n.length;i++){
            if(n[i]>large){
                large=n[i];
            }
            
        }
        return large;
    }
    public static int small(int n[]){
        int small=Integer.MAX_VALUE; // +ve infinity
        for(int i=0;i<n.length;i++){
            if(n[i]<small);
            small=n[i];
        }
        return small;
    }
    public static void main(String args[]){
        int num[]={-4,2,43,1};
        //large(num);
        System.out.println(large(num));
        //smallest
        System.out.println(small(num));
    }
    
}

/* HAVING DOUBT CHECK NOTES

 */
