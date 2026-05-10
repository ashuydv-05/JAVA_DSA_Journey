package Revision;

public class array_2 {
    //MIN MAX SINGLE LOOP
    public static void max_min(int arr[]){
        int n= arr.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i < n;i++){
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
        }
        System.out.print("MAX ="+ max);
        System.out.print("MIN ="+ min);
    }

    //FIND MISSING elements
      public static void missing(int arr[]){
        int n= arr.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        boolean check = false;
        for(int i=0;i < n;i++){
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);   
        }
        System.out.println(max );
        System.out.println(min );
        // int len= max-min+1;
        // int all[]=new int[len];
        for(int i= min;i<=max;i++){ //KEY
            for(int j =0;j<n;j++){
                if(i==arr[j]){
                    check = true;
                    System.out.println(i+"is present at "+ j);
                }
            }
        }
    }

    //SEGREGATE 1S &0S
    public static void segregate(int arr[]){
        int n =0; //num of zero;
        int m = 0; //nums of ones;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) n++;
            else m++;
        }
        for(int i =0;i<arr.length;i++){
            if(i<n) arr[i]=0;
            else arr[i]=1;

            System.out.println(arr[i]+" ");
        } 
    }
   public static void segregate_1(int arr[]){
    int i = 0;
    int j = arr.length - 1;
    while (i < j) {
        if (arr[i] == 0) {
            i++;
        } else if (arr[j] == 1) {
            j--;
        } else {
            // Swap when arr[i] == 1 and arr[j] == 0
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    //printing
    for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");
         }
    }

    //WAVE
    public static void wave(int arr[]){
        for(int i =0;i<arr.length;i++){
            if(i%2==0){
                //swap
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1]=temp;
            }
        }
        //printing;
         for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
         }
    
    }

    public static void main(String args[]){
        // int ar[]={-2,-1,-3,45,6,7,4656};
        // max_min(ar);
        //int i[]={1,2,3,5};
        //missing(i);
        // int arr[]={ 0,1,0,1,1,0};
        // segregate_1(arr);
        int arr[]= {1,2,3,4,5,6,7,8};
        wave(arr);

    }

    
    }

    

