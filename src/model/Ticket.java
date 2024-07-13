package model;

public class Ticket {
	private int ticketID;
	private String customerName;
	private int sixDigitTicketNumber;
	private String ticketTitle;
	private String ticketDescription;
	private TicketStatus ticketStatus;
	
	public Ticket(int ticketID, String customerName, int sixDigitTicketNumber, String ticketTitle,
			String ticketDescription) {
		super();
		this.ticketID = ticketID;
		this.customerName = customerName;
		this.sixDigitTicketNumber = sixDigitTicketNumber;
		this.ticketTitle = ticketTitle;
		this.ticketDescription = ticketDescription;
		this.ticketStatus = ticketStatus.OPEN;
	}
	
	public int getTicketID() {
		return ticketID;
	}


	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getSixDigitTicketNumber() {
		return sixDigitTicketNumber;
	}


	public void setSixDigitTicketNumber(int sixDigitTicketNumber) {
		this.sixDigitTicketNumber = sixDigitTicketNumber;
	}


	public String getTicketTitle() {
		return ticketTitle;
	}


	public void setTicketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}


	public String getTicketDescription() {
		return ticketDescription;
	}


	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}


	public TicketStatus getTicketStatus() {
		return ticketStatus;
	}


	public void setTicketStatus(TicketStatus ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	@Override
	public String toString() {
		return "Ticket [ticketID=" + ticketID + ", customerName=" + customerName + ", sixDigitTicketNumber="
				+ sixDigitTicketNumber + ", ticketTitle=" + ticketTitle + ", ticketDescription=" + ticketDescription
				+ ", ticketStatus=" + ticketStatus + "]";
	}


	
	
}
