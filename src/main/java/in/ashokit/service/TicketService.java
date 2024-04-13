package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.Passeneger;
import in.ashokit.binding.Ticket;

public interface TicketService {
	
	public Ticket bookTicket(Passeneger passenger);
	
	public Ticket getTicket(Integer ticketId);
	
	public List<Ticket> getTickets();

}
