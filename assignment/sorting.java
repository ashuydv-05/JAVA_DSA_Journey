package assignment;
/*Use the following sorting algorithms sort array DESCENDING order :
[3,6,2,1,8,7,4,5,3,1]
Bubble Sort
Selection Sort
Insertion Sort
Counting Sort
 */
public class sorting {
    public static void print(int arr[]){
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubble(int arr[]){
        for(int i =0;i<arr.length-2;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        print(arr);
    }

    public static void selection(int arr[]){
        for(int i =0 ;i<arr.length-1;i++){
            int minPos=i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos=j;
                }
            }
            //Swap
            int temp = arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
        }
        print(arr);
    }
    public static void main(String args[]){
        int ar[]={3,6,2,1,8,7,4,5,3,1};
        //bubble(ar);
        selection(ar);


    }
    
}
