package conditional;

public class SwitchExample {
    public static void main(String args[]){
        int num = 1;
        switch(num){
            case 0:
                System.out.println("Ashu");
                break;
            case 1:{
                System.out.println("yadav");
                break;}
            default:
                System.out.println("NA");
                break;
        }
    }
    
}
