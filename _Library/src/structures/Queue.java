//************************************************************
/**
*	Queue 		Defines attributes for queue object.
*	
*	@author		pxldrm
*	@since		8/17/2017
* 	@update 	
*/
//************************************************************
package structures;
import interfaces.QueueADT;
import java.util.*;
public class Queue<T> implements QueueADT<T>{
//************************************************************
/**
*	Variables
*/
//************************************************************
	private int 			count;
	private ArrayList<T> 	queue;
//************************************************************
/**
*	Construct
*/
//************************************************************
	public 					Queue(){
		count = 0;
		queue = new ArrayList<T>();
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
			return (queue.get(0));
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
		count++;
		queue.add(element);
	}
	public T 				dequeue(){
		if (isEmpty())
			return null;
		else{
			count--;
			return queue.remove(0);
		}		
    }
//************************************************************
/**
*	toString
*/
//************************************************************
	public String 			toString(){
		String s = "";
		for (T t: queue){
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
