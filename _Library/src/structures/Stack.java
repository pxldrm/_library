//************************************************************
/**
*	Stack 		Defines attributes for stack object.
*	
*	@author		pxldrm
*	@since		8/15/2017
* 	@update 	8/18/2017
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
	private int 			count;
	private ArrayList<T> 	stack;
//************************************************************
/**
*	Construct
*/
//************************************************************
	public 					Stack(){
		count = 0;
		stack = new ArrayList<T>();
	}
//************************************************************
/**
*	Access
*/
//************************************************************
	public int 				size(){
		return count;
	}
	public T 				peek(){
		return stack.get(0);
	}
//************************************************************
/**
*	Boolean
*/
//************************************************************    
	public boolean 			isEmpty(){
		return count == 0;
	}
//************************************************************
/**
*	Modify
*/
//************************************************************
	public void 			push(T element){
		count++;
		stack.add(0, element);
	}
	public T 				pop(){
		if (isEmpty())
			return null;
		else{
			count--;
			return stack.remove(0);
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
				s += String.valueOf(t) + " ";
		}
		return s;
	}
}
