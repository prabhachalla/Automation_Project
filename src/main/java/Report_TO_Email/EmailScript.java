package Report_TO_Email;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import java.io.File;

	public class EmailScript {
		
////		public static void main(String[] args) {
////			EmailScripts();
////		}
//		
//		public static void EmailScripts() {
//
//	        final String senderEmail = "prabhachalla1993@gmail.com";
//	        final String password = "doov dyqc tini riip";
//	        final String recipientEmail = "dinakarthanniru17@gmail.com";
//
//	        Properties props = new Properties();
//	        props.put("mail.smtp.auth", "true");
//	        props.put("mail.smtp.starttls.enable", "true");
//	        props.put("mail.smtp.host", "smtp.gmail.com");
//	        props.put("mail.smtp.port", "587");
//
//	        Session session = Session.getInstance(props, new Authenticator() {
//	            @Override
//	            protected PasswordAuthentication getPasswordAuthentication() {
//	                return new PasswordAuthentication(senderEmail, password);
//	            }
//	        });
//
//	        try {
//	            // Create a MimeMessage object
//	            Message message = new MimeMessage(session);
//	            message.setFrom(new InternetAddress(senderEmail));
//	            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
//	            message.setSubject("TestNG Report");
//
//	            // Create MimeBodyPart for the TestNG report attachment
//	            MimeBodyPart attachmentBodyPart = new MimeBodyPart();
//	            String filePath = ".\\test-output\\emailable-report.html"; // Replace with your TestNG report path
//	            File file = new File(filePath);
//	            FileDataSource source = new FileDataSource(file);
//	            attachmentBodyPart.setDataHandler(new DataHandler(source));
//	            attachmentBodyPart.setFileName(file.getName());
//
//	            // Create Multipart object and add MimeBodyPart with the TestNG report
//	            Multipart multipart = new MimeMultipart();
//	            multipart.addBodyPart(attachmentBodyPart);
//
//	            // Set the content of the message
//	            message.setContent(multipart);
//
//	            // Send the message
//	            Transport.send(message);
//
//	            System.out.println("Email with TestNG report sent successfully!");
//
//	        } 
//	        catch (MessagingException e) {
//	       
//	        
//	            e.printStackTrace();
//	        
//		
//	        }
//	
//	        }
		
		
		public void sendEmailWithAttachment(String senderEmail1, String password1, String recipientEmail1, String filePath) throws MessagingException {

	        Properties props = new Properties();
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", "587");

	        Session session = Session.getInstance(props, new Authenticator() {
	            @Override
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(senderEmail1, password1);
	            }
	        });

	        try {
	            // Create a MimeMessage object
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(senderEmail1));
	            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail1));
	            message.setSubject("TestNG Report");

	            // Create MimeBodyPart for the TestNG report attachment
	            MimeBodyPart attachmentBodyPart = new MimeBodyPart();
	            File file = new File(filePath);
	            FileDataSource source = new FileDataSource(file);
	            attachmentBodyPart.setDataHandler(new DataHandler(source));
	            attachmentBodyPart.setFileName(file.getName());

	            // Create Multipart object and add MimeBodyPart with the TestNG report
	            Multipart multipart = new MimeMultipart();
	            multipart.addBodyPart(attachmentBodyPart);

	            // Set the content of the message
	            message.setContent(multipart);

	            // Send the message
	            Transport.send(message);

	            System.out.println("Email with TestNG report sent successfully!");

	        } catch (MessagingException e) {
	            // Rethrow the exception for the calling code to handle
	            throw e;
	        }
	    }
		 
		
		}


