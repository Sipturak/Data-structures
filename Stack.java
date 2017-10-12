
/**
 * Write a description of class Stack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class Stack
{
    //instance varibales
   private int [] arr;
   private int maxSize;
   private int left;
   private int right;
   private int nEl;
   
   //Constructor
   public Stack(int s ){
       maxSize = s;
       arr = new int[maxSize];
       left = -1;
       right = maxSize;
       nEl = 0;
   }
   /**
    * Insert element on stack at the first index of array.
    * If stack is full catch exception and throws it
    */
   public void insertLeft(int j) {
       if(isFull()){
           throw new ArrayIndexOutOfBoundsException();
       }
       else{
           arr[++left] = j;
           nEl++;
       }
   }
   /**
    * Inser element into stack starting from last index of array
    * If stack is full catch exception and throws it
    */
   public void insertRight(int value)throws ArrayIndexOutOfBoundsException{
       if(isFull()){
            throw new ArrayIndexOutOfBoundsException();
        }
       else{
           arr[--right] = value;
           nEl++;
        }
    }
    /**
     * Pop element from stack starting from last index of array
     * @return removed element
     */
   public int removeRight(){
       if(isEmpty())
            return 0;
       else
            return arr[right++];
    }
    /**
     * Remove element fromt stack starting from fist index of array
     * @return removed element
     */
   public int removeLeft(){
       if(isEmpty())
            return 0;
       else
            return arr[left--];
   }
   /**
    * Check if stack is empty
    * @return true if is empty
    */
   public boolean isEmpty(){
       return (left == -1 && right == maxSize);
   }
   /**
    * Check if the stack is full
    * @return true if is full
    */
    public boolean isFull(){
        return (nEl == maxSize);
    }

}
