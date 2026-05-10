package sorting;
// best & efficent for ranges. O(n+range)

public class counting {
    public static void counting(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
             largest =Math.max(largest,arr[i]);
        }
        //creating count for frequn storing.
        int count[]= new int[largest+1];
        for(int i =0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i =0;i<count.length;i++){
            while(count[i]>0){
                arr[j]= i;
                j++;
                count[i]--;
            }
        }
        //printing
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String args[]){
        int i[] = {3,5,7,8,5,3,6,2,4,7,3,53,6};
        counting(i);
    }
    
}
