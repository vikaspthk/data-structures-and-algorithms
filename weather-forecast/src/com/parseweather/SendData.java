/************************************************************************************
 *Program will Broadcast Weather info continuously until user stops program manually*
 * Auther: Vikas Pathak                                                             *
 * Submitted to: Mr. Ravi Gupta                                                     *
 ************************************************************************************/

package com.parseweather;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.LinkedList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendData {
    
    /*************Implementing Producer and Consumer using Circular Buffer****************/
    
    LinkedList<String> list=new LinkedList<>();
    int capacity=3;
    
  /***************Method to Add City Weather data in the Buffer *************************/
    
    public void addData() throws InterruptedException, ParserConfigurationException, IOException, MalformedURLException, SAXException{
        ParseData d=new ParseData();
        String[] city={"agra","mumbai","Delhi","Lahore"};
        int i=0;
        while(true){
            synchronized(this){
                /*********Wait till the Buffer is Full*******/
                if(list.size()>capacity)
                {
                    wait();
                }
                 else
               /***************Add info to Buffer if Not full***********/
                    list.add(d.getXML(city[i]));
                    notify(); //notify consumer to consume data
                    Thread.sleep(200);
                    i++;
                    if(i==4){i=0;}
        
                    }
                }
            }
  /**************************Method to Remove info from Buffer*********/
    
    public void consumeData() throws InterruptedException{
        while(true){
            synchronized(this){
                /*-----------wait till Buffer is empty------*/
                if(list.size()==0)
                {
                    wait();
                }
                else
                {
                    String info=list.remove(); //removing data from buffer
                    sendEmail(info);
                    System.out.println(info);
                    notify(); //notify producer to produce data
                    //Thread.sleep(250);
                }
            }
        }}
  /************Method to Broadcast the Weather Information via Email**********/
    
    public void sendEmail(String msg){
        String to="vikas.pathak@vikas.com";
        Properties pro=new Properties();
        pro.put("mail.smtp.host", "smtp.gmail.com");
        pro.put("mail.smtp.socketFactory.port", "465");
        pro.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        pro.put("mail.smtp.auth", "true");
        pro.put("mail.smtp.port", "465");
        Session session = Session.getDefaultInstance(pro,new javax.mail.Authenticator()
        {
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication("email","password");
            }
        });
        try
        {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(to));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject("Weather Information for you!!");
            message.setText(msg);
            Transport.send(message);
            System.out.println("Weather info. Broadcasted....");
        }
        catch(MessagingException e)
        {
            Logger.getLogger(SendData.class.getName()).log(Level.SEVERE, null, e);
        }
    }
  /***************Main method to start Producer and Consumer Threads**************/
    
    public static void main(String arg[]) throws ParserConfigurationException, IOException, MalformedURLException, SAXException, InterruptedException{
        SendData b=new SendData();
        Thread t1 = new Thread(new Runnable()
        {
            public void run()
            {
                try
                {
                    while(true){
                        b.addData();
                    }
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                } catch (ParserConfigurationException ex) {
                    Logger.getLogger(SendData.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(SendData.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SAXException ex) {
                    Logger.getLogger(SendData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            public void run()
            {
                try
                {
                    b.consumeData();  
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
