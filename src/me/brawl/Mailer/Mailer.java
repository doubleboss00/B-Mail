package me.brawl.Mailer;

import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;




public class Mailer implements Listener{
	 
    public Main plugin;
   
    public Mailer(Main instance){
            plugin = instance;
    }
   


	public void onPlayerChat(AsyncPlayerChatEvent e) {
		if(e.getMessage().contains("The british are coming")){
			e.getPlayer().sendMessage(ChatColor.GREEN + "Sent email!");
		}
		}
			
		
   public static void main(String [] args)
   {    
      // Recipient's email ID needs to be mentioned.
      String to = "maxlikeabaws@gmail.com";

      // Sender's email ID needs to be mentioned
      String from = "doubleboss00@gmail.com";

      // Assuming you are sending email from localhost
      String host = "localhost";

      // Get system properties
      Properties properties = System.getProperties();

      // Setup mail server
      properties.setProperty("mail.smtp.google", host);

      // Get the default Session object.
      Session session = Session.getDefaultInstance(properties);

      try{
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO,
                                  new InternetAddress(to));

         // Set Subject: header field
         message.setSubject("Help");

         // Now set the actual message
         message.setText("This is the test message.");

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      
      }catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
}
	
