import java.io.PrintStream;

public class StaffMember {

		private String name;
		private String subject;
		private String trainingStatus;

		public StaffMember(String n, String s, String t) {
		this.name = n;
		this.subject = s;
		this.trainingStatus = t;
		}

		public String getName() {
		return name;
		}

		public void setName(String name) {
		this.name = name;
		}

		public String getSubject() {
		return subject;
		}

		public void setSubject(String subject) {
		this.subject = subject;
		}

		public String getTrainingStatus() {
		return trainingStatus;
		}

		public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
		}

	public String toString() {
		return name + " " + subject + " " + trainingStatus;
		
	}

	public void print(PrintStream ps) {
		ps.print(name);
		
	}


	}


