/*4. Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common method but implement booking differently.*/


import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract class TicketBookingSystem
{

	static final int MAX_BOOKINGS = 100;
	static TicketBookingSystem[] bookings = new TicketBookingSystem[MAX_BOOKINGS];
	static String[] bookedSeats = new String[MAX_BOOKINGS];
	static int bookingCount = 0;
	static int seatCount = 0;
    static int ticketCounter = 1001;

	String passengerName;
	byte age;
	long contactNumber;
	String emailId;
	String seatNo;
	String ticketNumber;
	String date;
	//Date departureTime;
	//Date arrivalTime;
	String from;
	String to;

	
	boolean isCanceled = false;

	void input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		passengerName = sc.nextLine();

		System.out.println("Enter your age: ");
		age = sc.nextByte();

		System.out.println("Enter your phone number: ");
		contactNumber = sc.nextLong();
		sc.nextLine();

		System.out.println("Enter your email Id: ");
		emailId = sc.nextLine();

		while(true)
		{
		
			System.out.println("Enter your seat number: ");
			seatNo = sc.nextLine();
			if(!isSeatBooked(seatNo))
			{
				bookedSeats[seatCount++] = seatNo;
				break;
			}
			else	
			{
				System.out.println("Seat already booked! Choose another.");
			}
		}

		System.out.println("Enter Date: ");
		String dt = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date2;
		try
		{
			date2 = sdf.parse(dt);
			date = sdf.format(date2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		System.out.println("Enter pick up location");
		from = sc.nextLine();

		System.out.println("Enter your destination");
		to = sc.nextLine();

		ticketNumber = generateTicketNumber();

		 if (bookingCount < MAX_BOOKINGS) 
		{
            		bookings[bookingCount++] = this;
        	}
		else
		{
           		System.out.println("Booking limit reached!");
       		}

		
	}
	
	static boolean isSeatBooked(String seat)
	{
		for(int i = 0; i<seatCount; i++)
		{
			if(bookedSeats[i] != null && bookedSeats[i].equalsIgnoreCase(seat))
				return true;
		}
		return false;
	}
	
	abstract double payment();
	abstract void display();

	static String generateTicketNumber()
	{
        	return "TKT" + (ticketCounter++);
   	}
	
	void cancel()
	{
		isCanceled = true;
		
		for(int i = 0; i<seatCount ; i++)
		{
			if(bookedSeats[i].equalsIgnoreCase(seatNo))	
			{
				bookedSeats[i] = null;
				break;
			}
		}
		System.out.println("Ticket " + ticketNumber + " has been cancelled.");
	}
	
	void showCommonDetails() 
	{
        	System.out.println("Passenger Name: " + passengerName);
        	System.out.println("Age           : " + age);
        	System.out.println("Phone         : " + contactNumber);
        	System.out.println("Email         : " + emailId);
        	System.out.println("Seat Number   : " + seatNo);
        	System.out.println("Ticket Number : " + ticketNumber);
        	System.out.println("Date          : " + date);
        	System.out.println("From          : " + from);
        	System.out.println("To            : " + to);
       		System.out.println("Fare          : " + payment());
    	}
	

}

class Bus extends TicketBookingSystem
{
	String seatType;
	String ac_nonAc;
	
	void input()
	{
		super.input();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the seat type(Seating/Sleeper): ");
		seatType = sc.nextLine();

		System.out.println("Enter Ac/Non-Ac: ");
		ac_nonAc = sc.nextLine();	
		
	}
	
	double payment()
	{
		return seatType.equalsIgnoreCase("Sleeper") ? 900 : 500;
	}

	void display()
	{
        	System.out.println("\n--- BUS TICKET ---");
        	showCommonDetails();
        	System.out.println("Seat Type     : " + seatType);
        	System.out.println("AC Type       : " + ac_nonAc);
        	System.out.println("Status        : " + (isCanceled ? "Canceled" : "Confirmed"));
    	}
}
	
	
class Train extends TicketBookingSystem
{
	String coachType;

	void input()
	{
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Coach Type (Sleeper/3AC/2Ac/1Ac): ");
		coachType = sc.nextLine();
	}

	double payment()
	{
		switch(coachType.toUpperCase())	
		{
			case "SLEEPER" : return 400;
			case "3AC" : return 750;
			case "2AC" : return 1100;
			case "1AC" : return 1800;
			default : return 600;
			
		}
	}
	
	void display()
	{
        	System.out.println("\n--- TRAIN TICKET ---");
        	showCommonDetails();
        	System.out.println("Coach Type    : " + coachType);
        	System.out.println("Status        : " + (isCanceled ? "Canceled" : "Confirmed"));
    	}
}

class Flight extends TicketBookingSystem 
{
	String flightClass;
	void input() 
	{
        	super.input();
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Flight Class (Economy/Business): ");
        	flightClass = sc.nextLine();
    	}
	
	double payment() 
	{
        	return flightClass.equalsIgnoreCase("Business") ? 5000 : 2500;
    	}

    	void display() 
	{
        	System.out.println("\n--- FLIGHT TICKET ---");
        	showCommonDetails();
        	System.out.println("Class         : " + flightClass);
        	System.out.println("Status        : " + (isCanceled ? "Canceled" : "Confirmed"));
    	}
}

class TicketBookingSystemTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		TicketBookingSystem booking = null;

		while(true)
		{
			System.out.println("\n===== MENU =====");
			System.out.println("1.Book Ticket");
			System.out.println("2.Cancel Ticket");
			System.out.println("3.View Ticket");
			System.out.println("4.Exit");
			System.out.println("Enter your choice: ");
			int option = sc.nextInt();
		

		switch(option)
		{
			case 1:
				System.out.println("\nChoose Mode:");
				System.out.println("1.Bus\n2.Train\n3.Flight");
				int mode = sc.nextInt();

				switch(mode)
				{
					case 1: booking = new Bus(); break;
					case 2: booking = new Train(); break;
					case 3: booking = new Flight(); break;
					default:
						System.out.println("Invalid option!");
						continue;
				}
				booking.input();
				booking.display();
				break;

			case 2:
				sc.nextLine();
				System.out.println("Enter Ticket Number to cancel:");
				String cancelTicket = sc.nextLine();
				boolean found = false;
				for(int i = 0; i<TicketBookingSystem.bookingCount; i++)
				{
					TicketBookingSystem b = TicketBookingSystem.bookings[i];
					if(b != null && b.ticketNumber.equalsIgnoreCase(cancelTicket) && !b.isCanceled)
					b.cancel();
					found = true;
					break;
				}
				if(!found)	
				{
					System.out.println("Ticket not found or already canceled.");
				}
				break;

                	case 3:
                    		sc.nextLine();
                    		System.out.print("Enter Ticket Number to view: ");
                    		String viewTicket = sc.nextLine();
                    		boolean seen = false;
                    		for (int i = 0; i < TicketBookingSystem.bookingCount; i++) 
				{
                        		TicketBookingSystem b = TicketBookingSystem.bookings[i];
                        		if (b != null && b.ticketNumber.equalsIgnoreCase(viewTicket)) 
					{
                            			b.display();
                            			seen = true;
                            			break;
                        		}
                    		}
                    		if (!seen) 
				{
                        		System.out.println("Ticket not found.");
                    		}
                    		break;

			case 4:
                    		System.out.println("Thank you for using the system!");
                    		return;

                	default:
                    		System.out.println("Invalid choice!");


		}

		}
	}
}