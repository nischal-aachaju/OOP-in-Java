import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Scanner;

public class EmailService {
    public static void sendParcelEmail(String toEmail, String trackingId, String status) {
        final String fromEmail ="sthanischal5060@gmail.com";
        final String password ="****************"; // here is your secrete key

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {

            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(fromEmail));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));

            msg.setSubject("DOKO Parcel Update - " + trackingId);

            msg.setText(
                "Hello Customer,\n\n" +
                "Your parcel has been updated.\n\n" +
                "Tracking ID: " + trackingId + "\n" +
                "Status: " + status + "\n\n" +
                "Thank you for using DOKO Parcel System."
            );

            Transport.send(msg);

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            System.out.println("Failed to send email!");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== DOKO Parcel Email System ===");

        System.out.print("Enter customer email: ");
        String email = sc.nextLine();

        System.out.print("Enter tracking ID: ");
        String trackingId = sc.nextLine();

        System.out.print("Enter parcel status: ");
        String status = sc.nextLine();

        sendParcelEmail(email, trackingId, status);

        sc.close();
    }
}
