import java.util.Scanner;
class FindGrade
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of subjects: ");
		int noOfSubjects = sc.nextInt();
		int[] marks = new int[noOfSubjects];
		int total = 0;
		
		for(int i = 0; i<noOfSubjects; i++){
			System.out.println("Enter mark of subject " + (i+1));
			marks[i] = sc.nextInt();
			total += marks[i];
		}
		System.out.println("Total Mark: " + total);
		float percentage = (float) total/noOfSubjects;
		System.out.println("Percentage: " + percentage);

        if(percentage>=85 && percentage <= 100)
        {
            System.out.println("Grade-A");

        }
        else if(percentage>=70)
        {
            System.out.println("Grade-B");

        }
        else if(percentage>=50)
        {
            System.out.println("Grade-C");

        }
        else{
            System.out.println("Fail");
        }
        int result = 0;
		if(percentage>=85 && percentage <= 100)
		{
            result = 1;

		}
		else if(percentage>=70)
		{
            result =2;


		}
		else if(percentage>=50)
		{
            result=3;

		}
		else{
            result = 0;
			System.out.println("Fail");
		}
		switch(result)
		{

            case 1:
				System.out.println("Grade-A");
				break;

            case 2:
				System.out.println("Grade-B");
				break;

            case 3:
				System.out.println("Grade-C");
				break;
			default:
				System.out.println("Fail");	
		}
		
		
	}
}