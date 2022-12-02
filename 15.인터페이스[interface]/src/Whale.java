
public class Whale implements Mammalia   {

	@Override
	public void operation1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void operation2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void operation3() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Whale whale=new Whale();
		whale.operation1();
		whale.operation2();
		whale.operation3();
		Mammalia mamalia = whale;
		
		mamalia.operation1();
		mamalia.operation2();
		mamalia.operation3();
	}
	

}
