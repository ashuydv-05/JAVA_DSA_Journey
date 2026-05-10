//LINEAR SEARCH, FIND THE INDEX OF KEY ELEMENT
package arrays;

public class linear {
    public static int linear_search(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                System.out.println("index of key ="+i);
                return i;
            }}
            return -5; // return some different int value, in order to
            //recongnise this "NUMB NOT FOUND"
    }
    public static void main(String args[]){
        int num[]={34,53,134,756,85,356,74};
        int key= 20;
        int index=linear_search(num,key);       
        if(index==-5){
            System.out.print("Key NOT FOUND");
        }

        
        }
    }
    

