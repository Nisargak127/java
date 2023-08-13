package lab1;

public class Proxyemailservice implements emailservice{
	emailservice es=(emailservice) new realemailservice();

	public void receivemail()
	{
		es.receivemail();
	}
	@Override
	public void sendmail() {
		// TODO Auto-generated method stub
		es.sendmail();
	}
	
}
