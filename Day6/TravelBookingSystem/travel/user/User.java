package travel.user;

import travel.booking.Ticket;

public class User 
{
    	private String userID;
    	private String name;

    	public User(String userID, String name) 
	{
        	this.userID = userID;
        	this.name = name;
    	}

    	public void bookTicket(Ticket ticket) 
	{
       		System.out.println("User ID   : " + userID);
      		System.out.println("Name      : " + name);
        	System.out.println("--- Ticket Details ---");
       		ticket.displayTicket();
    }
}
