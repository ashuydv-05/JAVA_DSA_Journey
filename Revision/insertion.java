package Revision;
//insertion sort
/*CONCEPT - PICK ONE ELEMENT FROM UNSORTED PART/STORE IT 
COMPARE ITS VALUE TO PREVIOUS ONE (IF> STORE / MODIFIY THE POSITON 
PRE + 1 WITH CURRENT PRE, )

 */
public class insertion {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertion(int arr[]){
        //picking up elements
        for(int i = 1;i<arr.length;i++){
            int curr = arr[i]; //storing element for comparision
            int prev = i-1;
        
        //updating the values
        while(prev>=0 && arr[prev]>curr){
            arr[prev+1]=arr[prev];
            prev--;

        }
        //gives postion where to insert
        arr[prev+1]=curr;
         }

         //printing
         print(arr);
    }
    public static void main(String args[]){
        int ar[] ={ 5,4,2,1,3};
        insertion(ar);
    }
}

