package Report_TO_Email;

import javax.mail.MessagingException;

public class SendEmailScript {
	
	
	
	final static String EmailSender = "prabhachalla1993@gmail.com";
	final static String EmailSenderpassword = "doov dyqc tini riip";
	final static String EmailRec = "dinakarthanniru17@gmail.com";
		public static void main(String[] args) {
	        EmailScript emailScript = new EmailScript();
	        try {
	            emailScript.sendEmailWithAttachment(EmailSender, EmailSenderpassword, EmailRec, ".\\test-output\\emailable-report.html");
	            System.out.println("Email sent successfully!");
	        } catch (MessagingException e) {
	            System.err.println("Error sending email: " + e.getMessage());
	            e.printStackTrace();
	            // Handle the exception as needed
	        }
	    }
}
