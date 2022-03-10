
import java.io.*;
import java.util.List;
import java.util.Stack;

public class ListOfStaff {

    private StaffMember[]    list;
    private    int i;
    private int max;
    private int it;
    private boolean training;

    public ListOfStaff(){
    	
        max = 10;
        list = new StaffMember[max];
        i = 0;
    }

    public void add(StaffMember s){ 
    	list[i++] = s;
        }

    // finds the staff depending on name
    public StaffMember find(String n)    {
        for (int j = 0; j < i; j++)
            if (list[j].getName().equals(n))
                return list[j];
        return null;
    }
    
    public void print(PrintStream ps) {
    	for (int j = 0; j <i; j++) 
    		list[j].print(ps);
    	ps.println();
    	}
    

    //Back to the start of staff list
    public void reset(){    
    	max = 0;    
    	}

    //returns staff
    public StaffMember next() {    
    	return (it == i) ? null : list[it++];}

    public boolean hasNext() {    
    	return it < i;    
    	}
    
    
    
   // public String toString() {
    	//return "The following staff should be booked onto training: " + 
    //}

}
