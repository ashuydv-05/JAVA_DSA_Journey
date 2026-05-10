package arrays;

public class rotate {
    //ARRAY ROTATION:
    public static void reverse_1(int arr[], int s,int e){
        int i =s;
        int j= e;
        while(i<j){
            //Swapping
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        i++;
        j--;    
        }}
        public static void main(String args[]){
            int ar[]={23,54,6,2,4,6,7,3};
            int b=2;
            int s=0;
            int e = ar.length-1;
            int m=b-1;
            reverse_1(ar , s , m );
            reverse_1(ar, b, e);
            reverse_1(ar,s,e);
            for(int i=0;i<ar.length;i++){
                System.out.println(ar[i]+" ");
            }
        } 
    }

    

