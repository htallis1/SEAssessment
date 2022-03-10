import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DataIO {
	
	public DataIO() {
		
	}
	
	int i = 0;
	
	public void readRequirements(String requirementsFile) {
		Subject [] positionsNotFilled = new Subject[10];
		int nRequirement = 0;
		
		FileReader fr = null;
		try {
			fr = new FileReader(requirementsFile);
			Scanner s = new Scanner(fr);
			while(s.hasNextLine()) {
				String line = s.nextLine();
				String[] tokens = line.split(",");
				String subject = tokens[0];
				String day = tokens[1];
				positionsNotFilled[nRequirement++] = new Subject(subject, day);
			}
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			finally {
				if(fr!=null) {
				try {
					fr.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
				}
			}

if(nRequirement>0) {
	System.out.println("The class director has requested the following positions be filled: ");
	System.out.println();
	for (i = 0; i<nRequirement; i++) {
		System.out.println(positionsNotFilled[i]);
	} 	
}
		
		
	}
	
	public StaffMember checkEligibleStaff(String staffDirectoryFile) {
		StaffMember [] currentStaffList = new StaffMember[10];
		int nStaff = 0;
		FileReader fr2 = null;
		try {
			fr2 = new FileReader(staffDirectoryFile);
			Scanner s = new Scanner(fr2);
			while(s.hasNextLine()) {
				String line = s.nextLine();
				String[] tokens = line.split(",");
				String staffMemberName = tokens[0];
				String subject = tokens[1];
				String trainingStatus = tokens[2];
				currentStaffList[nStaff++] = new StaffMember(staffMemberName, subject, trainingStatus);	
			}
			
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			finally {
				if(fr2!=null) {
				try {
					fr2.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
				}
			}
			if(nStaff>0) {
				String option = JOptionPane.showInputDialog("Type in a subject  to see what teachers are eligible to fill the position: ");
			
				for (i = 0; i<nStaff; i++) {
					
				if (option.equals(currentStaffList[i].getSubject()) && currentStaffList[i].getTrainingStatus().equals("yes")) {
					System.out.println(currentStaffList[i].getName() + " can be contacted to fill this position.");
				}
				
			}
		
		
		}
		return currentStaffList[i];
	}
	
	public void generateTrainingList(String staffDirectoryFile) {
		StaffMember [] currentStaffList = new StaffMember[10];
		int nStaff = 0;
		FileReader fr3 = null;
		try {
			fr3 = new FileReader(staffDirectoryFile);
			Scanner s = new Scanner(fr3);
			while(s.hasNextLine()) {
				String line = s.nextLine();
				String[] tokens = line.split(",");
				String staffMemberName = tokens[0];
				String subject = tokens[1];
				String trainingStatus = tokens[2];
				currentStaffList[nStaff++] = new StaffMember(staffMemberName, subject, trainingStatus);	
			}
			
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			finally {
				if(fr3!=null) {
				try {
					fr3.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
				}
			}
			if(nStaff>0) {
				
				
				for (i = 0; i<nStaff; i++) {
					
				if (currentStaffList[i].getTrainingStatus().equals("no")) {
					ListOfStaff staffToBeTrained = new ListOfStaff();
					staffToBeTrained.add(currentStaffList[i]);
					staffToBeTrained.print(System.err);
				}
				
			}
		
		
		}
		
	}

}
