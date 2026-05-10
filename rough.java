public class rough {

    public static void removeDuplicates(int nums[]) {
        int k =1;
        nums[k]=nums[0];
        k++;
        System.out.print(k);
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1])
            {
                nums[k]=nums[i+1];
                k++;
            }
        }
        //printing
        for(int j =0;j<nums.length;j++){
            System.out.print(nums[j]+ " ");
        }
        //return k;
        
    }
    public static void main(String args[]){
        int arr[]={1,1,1,2,3,3,4,4,4,5,5};
        removeDuplicates(arr);
    }
}