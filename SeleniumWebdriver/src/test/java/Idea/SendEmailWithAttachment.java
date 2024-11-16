package Idea;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import org.testng.annotations.Test;
import javax.activation.*;
import java.io.File;
public class SendEmailWithAttachment {
	@Test
	public void Send_Email () {
		
		final String username = "aarthipanneerqa@gmail.com"; // Your Outlook email
        final String password = "hwix iarm mjmq mccj"; // Your email password or app-specific password
        String recipient = "aarthipanneerqa@gmail.com";
        String subject = "Excel Sheet with Date Differences";
        String body = "Please find the attached Excel sheet with the date differences.";
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); // Required for Outlook
        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject(subject);
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(body);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            messageBodyPart = new MimeBodyPart();
            String filePath = "DetailsWithDates.xlsx"; // Path to the Excel file
            DataSource source = new FileDataSource(filePath);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(new File(filePath).getName());
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("Email sent successfully with the Excel attachment.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
		
	}