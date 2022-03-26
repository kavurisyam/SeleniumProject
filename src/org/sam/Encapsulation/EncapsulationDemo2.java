package org.sam.Encapsulation;

public class EncapsulationDemo2 {
	public static void main(String[] args) {
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setName("kavuri");
		System.out.println(ed.getName());
		ed.setName(1, "sam");
		System.out.println(ed.getName());
		
		
		}
	}


