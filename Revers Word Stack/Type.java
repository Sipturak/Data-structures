
/**
 * Write a description of class Type here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Type
{
    //instance variables
    private String input;
    private StringBuilder output;
    
    public Type(String input){
        this.input = input;
        output = new StringBuilder();
    }
    /**
     * Get the word in revers order
     * @return the output of word
     */
    public String doRev(){
        int stackSize = input.length();//length of input
        StackStructure s = new StackStructure(stackSize);
        
        for(int i = 0; i < stackSize; i++){
            if(!s.isFull()){
                char c = input.charAt(i); //get the first char form input
                s.push(c); // push(add) to the stack
            }
        }
        
        while(!s.isEmpty()){
            char p = s.pop();//pop the element from top the stackk
            output.append(p);//append to stringbuilder and return string
        }
        
        return output.toString();
    }
}
