
/**
 * Write a description of class demo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class demo
{
   public static void main (String [] args){
       Scanner in = new Scanner(System.in);
       while(true){
           
            System.out.println("Enter word and see the output ");
            String a = in.nextLine();
            if(a.isEmpty()){
                break;
            }
            Type t = new Type(a);
            System.out.println("Revers: " + t.doRev());
       }
       System.out.println("The program is finished");
    }
}
