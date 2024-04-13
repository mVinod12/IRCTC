package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Passeneger;
import in.ashokit.binding.Ticket;
import in.ashokit.service.TicketService;

@RestController
public class TicketRestController {
	
	@Autowired
	private TicketService service;
	
	@PostMapping("/ticket")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passeneger p){
		Ticket ticket = service.bookTicket(p);
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);	
	}
	
	@GetMapping("/ticket,{tid}")
	public ResponseEntity<Ticket> getTicket(@PathVariable("tid") Integer tid){
		Ticket t = service.getTicket(tid);
		return new ResponseEntity<>(t,HttpStatus.OK);
		
	}
	
	@GetMapping("/tickets")
	public ResponseEntity<List<Ticket>> getAllTickets(){
		List<Ticket> tickets = service.getTickets();
		return new ResponseEntity<>(tickets,HttpStatus.OK);
		
		
	}

}
