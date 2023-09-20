/**
 * 
 * AddressBook.java is a Java class containing 9 methods of which two methods help adding or removing a contact.
 * 6 of them are getter and setter methods which get and set book name, family contacts and work contacts.
 * Lastly, there is a toString method which is called on when using a print statement on an object of this class type.
 * 
 * @author Yash Verma (xmf194) UTSA CS 3443 - Lab 1 Fall 2023
 */

import java.util.Arrays;
import java.util.Objects;

public class AddressBook {// Start of the class

	String bookName;

	FamilyMember[] famContacts = new FamilyMember[10];
	WorkContact[] workContacts = new WorkContact[10];

	public AddressBook(String bookName) {// Class's constructor
		this.bookName = bookName;
	}

	public String toString() {// This method is formatting the output for the object of this class.
		String ret = "";
		boolean isEmpty = Arrays.stream(workContacts).allMatch(Objects::isNull);

		if (!isEmpty) {

			ret = "\nWork Contacts\n- - - - - - -\n";

			for (int i = 0; i < workContacts.length; i++) {
				if (workContacts[i] != null) {
					ret += workContacts[i] + "\n";
				}
			}

		}
		isEmpty = Arrays.stream(famContacts).allMatch(Objects::isNull);

		if (!isEmpty) {
			ret += "Family Contacts\n- - - - - - -\n";

			for (int i = 0; i < famContacts.length; i++) {
				if (famContacts[i] != null) {
					ret += famContacts[i] + "\n";
				}
			}


		}

		return ret;//This returns the output if any object of this class is printed.
	}// end of toString

	public void addContact(Contact conOne) {// This is a non-returning method which adds a contact and takes in that contact, one at a time.
		if (conOne instanceof FamilyMember) {
			for (int i = 0; i < famContacts.length; i++) {
				if (famContacts[i] == null) {
					famContacts[i] = (FamilyMember) conOne;
					return;
				}
			}
		} else {
			for (int i = 0; i < workContacts.length; i++) {
				if (workContacts[i] == null) {
					workContacts[i] = (WorkContact) conOne;
					return;
				}
			}
		}
	}// end of addContact

	public void removeContact(Contact conOne) {// This is a non-returning method which removes a contact and takes in that contact, one at a time.
		if (conOne instanceof FamilyMember) {
			for (int i = 0; i < famContacts.length; i++) {
				if (famContacts[i].equals(conOne)) {
					famContacts[i] = null;
					return;
				}
			}
		} else {
			for (int i = 0; i < workContacts.length; i++) {
				if (workContacts[i].equals(conOne)) {
					workContacts[i] = null;
					return;
				}
			}
		}
	}// end of removeContact

	// Below this sentence, are all the appropriate getter and setter methods for this class.


	public String getBookName() {//gets the book name
		return bookName;
	}

	public void setBookName(String bookName) {//uses the parameter to set the book name
		this.bookName = bookName;
	}

	public FamilyMember[] getFamContacts() {//gets the family contact array
		return famContacts;
	}

	public void setFamContacts(FamilyMember[] famContacts) {//uses the parameter to set the family contact array
		this.famContacts = famContacts;
	}

	public WorkContact[] getWorkContacts() {//gets the work contact array
		return workContacts;
	}

	public void setWorkContacts(WorkContact[] workContacts) {//uses the parameter to set the work contact array
		this.workContacts = workContacts;
	}

}//end of class


//////////////////////////////////////////////////////////////////////////////

/*
 * TODO:
 * 
 * A name for the book, represented as a String (e.g. Family). CHECK
 * 
 * 
 * An array of Contact objects. CHECK
 * 
 * 
 * A toString() method which returns a String representation of the address
 * book. CHECK
 * 
 * 
 * An object method addContact(..) which takes in a single Contact, adds them to
 * ---> CHECK that book, and doesn’t return anything. All address books can
 * contain at most 10 contacts. Once full, no additional contacts can be added.
 * 
 * 
 * A removeContact(..) method which takes in a single Contact and removes them
 * ---> CHECK from the address book.
 * 
 */
