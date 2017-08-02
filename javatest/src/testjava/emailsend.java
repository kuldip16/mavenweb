package testjava;

import java.io.*;  
 import java.util.*;  
 import java.util.concurrent.TimeUnit;  
 import javax.mail.*;  
 import javax.mail.internet.*;  
 import org.openqa.selenium.By;  
 import org.openqa.selenium.WebDriver;  
 import org.openqa.selenium.WebElement;  
 import org.openqa.selenium.firefox.FirefoxDriver;  
 import javax.activation.*;  
 public class emailsend {  
   static Properties prop = null;  
   static String urls = "";  
   static File file;  
   public static void main(String[] args) throws IOException {  
     List<WebElement> urllist = new ArrayList();  
     // Initialize driver  
     WebDriver driver = new FirefoxDriver();  
     //Maximize browser window  
     driver.manage().window().maximize();  
     //Go to URL  
     driver.get("https://www.yahoo.com/");  
     //Set timeout  
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
     urllist = driver.findElements(By.tagName("a"));  
     try 
     {  
       for (WebElement url : urllist) {  
         if ((url.getAttribute("href").trim().length() > 4) && (url.getAttribute("href").trim().contains("yahoo.com")) && !(url.getAttribute("href").trim().contains("javascript:void(0)"))) {  
           urls = urls + url.getAttribute("href").trim() + "\n";  
         }  
       }  
     } catch (NullPointerException e) {  
       //   e.printStackTrace();  
     }  
     try {  
       file = new File("Internetlinks.txt");  
       // if file doesnt exists, then create it  
       if (!file.exists()) {  
         file.createNewFile();  
       }  
       // Write text on txt file.  
       FileWriter fw = new FileWriter(file, true);  
       BufferedWriter bw = new BufferedWriter(fw);  
       bw.write(urls);  
       bw.close();  
     } catch (IOException e) {  
       e.printStackTrace();  
     }  
     System.out.println(urls);  
     //close firefox browser  
     driver.close();  
     // Recipient's email ID needs to be mentioned.  
     String to = "hiromia006@gmail.com";  
     // Assuming you are sending email from localhost  
     String host = "localhost";  
     // Create FileInputStream Object  
     FileInputStream fileInput = new FileInputStream(new File("data.properties"));  
     // Create Properties object  
     prop = new Properties();  
     //load properties file  
     prop.load(fileInput);  
     // Get system properties  
     Properties properties = System.getProperties();  
     // Setup mail server  
     properties.setProperty("mail.smtp.host", host);  
     properties.put("mail.smtp.starttls.enable", "true");  
     properties.put("mail.smtp.host", "smtp.gmail.com");  
     properties.put("mail.smtp.user", prop.getProperty("From_email")); // User name  
     properties.put("mail.smtp.password", prop.getProperty("From_email_password")); // password  
     properties.put("mail.smtp.port", "587");  
     properties.put("mail.smtp.auth", "true");  
     Authenticator authenticator = new Authenticator() {  
       public PasswordAuthentication getPasswordAuthentication() {  
         return new PasswordAuthentication(prop.getProperty("From_email"), prop.getProperty("From_email_password"));//userid and password for "from" email address  
       }  
     };  
     // Get the default Session object.  
     Session session = Session.getDefaultInstance(properties, authenticator);  
     try {  
       // Create a default MimeMessage object.  
       MimeMessage message = new MimeMessage(session);  
       // Set From: header field of the header.  
       message.setFrom(new InternetAddress(prop.getProperty("From_email")));  
       // Set To: header field of the header.  
       message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));  
       // Set Subject: header field  
       message.setSubject("Yahoo Home page internet links attached text field");  
       // Create the message part  
       BodyPart messageBodyPart = new MimeBodyPart();  
       // Fill the message  
       messageBodyPart.setText("have sent Yahoo home page url list by attached file");  
       // Create a multipar message  
       Multipart multipart = new MimeMultipart();  
       // Set text message part  
       multipart.addBodyPart(messageBodyPart);  
       // Part two is attachment  
       messageBodyPart = new MimeBodyPart();  
       DataSource source = new FileDataSource("Internetlinks.txt");  
       messageBodyPart.setDataHandler(new DataHandler(source));  
       messageBodyPart.setFileName("Internetlinks.txt");  
       multipart.addBodyPart(messageBodyPart);  
       // Send the complete message parts  
       message.setContent(multipart );  
       // Send message  
       Transport.send(message);  
       System.out.println("Sent message successfully....");  
     } catch (MessagingException mex) {  
       mex.printStackTrace();  
     }  
   }  
 }  