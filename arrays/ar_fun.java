//FUNCTION IN ARRAY.
package arrays;

public class ar_fun {
    public static int[] update(int marks[]){ 
        for(int i=0;i<marks.length;i++){// marks length me 0 index wala bhi count hota h..
            marks[i]=marks[i]+1;
        }

        return marks;
    }
    public static void main(String args[]){
        int marks[]={1,2,3,4,634,67334};
        System.out.println(marks.length);
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(" Updated Marks at "+i+"="+marks[i]);
        }
    }
}
/*ARRAY WITH FUNCTION
1.Passing array in function use PASS BY REFERENCE, (original value gets change) get reflected
in main function.
2.Here, except VOID datatype, we can use the normal array datatype with [],
which return array.
3.while passing argument as array to the function, NO NEED FOR ADDING[], ONLY ARRAY NAME .
Exception in Thread: here we used FOR loop to move in 1 , 1 element in array.
out loop starts from i =0 i.e. index no. & in array.length() tell about total num
of element including num at index 0, so we to iterate [i<array.length()], otherwise error 

*/