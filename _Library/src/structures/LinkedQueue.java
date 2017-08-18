//************************************************************
/**
*	LinkedQueue 	Defines attributes for linked queue object.
*	
*	@author			pxldrm
*	@since			8/17/2017
* 	@update 	
*/
//************************************************************
package structures;
import interfaces.QueueADT;
import structures.LinearNode;
public class LinkedQueue<T> implements QueueADT<T>{
//************************************************************
/**
*	Variables
*/
//************************************************************
	private int 			count;
	private LinearNode<T> 	head, tail;
//************************************************************
/**
*	Construct
*/
//************************************************************
	public 					LinkedQueue(){
		count 			= 0;
		head = tail 	= null;
	}
//************************************************************
/**
*	Access
*/
//************************************************************
	public int 				size(){
		return count;
	}
	public T 				first(){
		if (isEmpty())
			return null;
		else
			return head.getElement();
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
	public void 			enqueue(T element){
		LinearNode<T> temp = new LinearNode<T>(element);
		if (isEmpty())
			head = temp;
		else
			tail.setNext(temp);
		tail = temp;
		count++;
	}
	public T 				dequeue(){
		T result = head.getElement();
		head = head.getNext();
		count--;
		if (isEmpty())
			tail = null;
		return result;		
    }
//************************************************************
/**
*	toString
*/
//************************************************************
	public String 			toString(){
		return head.toString();
	}
}
