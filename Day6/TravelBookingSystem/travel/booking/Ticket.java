/*4. Design a travel booking system using two packages:

travel.booking – includes a class Ticket with ticket ID, destination, and fare.

travel.user – includes a class User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.*/

package travel.booking;

public class Ticket 
{
    	private String ticketID;
    	private String destination;
    	private double fare;

    	public Ticket(String ticketID, String destination, double fare) 
	{
        	this.ticketID = ticketID;
        	this.destination = destination;
        	this.fare = fare;
    	}

    	public String getTicketID() 
	    {
        	return ticketID;
    	}

    	public String getDestination() 
	    {
        	return destination;
    	}

    	public double getFare() 
	    {
        	return fare;
    	}

    	public void displayTicket() 
	{
        	System.out.println("Ticket ID   : " + ticketID);
        	System.out.println("Destination : " + destination);
        	System.out.println("Fare        : " + fare);
    }
}
