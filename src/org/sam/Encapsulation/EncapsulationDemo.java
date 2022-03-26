package org.sam.Encapsulation;
/*
  Encapsulation is a process of wrapping of data and methods in a single unit is called encapsulation. 
  Encapsulation is achieved in java language by class concept.

  Advantage of Encapsulation:
  ---------------------------
  The main advantage of using of encapsulation is to secure the data from other methods, 
  when we make a data private then these data only use within the class, but these data not accessible outside the class.
  
  Getter and setter methods: Getters and Setters play an important role in retrieving and updating the value 
 --------------------------- of a variable outside the encapsulating class. A setter updates the value of a variable,
                             while a getter reads the value of a variable.
   */

public class EncapsulationDemo {	
	private String name; //We have mentioned the name as sam here but if we do not pass any value if we want to  modify it latter then we should use setter method.
	public String getName() {
		System.out.println("some one is accessing your name");
		return name;
	}
	public void setName(String name) {
		System.out.println("some one is chaging your name");
		this.name=name;	
	}
	public void setName(int x, String name) {
		System.out.println("some one is accessed your details");
		this.name=name;
	}
	
	
	

}
