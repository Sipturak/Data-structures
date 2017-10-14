
/**
 * Write a description of class demo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class demo
{
   public static void main(String [] args){
       int [] array = new int[10];
       
       for(int i = 0; i < array.length;i++){
           array[i] = (int)(Math.random() * 100);
        }
       
       SortedList list = new SortedList(array);
       list.displayList();
       while(!list.isEmpty()){
           System.out.println("Delete item: " + list.removeFirst().getData());
        }
    }
}
