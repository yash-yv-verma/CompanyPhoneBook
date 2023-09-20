/**
 * 
 * FamilyMember.java is a sub java class containing 5 methods of which are
 * getter and setter methods to get and set the relationship and location of a
 * contact. This class is an abstract containing any key attributes of an object
 * of its subclasses. Lastly, there is a toString method which is called on when
 * using a print statement on an object of this class type.
 * 
 * @author Yash Verma (xmf194) UTSA CS 3443 - Lab 1 Fall 2023
 */

public class FamilyMember extends Contact {// Start of the sub class to contact

	private String relationship;
	private String location;

	public FamilyMember(String name, String relationship, String phNum, String location) {//Class's consructor

		super(name, phNum);
		this.location = location;
		this.relationship = relationship;

	}

	@Override
	public String toString() {

		String ret = "* " + super.getName() + " (" + relationship + " - " + location + "): " + super.getPhNum();
		return ret;//This returns the output if any object of this class is printed.

	}// end of toString

	// Below this sentence, are all the appropriate getter and setter methods for this class.

	public String getRelationship() {//gets the relationship value
		return relationship;
	}

	public void setRelationship(String relationship) {//uses the parameter to set the relationship value
		this.relationship = relationship;
	}

	public String getLocation() {//gets the location value
		return location;
	}

	public void setLocation(String location) {//uses the parameter to set the location value
		this.location = location;
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
