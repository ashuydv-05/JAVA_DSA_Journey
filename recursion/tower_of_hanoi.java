package recursion;
// print the step foo solving tower of hanoi game
public class tower_of_hanoi {
    static int count =0;
    public static void main(String[] args) {
        
        game(5,'A','B','C', 1);
        System.out.println("Total count: "+count);
        
    }
    public static void game(int n, char src, char via , char dest, int step){
        if(n ==0) return;
        //move n-1 disc to A to b via c;
        game(n-1,src,dest,via,step);
        //Move largest disc from A to C
        // System.out.println(step);
        System.out.println(src+"->"+dest);
        count++;
        // step++;
        //move n -1 disc From B to C via A;
        game(n-1,via,src,dest,step);


    }
}
