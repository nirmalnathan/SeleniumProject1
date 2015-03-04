package finalProject;

//import java.net.Authenticator;
import java.util.Properties;
import javax.mail.BodyPart;
import javax.mail.Folder;
//import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Store;

public class MailBabu {

	public static void main(String arg[]){
		getCount();
	}
	
	public static void getCount(){
		Properties props = new Properties();
	    props.put("mail.pop3.host" , "pop.gmail.com");
	    props.put("mail.pop3.socketFactory.class" , "javax.net.ssl.SSLSocketFactory" );
	    props.put("mail.pop3.port" , 995);
	    
	    Session emailSession = Session.getDefaultInstance(props);
	    try {
	    	
	    	// Get the pop store
	        Store store  = emailSession.getStore("pop3");
	        
	        // connect to the store with authentication
	        store.connect("pop.gmail.com" , "TestLeaf001@gmail.com" , "Testleaf123");
	        
	        // get the infox
	        Folder ibox = store.getFolder("INBOX");
	        
	        // open the 
	        ibox.open(Folder.HOLDS_MESSAGES);
	        
	        // get the count
	        int count = ibox.getMessageCount();
	        
	        System.out.println("The number of emails are: "+count);
	        System.out.println("The top email subject is: "+ibox.getMessages()[6].getSubject());
	        System.out.println(ibox.getMessages()[6].getContent());
	        Object msgContent = ibox.getMessages()[6].getContent();
	        
	        String content;
	        
	        if (msgContent instanceof Multipart){
		        Multipart multipart = (Multipart) ibox.getMessages()[6].getContent();
		        BodyPart part = multipart.getBodyPart(0);
		        content = part.getContent().toString();
		     }else
		        content = (String) msgContent;
	        
	        String str = "http://api.checklist.com/account-confirm?email=TestLeaf001@gmail.com&code=";
	        int pos = content.indexOf("http://api.checklist.com/account-confirm?email=TestLeaf001@gmail.com&code=");
	        String str1 = content.substring(pos+str.length());
	        int pos1 = str1.indexOf("target=");
	        
	        System.out.println(str1.substring(1,pos1-1));
	        
	        System.out.println(content);
	    } catch(Exception exc) {
	        System.out.println(exc + " error");
	    }
	}
}
