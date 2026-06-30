package string;

public class lexicographic {
    public static void main(String args[]){
        String students[]={"ashu","zee","mando","priti"};
        // System.out.print(students[0]);
        String largest= students[0];
        for(int i = 1;i<students.length;i++){
            if(largest.compareTo(students[i])<0){
                largest = students[i];
            }
        }
        System.out.print(largest);
    }
    
}
