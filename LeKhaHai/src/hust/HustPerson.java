package hust;

import java.util.Date;

public class HustPerson {
	
	protected String fullName;
	protected String firstName;
	protected String middleName;
	protected String lastName;
	protected String numberId;
	protected Date birthDate;
	
	public HustPerson(String fullName, String numberId) {
		this.numberId = numberId;
		this.setFullName(fullName);
		//Extract firstName, middleName, lastName from fullName
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
		String[] names = fullName.split(" ");
		if(names.length > 1) {
			lastName = names[0];
			firstName = names[names.length - 1];
			for(int i = 1; i<names.length -1; i++) {
				middleName += names[i] + " ";
			}
		}
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNumberId() {
		return numberId;
	}
	public void setNumberId(String numberId) {
		this.numberId = numberId;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}	
}
