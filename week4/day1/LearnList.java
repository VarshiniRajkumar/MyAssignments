package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	
	//first in first out (ordered collection), allows the duplicate values, 
	
	//Syntax: interface <generic type> list name= new implementation class <generic type> ();

	
	
	public static void main(String[] args) {
		List<String> learners=new ArrayList<String>();

		learners.add("Varshini");
		learners.add("Chandra");
		learners.add("Vinoth");
		learners.add("Aravind");
		learners.add("Deepika");
		learners.add("Mani");
		learners.add(0,"Anitha");
		learners.remove("Chandra");
		
		List<String> trainer = new ArrayList<String>();
		trainer.add("Saranya");
		trainer.addAll(learners);
		System.out.println(trainer);
		
	
	}
	

}
