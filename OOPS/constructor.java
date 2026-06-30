package OOPS;
//CONSTRUCTOR OVERLOADING

//Example of polymorphisum 
public class constructor {
    public static void main(String args[]){
        Student s1 = new Student();
        // Student s2 = new Student("ashu");
        // Student s3 = new Student(54);
        
        s1.name = "Ashu";
        s1.clas = 3;
        s1.height = 23;
        s1.marks[0]= 212;
        s1.marks[1]= 100;
        s1.marks[2] = 80;

       
        //


        Student s2 = new Student(s1);
         s1.marks[2]=100;
        for(int i = 0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
       

    }
}

class Student{
    String name;
    int clas;
    float height;
    int marks[];

    //defining the constructor;

    /*Here multiple constructor have been defined .
    Constructor Overloading */
    Student(){
        marks = new int[3];
        System.out.println("Name = " + this.name );
    }

    Student(String new_1){
        this.name =new_1;
        System.out.println( "Name = "+this.name );
    }
    Student(int new_c){
        this.clas = new_c;
        System.out.println( "Class = "+this.clas );
    }
    // //Copy Constructor
    //s2 is also pointing to same ref marks[] of s1. 
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.clas = s1.clas;
    //     this.height= s1.height;
    //     // SHALLOW COPY CONSTRUCTOR
    //     this.marks = s1.marks;
    // }

     Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.clas = s1.clas;
        this.height= s1.height;
        //DEEP COPY
        for(int i = 0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }

     }


}
