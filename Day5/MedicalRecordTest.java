/*1. Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if it's needed.*/
import java.util.Scanner;
class MedicalRecord
{
	protected int recordId;
	protected String patientName;
	protected String date;
	protected String diagnosis;

	Scanner sc = new Scanner(System.in);
	
	public void inputRecordDetails()
	{
		System.out.print("Enter Record ID: ");
        recordId = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Patient Name: ");
        patientName = sc.nextLine();

        System.out.print("Enter Date of Visit (dd-mm-yyyy): ");
        date = sc.nextLine();

        System.out.print("Enter Diagnosis: ");
        diagnosis = sc.nextLine();
	}

	public void displayRecord()
	{
		System.out.println("Record ID          	    : " + recordId);
        System.out.println("Patient Name            : " + patientName);
        System.out.println("Date of Visit           : " + date);
        System.out.println("Diagnosis               : " + diagnosis);
		//System.out.println("Room Number           : " + roomNumber);


	}	
	
} 

class InPatientRecord extends MedicalRecord
{
	private int roomNumber;
	private int numberOfDaysAdmitted;
	private double roomCharges;

	public void inputInPatientRecord()
	{
		inputRecordDetails();

		System.out.print("Enter Room Number: ");
        roomNumber = sc.nextInt();

        System.out.print("Enter Number of Days Admitted: ");
        numberOfDaysAdmitted = sc.nextInt();

        System.out.print("Enter Room Charges per Day: ");
        roomCharges = sc.nextDouble();
	}
	public double calculateTotalCharges()
	{
		return numberOfDaysAdmitted * roomCharges;
	}

	public void displayRecord()
	{
		super.displayRecord();

		System.out.println("Room Number             : " + roomNumber);
		System.out.println("Number of Days Admitted : " + numberOfDaysAdmitted);
		System.out.println("Room Charges            : " + roomCharges);
		System.out.println("Total Charges           : " + calculateTotalCharges());
	}
}



class OutPatientRecord extends MedicalRecord
{
	private String doctorName;
	private double consultationFee;

	public void inputOutPatientRecord() 
	{
        	inputRecordDetails();

        	System.out.print("Enter Doctor's Name: ");
        	doctorName = sc.nextLine();

        	System.out.print("Enter Consultation Fee: ");
        	consultationFee = Double.parseDouble(sc.nextLine());
    	}
	
	public void displayRecord()
	{
		super.displayRecord();
		System.out.println("Doctor Name             : " + doctorName);
        	System.out.println("Consultation Fee        : " + consultationFee);	
	}
}

public class MedicalRecordTest 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;

		System.out.println("Hospital Record System");
		System.out.println("1. Add In Patient Record");
		System.out.println("2. Add out patient Record");
		System.out.println("Enter your choice: ");

		choice = sc.nextInt();
		sc.nextLine();

		switch(choice)
		{
			case 1: 
				InPatientRecord inPatient = new InPatientRecord();
                		System.out.println("\nEnter In-Patient Details:");
                		inPatient.inputInPatientRecord();

                		System.out.println("\n--- In-Patient Record ---");
                		inPatient.displayRecord();
                		break;
			case 2:
                		OutPatientRecord outPatient = new OutPatientRecord();
                		System.out.println("\nEnter Out-Patient Details:");
                		outPatient.inputOutPatientRecord();

                		System.out.println("\n--- Out-Patient Record ---");
                		outPatient.displayRecord();
                		break;
			default:
				System.out.println("Invalid choice.");
		}		
	}
}