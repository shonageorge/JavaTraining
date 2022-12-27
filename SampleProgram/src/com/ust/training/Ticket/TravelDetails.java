package com.ust.training.Ticket;

public class TravelDetails {
	
	private int ticketId;
	private String name;
	private String source;
	private String destination;
	private int distance;
	private int amount;
	public TravelDetails(int ticketId, String name, String source, String destination, int distance,int amount) {
		super();
		this.ticketId = ticketId;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.amount=amount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "TravelDetails [ticketId=" + ticketId + ", name=" + name + ", source=" + source + ", destination="
				+ destination + ", distance=" + distance + "]";
	}
	
	
	

}
