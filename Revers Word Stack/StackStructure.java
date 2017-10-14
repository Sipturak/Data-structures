
/**
 * Write a description of class StackStucture here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StackStructure
{
   private char [] word;
   private int top;
   private int maxSize;
   
   public StackStructure (int s){
       maxSize = s;
       word = new char[maxSize];
       top = -1;
   }
   /**
    * Push the element on the top of the stack
    */
   public void push(char letter){
       word [++top] = letter; // push
   }
   /**
    * 
    * @ return the character on the top of the stack 
    */
   public char pop(){
       return word[top--];
   }
    /**
     * 
     * @see what is the char on the top
     */
   public char peek(){
       return word[top];
    }
   /**
    * 
    * @return true if stack is empty
    */
   public boolean isEmpty(){
       return (top == -1);
   }
   /**
    * 
    * @return ture if stack is full
    */
   public boolean isFull(){
       return (top == word.length - 1);
   }
}
