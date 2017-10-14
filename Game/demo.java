
/**
 * Write a description of class demo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Collections;
public class demo
{
    public static void main(String [] args) throws ArrayIndexOutOfBoundsException{
        Quizz g = new Quizz();
        
        g.add("Munje");
        g.add("Idemo dalje");
        g.add("Vratice se rode");
        g.pick();
        g.game();

    }
}
