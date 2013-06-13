import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;


public class miTwitterControlador {
	
	private String condumerKey="utn0j5Nmzg8ui3I3cwayw";
	private String consumerScret="4ipQydg06ck1Jw4HYviBFj1PJsfcO24rCb2NkByFBBw";
	private String accessToken="1345804141-UojF3OkQmAIbIRLD8WNW9jaeCVwhOxgRQY8mRTX";
	private String accessTokenSecret="wAFDYFyFQo02wqwUvKQKNR9O15RobJvtzh3wn33k4";
	private Twitter t;
	private String username;
	private String pass;
	
	public miTwitterControlador() {
		
		ConfigurationBuilder cb=new ConfigurationBuilder();
		cb.setDebugEnabled(true)
			.setOAuthConsumerKey(condumerKey)
			.setOAuthConsumerSecret(consumerScret)
			.setOAuthAccessToken(accessToken)
			.setOAuthAccessTokenSecret(accessTokenSecret);
		TwitterFactory tf=new TwitterFactory(cb.build());
		t=tf.getInstance();
		
	
	}
	
	public Twitter getTwitterInstance(){
		return t;
	}
	
	public List<Status> getTimeLine() throws TwitterException{
		Twitter twitter=this.getTwitterInstance();
		List<Status> statuses=twitter.getHomeTimeline();
		return statuses;
		/*System.out.println("Mostrando principal Time Line");
		for(Status status:statuses){
			System.out.println(status.getUser().getName()+":"+status.getText());
		}*/
	}
	
	public void PostTwitter(String msg) throws TwitterException{
		Twitter t=this.getTwitterInstance();
		Status status=t.updateStatus(msg);
		System.out.println("Mensaje["+status.getText()+"]");
	}
	
	  public void setCredentials(String username, String pass)
	  {         
		  this.username = username;         
		  this.pass = pass;    
		  } 


}
