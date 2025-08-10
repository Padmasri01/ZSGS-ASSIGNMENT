package TravelBookingSystem;

import travel.booking.Ticket;
import travel.user.User;

public class TravelTest
{
    public static void main(String[] args) 
	{
        Ticket t1 = new Ticket("T123", "Tenkasi", 1200.50);

        User u1 = new User("U001", "Akshayaa");


        u1.bookTicket(t1);
	}
}
