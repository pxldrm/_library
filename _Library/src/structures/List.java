//************************************************************
/**
*	List 	Defines attributes for list object.
*	
*	@author			pxldrm
*	@since			8/18/2017
* 	@update 	
*/
//************************************************************
package structures;
import interfaces.ListADT;
import java.util.ArrayList;
public class List<T> implements ListADT<T>{
//************************************************************
/**
*	Variables
*/
//************************************************************
	private int 			count;
	private ArrayList<T> 	list;
//************************************************************
/**
*	Construct
*/
//************************************************************
	public 					List(){
		count 	= 0;
		list 	= new ArrayList<T>();
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
		return list.get(index);
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
		list.add(0, element);
		count++;
	}
	public void 			append(T element){
		list.add(element);
		count++;
	}
	public void 			insertBefore(T element, T compare){
		if (isEmpty())
			list.add(element);
		else{
			int i = 0;
			while (!list.get(i).equals(compare)){
				if (i < list.size() - 1)
					i++;
				else
					break;
			}
			if (list.get(i).equals(compare))
				list.add(i, element);
			else
				list.add(element);
		}
		count++;
	}
	public void 			insertAfter(T element, T compare){
		if (isEmpty())
			list.add(element);
		else{
			int i = 0;
			while (!list.get(i).equals(compare)){
				if (i < list.size() - 1)
					i++;
				else
					break;
			}
			if (i == list.size())
				list.add(i, element);
			else
				list.add(i + 1, element);
		}
		count++;
	}
	public void 			remove(T compare){
		int i = 0;
		while (!list.get(i).equals(compare)){
			if (i < list.size() - 1)
				i++;
			else
				break;
		}
		if (list.get(i).equals(compare)){
			list.remove(i);
			count--;
		}
	}
//************************************************************
/**
*	toString
*/
//************************************************************
	public String 			toString(){
		String s = "";
		for (T t: list){
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
