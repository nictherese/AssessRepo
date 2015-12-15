
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class Assessment {
	public static void main(String[] args) throws IOException {		
		ArrayList<Student> stud = new ArrayList<Student>();
		Scanner read;
		String idNum = "";
		try {
			read = new Scanner(new File("students.txt"));
			
			while (read.hasNextLine()) {
				String lineOfText = read.nextLine();
				String[] data= lineOfText.split(",");
				
				idNum = data[0];
				String lastName = data[1];
				String firstName = data[2];
				char initial = data[3].charAt(0);
				String course = data[4];
				int year = Integer.parseInt(data[5]);
				double balance = Double.parseDouble(data[6]);
				double prelims = Double.parseDouble(data[7]);
				double midterms = Double.parseDouble(data[8]);
				double finals = Double.parseDouble(data[9]);
				
				stud.add(new Student(idNum, lastName, firstName, initial, course, year, balance, prelims, midterms, finals));
			}
		} catch (FileNotFoundException e) {
			System.out.print("File not found.");
		}
		
		boolean found = true;
		while (found) {	
			String idNumber = JOptionPane.showInputDialog(null, "Enter ID number", "Assessment", JOptionPane.OK_CANCEL_OPTION);
			
			if (idNumber.isEmpty()) {
				JOptionPane.showMessageDialog(null, "ID Number not found.", "Error", JOptionPane.ERROR_MESSAGE);
				found = true;
			} else {
				for (int i = 0; i < stud.size(); i++) {
					if (idNumber.equals(stud.get(i).getIDnum())) {
						Object[] f = {stud.get(i).toString()};
						JOptionPane.showMessageDialog(null,f,"Summary",1);
					}
				}
				found = false;
			}
		}
	}
}