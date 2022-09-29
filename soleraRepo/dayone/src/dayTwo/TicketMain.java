package dayTwo;

public class TicketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfirmedTicket tkt = new ConfirmedTicket();
		
		if(tkt instanceof Object) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		if(tkt instanceof Ticket) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		if(tkt instanceof ConfirmedTicket) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		/*
		 * String s = new String("Saket");
		 * 
		 * if(s instanceof String) { System.out.println("True"); }else {
		 * System.out.println("False"); }
		 */
	}

}
