package Hib_mapping_eg;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Students {
	@Id
	private int roll;

	private String name;

	private int marks;

	
	@OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
	private Laptop laptop;
	
	
	public Students() {
		
	}
	
	public Students(int roll, String name, int marks, Laptop laptop) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.laptop = laptop;
	}

	public int getRoll() {
		return roll;
		
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Students [roll=" + roll + ", name=" + name + ", marks=" + marks + ", laptop=" + laptop + "]";
	}


}
