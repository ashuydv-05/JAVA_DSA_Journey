package string;
/*Given a route containing 4 direction E W S N;
find the shortest path to reach destination;
 */
public class shortestpath {
    public static void main(String args[]){
        // String str = "WNEENESENNN";
        String str ="NS";

        //intial position;
        int x =0,y=0;
        // moving pointer
        int a=x, b=y;
        
        for(int i =0;i<str.length();i++){
            if (str.charAt(i)== 'W') a--;
            else if (str.charAt(i)== 'E') a++;
            else if (str.charAt(i)== 'N') b++;
            else  b--;
        }
        //calculating distance
        int x_diff = (a-x)*(a-x);
        int y_diff = (b-y)*(b-y);
        double distance = Math.sqrt(x_diff+y_diff);

        System.out.print("Shortest distance ="+distance);

    }
    
}
