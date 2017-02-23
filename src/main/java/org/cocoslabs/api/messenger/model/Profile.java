package org.cocoslabs.api.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	private long id;
	private String profileName;
	private String firstName;
	private String lastName;
	private Date created;
	
	public Profile()
	{
		
	}
	
	public Profile(long id, String profileName, String firstName, String lastName)
	{

		this.id=id;
		this.profileName=profileName;
		this.firstName	= firstName;
		this.lastName = lastName;
	}
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getprofileName() {
		return profileName;
	}
	public void setprofileName(String profileName) {
		this.profileName = profileName;
	}
	
	public String getfirstName(String firstName) {
		return firstName;
	}
	public void setfirstNam(String firstName) {
		this.firstName = firstName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public String getlastName(String lastName) {
		return lastName;
	}
	 public Date getCreated()
	 {
		 return  created;
	 }
	public void setCreated(Date created)
	{
		this.created = created;
	}
}
