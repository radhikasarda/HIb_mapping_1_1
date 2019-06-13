package Hib_mapping_eg;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Laptop {

	@Id
	private int lid;
	private String lname;
	
     @OneToOne
    
	private Students student;
	
	Laptop(){
		
	}
     
     
     
	public Laptop(int lid, String lname, Students student) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.student = student;
	}



	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Students getStudent() {
		return student;
	}
	public void setStudent(Students student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", student=" + student + "]";
	}
	
	
}
