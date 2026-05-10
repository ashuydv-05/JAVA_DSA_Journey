package arrays;

//ALL THE BELLOW CODES ARE BULLSHIT BUT LEARNED MANY MORE STUFF


public class kadane {
    //👌 best code below

    public static void kadane_best(int num[]){
        int cs=num[0];
        int ms=num[0];
        for(int i=1;i<num.length;i++){
            cs=Math.max(num[i],cs+num[i]);
             ms=Math.max(ms,cs);
            }
             System.out.print(ms);
    }
    // BEST OPTIMIZED. KADANE ENDS HERE.

    public static void kadane_2(int num[]){
        boolean n=false; //why initialised.
        for(int i =0;i<num.length;i++){
            if(num[i]<0){
                n=true;   
            }
        }
        if(n==false){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            cs+=num[i];
            if(cs<0){
                cs=0;
            }
           ms=Math.max(cs,ms);
        }
         //ms=Math.max(cs,ms);
        
        System.out.print(ms);}


        if(n==true){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            cs+=num[i];
             ms=Math.max(cs,ms);
        }
        
       
        System.out.print(ms);

        }

    }


    public static void main(String args[]){
        int arr[]={-2,3};
        int arr_2[]={-4,-3,-5};
        kadane_best(arr_2);
    }
}
