package hw5;

public class Email extends Document{
	private String sender;
	private String recipient;
	private String title;
	public void setSender(String Sender) {
		sender = Sender;
	}
	public String getSender() {
		return sender;
	}
	public void setRecipient(String Recipient) {
		recipient = Recipient;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setTitle(String Title) {
		title = Title;
	}
	public String getTitle() {
		return title;
	}
	public String toString() {
		return "From: " + this.getSender() + "\n" 
				+ "To: " + this.getRecipient() + "\n" 
				+ "Title: " + this.getTitle() + "\n" 
				+ super.toString();
	}
}
