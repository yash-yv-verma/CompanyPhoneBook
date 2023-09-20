/**
 * 
 * Contact.java is a super java class containing 5 methods of which are getter
 * and setter methods to get and set the name and phone number. This class is an
 * abstract containing any key attributes of an object of its subclasses.
 * Lastly, there is a toString method which is called on when using a print
 * statement on an object of this class type.
 * 
 * @author Yash Verma (xmf194) UTSA CS 3443 - Lab 1 Fall 2023
 */

public abstract class Contact {// Start of the super class

	private String name;
	private String phNum;

	public Contact(String name, String phNum) {// Class's constructor
		this.name = name;
		this.phNum = phNum;
	}

	public String toString() {// This method is formatting the output for the object of this class.
		return "Contact [name=" + name + ", phNum=" + phNum + "]";//This returns the output if any object of this class is printed.
	}// end of toString

	// Below this sentence, are all the appropriate getter and setter methods for this class.

	public String getName() {//gets the name
		return name;
	}

	public void setName(String name) {//uses the parameter to set the name
		this.name = name;
	}

	public String getPhNum() {//gets the phone number
		return phNum;
	}

	public void setPhNum(String phNum) {//uses the parameter to set the phone number
		this.phNum = phNum;
	}

}//end of class


//////////////////////////////////////////////////////////////////////////////

/**
 * TODO: Getters & Setters for title and compName. DONEEE! Create a toString
 * function. DONEEEE! Javadoc.
 */
