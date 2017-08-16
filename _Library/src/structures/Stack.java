//************************************************************
/**
*	Stack 		Defines attributes for stack object.
*	
*	@author		pxldrm
*	@since		8/15/2017
* 	@update 	
*/
//************************************************************
package structures;
import interfaces.StackADT;
import java.util.*;
public class Stack<T> implements StackADT<T>{
//************************************************************
/**
*	Variables
*/
//************************************************************
	private ArrayList<T> 	stack;
	private int 			top;
//************************************************************
/**
*	Constructor
*/
//************************************************************
	public 					Stack(){
		top = 0;
		stack = new ArrayList<T>();
	}
//************************************************************
/**
*	Access
*/
//************************************************************
	public int 				size(){
		return top;
	}
	public T 				peek(){
		if (isEmpty())
			return null;
		else
			return (stack.get(stack.size() - 1));
	}
//************************************************************
/**
*	Booleans
*/
//************************************************************    
	public boolean 			isEmpty(){
		return top == 0;
	}
//************************************************************
/**
*	Mutators
*/
//************************************************************
	public void 			push(T element){
		top++;
		stack.add(element);
	}
	public T 				pop(){
		if (isEmpty())
			return null;
		else{
			top--;
			return stack.remove((stack.size() - 1));
		}		
    }
//************************************************************
/**
*	toString
*/
//************************************************************
	public String 			toString(){
		String s = "";
		for (T t: stack){
			if (t instanceof Object[]){
				for (int i = 0; i < ((Object[])t).length; i++)
					s += String.valueOf(((Object[])t)[i]) + ",";
			}
			else
				s += String.valueOf(t) + ",";
		}
		return s;
	}
}
