package OOPS;

public class interfac {
    public static void main(String args[]){
         Queen q1= new Queen();
         q1.move();
    }
   
    
}

//create an INTERFACE
interface ChessPlayer {
    void move();
}
class Queen implements ChessPlayer{
     public void move(){
        System.out.println("right, left, up, down, with 2 steps");
    }
}

class Rook implements ChessPlayer{
    public void move(){
        System.out.println("right, left, up, down, with infinite steps");
    }
}