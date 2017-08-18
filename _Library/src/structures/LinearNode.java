//************************************************************
/**
*	LinearNode 	Defines attributes for node object.
*	
*	@author		pxldrm
*	@since		8/16/2017
* 	@update 	8/17/2017
*/
//************************************************************
package structures;
import interfaces.LinearNodeADT;
public class LinearNode<T> implements LinearNodeADT<T>{
//************************************************************
/**
*	Variables
*/
//************************************************************
	private LinearNode<T> 	next;
	private T 				element;
//************************************************************
/**
*	Construct
*/
//************************************************************
	public 					LinearNode(){
		element = null;
		next 	= null;
	}
	public 					LinearNode(T element){
		this.element 	= element;
		next 			= null;
	}
//************************************************************
/**
*	Access
*/
//************************************************************
	public T 				getElement(){
		return element;
	}
	public LinearNode<T> 	getNext(){
		return next;
	}
//************************************************************
/**
*	Modify
*/
//************************************************************
	public void 			setElement(T element){
		this.element = element;
	}
	public void 			setNext(LinearNode<T> node){
		next = node;
	}
//************************************************************
/**
*	toString
*/
//************************************************************
	public String 			toString(){
		String s = "";
			if (element instanceof Object[])
				for (int i = 0; i < ((Object[])element).length; i++)
					s += String.valueOf(((Object[])element)[i]) + ",";
			else
				if (element != null)
					s += String.valueOf(element) + " ";
			if (next != null)
				s += next.toString();
		return s;
	}
}
