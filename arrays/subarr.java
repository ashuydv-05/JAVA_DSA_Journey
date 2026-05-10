package arrays;

public class subarr {
    public static void subarray(int arr[]){
        //int total =0;
        for(int i =0;i<arr.length;i++){
            int start = i; //index no
            for(int j =i;j<arr.length;j++){
                int end = j; //index no
                for(int k = start;k<=end;k++){
                    System.out.print(arr[k]+ " ");
                    
                }
                //total++;
                System.out.println();

                

            }
        }
        //System.out.print(total);
    }
    public static void main(String args[]){
        int num[]={23,4,5,6,7,3,6};
        subarray(num);

    }
    
}
