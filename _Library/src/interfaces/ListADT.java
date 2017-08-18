//************************************************************
/**
*	ListADT 	Defines interface for generic list object.
*	
*	@author		pxldrm
*	@since		8/18/2017
* 	@update 	
*/
//************************************************************
package interfaces;
public interface ListADT<T>{
//************************************************************
/**
*	Access
*/
//************************************************************
	public int 		size();
	public T 		get(int index);
//************************************************************
/**
*	Boolean
*/
//************************************************************    
	public boolean 	isEmpty();
//************************************************************
/**
*	Modify
*/
//************************************************************
	public void 	push(T element);
	public void 	append(T element);
	public void 	insertBefore(T element, T compare);
	public void 	insertAfter(T element, T compare);
	public void 	remove(T compare);
//************************************************************
/**
*	toString
*/
//************************************************************
	public String 	toString();
}
