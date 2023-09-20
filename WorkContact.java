/**
 * 
 * WorkContact.java is a sub java class containing 5 methods of which are getter
 * and setter methods to get and set the relationship and location of a contact.
 * This class is an abstract containing any key attributes of an object of its
 * subclasses. Lastly, there is a toString method which is called on when using
 * a print statement on an object of this class type.
 * 
 * @author Yash Verma (xmf194) UTSA CS 3443 - Lab 1 Fall 2023
 */

public class WorkContact extends Contact {// Start of the sub class to contact

	private String title;
	private String compName;

	public WorkContact(String name, String compName, String title, String phNum) {// Class's constructor

		super(name, phNum);
		this.compName = compName;
		this.title = title;

	}

	@Override
	public String toString() {

		String ret = "* " + super.getName() + " [" + title + ", " + compName + "]: " + super.getPhNum();
		return ret;//This returns the output if any object of this class is printed.

	}// end of toString

	// Below this sentence, are all the appropriate getter and setter methods for this class.

	public String getTitle() {//gets the title
		return title;
	}

	public void setTitle(String title) {//uses the parameter to set the title
		this.title = title;
	}

	public String getCompName() {//gets the company name
		return compName;
	}

	public void setCompName(String compName) {//uses the parameter to set the company name
		this.compName = compName;
	}

}//end of class


//////////////////////////////////////////////////////////////////////////////

/**
 * TODO:
 * 
 * Getters & Setters for title and compName. DONEEE! Create a toString function.
 * DONEEEE! Javadoc. DONEEEE!
 * 
 */
