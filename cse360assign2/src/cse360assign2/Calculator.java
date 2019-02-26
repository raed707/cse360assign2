/**
 * @author Raed Alghamdi
 * Class ID: 311
 * Assignment #2
 * Description: Calculator.java contains methods that does mathematical operations. 
 */

package cse360assign2;

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * 
	 * @param value is the integer inserted by the user
	 */
	
	public void add (int value) {
		total = total + value;
		
	}
	
	public void subtract (int value) {
		total = total - value;
	}
	
	public void multiply (int value) {
		total = total * value;
	}
	
	public void divide (int value) {
		if(value == 0){
			total = 0;
		}
		
		else{
			total = total / value;
		}
	}
	
	public String getHistory () {
		return "";
	}
}