import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Subject {
	
	Subject [] subjectList = new Subject[20]; 
	int nRequirement = 0;
	
	String subName;
	String dayTaught;
	
	
	public Subject(String subName, String dayTaught) {
		this.subName = subName;
		this.dayTaught = dayTaught;
			
	}
	
	public String toString() {
		return subName + ": " + dayTaught;
	}
	
	
	}

		
			
	


