
/**
 * Write a description of class Stack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stack
{
    private char [] characters;
    private int top;
    private int size;
    
    public Stack(int s){
        size = s;
        characters = new char[size];
        top = -1;
    }
    
    public void push(char ch) throws ArrayIndexOutOfBoundsException{
        try{
            characters[++top] = ch;
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Can't insert stack is full");
        }
    }
    public char pop() {
        if(isEmpty()){
            return 0;
        }
        else{
            return characters[top--];
        }
    }
    public char peek(){
        return characters[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == size - 1);
    }
}
