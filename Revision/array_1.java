package Revision;
import java.util.*;
public class array_1 {
    public static void ip_op(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elemt to store");
        int arr[]=new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Here printing array elements");
        for(int i=0;i<arr.length;i++){
            System.out.println(2*arr[i]+" ");
        }
    }
    //GIVEN AN ARRAY PRINT NEGATIVE ELEMENTS ONLY
    public static void print_neg(){
        int arr[]={2,3,-4,5};
         for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
            System.out.println(arr[i]+" ");
            }
        }
    }
    // PRINT THE SUM OF THE ELEMENTS
    public static void sum(){
        int arr[]={2,3,-4,5};
        int sum=0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.print("The sum of all the elements " + sum);
    }
    //PRODUCT OF ALL THE ELEMENTS
    public static void product(){
        int arr[]={2,3,-4,5};
        int pro=1;
        for(int i =0;i<arr.length;i++){
            pro*=arr[i];
        }
        System.out.print("The product of all the elements " + pro);
    }
    //PRINT LARGEST SMALLEST ELEMENT
    public static void large_small( int arr[]){
        int max = arr[0];
        //int max = Integer.MIN_VALUE;
        int min = arr[0];
        //int min = Integer.MAX_VALUE;
        //FOR MAX
        for(int i =1;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println("Maximum element="+max);
        //FOR MIN
        for(int i=1;i<arr.length;i++){
            if(arr[i]< min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element ="+min);

    } 
    //SECOND MAX
    public static void second_max(int arr[]){
        int max_1 = arr[0];
        int max_2 = arr[0];
         for(int i =1;i<arr.length;i++){
            if(arr[i]>max_1){
                max_1= arr[i];
            }
        }
         System.out.println("First max="+max_1);
        for(int i = 1;i<arr.length;i++){
            if(arr[i]> max_2 && arr[i]!=max_1){
                max_2=arr[i];
            }
        }
        System.out.println("Second max =" +max_2);
    }
    //REVERSE ARRAY
    public static void reverse(int arr[]){
        int i=0;
        int j = arr.length-1;
        while(i<j){
            //SWAPPING
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        
        i++;
        j--;
        }
        //PRINTTING REVERSED ARRAY
        for(int k =0;k<arr.length;k++){
            System.out.println(arr[k]+" ");
        }

    }
    public static void main(String args[]){
        int[] arr={1,2,3,4};
        // System.out.print(arr[0]);
        //ip_op();
        //print_neg();
        //sum();
        //product();
        //int ar[]={2,3,-65,456,456,-45465,80};
        //large_small(ar);
        //second_max(ar);
        reverse(arr);
    }
    
}
