//************************************************************
/**
*	LinkedStack 	Defines attributes for linked stack object.
*	
*	@author			pxldrm
*	@since			8/16/2017
* 	@update 		8/17/2017
*/
//************************************************************
package structures;
import interfaces.StackADT;
import structures.LinearNode;
public class LinkedStack<T> implements StackADT<T>{
//************************************************************
/**
*	Variables
*/
//************************************************************
	private int 			count;
	private LinearNode<T> 	top;
//************************************************************
/**
*	Construct
*/
//************************************************************
	public 					LinkedStack(){
		count = 0;
		top = null;
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
		if (isEmpty())
			return null;
		else
			return top.getElement();
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
		LinearNode<T> temp = new LinearNode<T>(element);
		temp.setNext(top);
		top = temp;
		count++;
	}
	public T 				pop(){
		if (isEmpty())
			return null;
		else{
			T result = top.getElement();
			top = top.getNext();
			count--;
			return result;
		}		
    }
//************************************************************
/**
*	toString
*/
//************************************************************
	public String 			toString(){
		return top.toString();
	}
}
