import twitter4j.TwitterException;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws TwitterException{
		// TODO Auto-generated method stub
		miTwitterControlador t=new miTwitterControlador();
		t.getTimeLine();
		//t.PostTwitter("<3");
		
		Ventana tp=new Ventana();
		tp.setVisible(true);
		
	}

}
