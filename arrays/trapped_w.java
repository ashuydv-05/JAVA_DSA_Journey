package arrays;

public class trapped_w {
    public static void trappedwater(int arr[], int width){
        int n = arr.length;
        //LEFT MAX
        int LM[]=new int[n];
        LM[0]=arr[0];
        for(int i=1;i<n;i++){
            LM[i]=Math.max(arr[i],LM[i-1]);
        }

        //RIGHT MAX
        int RM[]=new int[n];
        RM[n-1]=arr[n-1];
        for(int i = n-2;i>=0;i--){
            RM[i]=Math.max(arr[i],RM[i+1]);
        }
        //loop;
        int trappedwater=0;
        for(int i =0;i<n;i++){
            int waterlevel=Math.min(LM[i],RM[i]);
            int waterstore = ((waterlevel-arr[i])* width) ;
            trappedwater+=waterstore;
        }
        System.out.println("Total trapped water = "+trappedwater);
            //return not mandatory;
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        trappedwater(height,2);

    }

    
}
