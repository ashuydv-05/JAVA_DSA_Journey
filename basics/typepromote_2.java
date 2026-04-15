package basics;

public class typepromote_2 {
    public static void main(String args []){
        long a = 30;
        float b = 343.43f;
        double c= 453.543;
        int d= 342;
        // sabse bada value double ka h, so all the thing will be
        // converted to double.
       // int ans = a+b-d*c; ERROR CANNOT CONVERT DOUBLE TO INT
       double ans = a+b-d*c;
       System.out.print(ans);
       


    }

}
