package assignment.arrays;
/*Given an integer array nums, return true if any value 
appears at least twice in the array, and return false if
 every element is distinct.
 */
public class check_re {
    public static boolean repeat(int arr[]){
        int n= arr.length;
        
        for(int i =0;i<n;i++){
            for(int j = i+1;j<n;j++){
                
                if(arr[i]==arr[j]){
                    
                    return true;
                
                }
            }
        }
        return false;
    }
        
        //System.out.print(repe);
    public static void main(String args[]){
        int num[]={1,2,3,1};
        //repeat(num);
        System.out.print(repeat(num));
    }
    
}
