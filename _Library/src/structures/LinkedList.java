//************************************************************
/**
*	LinkedList 	Defines attributes for linked list object.
*	
*	@author			pxldrm
*	@since			8/18/2017
* 	@update 	
*/
//************************************************************
package structures;
import interfaces.ListADT;
import structures.LinearNode;
public class LinkedList<T> implements ListADT<T>{
//************************************************************
/**
*	Variables
*/
//************************************************************
	private int 			count;
	private LinearNode<T> 	head;
//************************************************************
/**
*	Construct
*/
//************************************************************
	public 					LinkedList(){
		count 	= 0;
		head 	= null;
	}
//************************************************************
/**
*	Access
*/
//************************************************************
	public int 				size(){
		return count;
	}
	public T 				get(int index){
		if (isEmpty())
			return null;
		LinearNode<T> temp = head;
		for (int i = 0; i < index; i++){
			if (temp.getNext() == null)
				return null;
			temp = temp.getNext();
		}
		return temp.getElement();
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
		temp.setNext(head);
		head = temp;
		count++;
	}
	public void 			append(T element){
		if (head == null)
			head = new LinearNode<T>(element);
		else{
			LinearNode<T> temp = new LinearNode<T>(element);
			LinearNode<T> current = head;
			while (current.getNext() != null)
				current = current.getNext();
			current.setNext(temp);
		}
		count++;
	}
	public void 			insertBefore(T element, T compare){
		LinearNode<T> temp = new LinearNode<T>(element);
		if (head.getElement().equals(compare)){
			temp.setNext(head);
			head = temp;
		}
		else{
			LinearNode<T> current = head;
			LinearNode<T> previous = head;
			while (!(current.getNext() == null || current.getElement().equals(compare))){
				previous = current;
				current = current.getNext();
			}
			if (current.getNext() == null && current.getElement().equals(compare)){
				previous.setNext(temp);
				temp.setNext(current);
			}
			else
				current.setNext(temp);
		}
		count++;
	}
	public void 			insertAfter(T element, T compare){
		LinearNode<T> temp = new LinearNode<T>(element);
		LinearNode<T> current = head;
		while (!(current.getNext() == null || current.getElement().equals(compare)))
			current = current.getNext();
		temp.setNext(current.getNext());
		current.setNext(temp);
		count++;
	}
	public void 			remove(T compare){
		if (head.getElement().equals(compare))
			head = head.getNext();
		else{
			LinearNode<T> current = head;
			LinearNode<T> previous = head;
			while (!(current.getNext() == null || current.getElement().equals(compare))){
				previous = current;
				current = current.getNext();
			}
			current = current.getNext();
			previous.setNext(current);
		}
		count--;
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
