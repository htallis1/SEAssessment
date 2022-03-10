import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main (String[] args) {
		
		DataIO requirementsFile = new DataIO();
		requirementsFile.readRequirements("C:\\Users\\Hanna\\OneDrive\\1. MSc IT\\Semester 2\\Software Engineering\\ClassDirectorRequirements.txt");
		
		//DataIO checkEligibleStaff = new DataIO();
		//checkEligibleStaff.checkEligibleStaff("C:\\Users\\Hanna\\OneDrive\\1. MSc IT\\Semester 2\\Software Engineering\\Staff_Database.txt");
		
		
		//add staff who require training to a list
		
		//ListOfStaff LoS = new ListOfStaff();
		
		//LoS.add(checkEligibleStaff.checkEligibleStaff("C:\\Users\\Hanna\\OneDrive\\1. MSc IT\\Semester 2\\Software Engineering\\Staff_Database.txt"));
	
		
		DataIO trainingList = new DataIO();
		trainingList.generateTrainingList("C:\\Users\\Hanna\\OneDrive\\1. MSc IT\\Semester 2\\Software Engineering\\Staff_Database.txt");
	}
	
}


