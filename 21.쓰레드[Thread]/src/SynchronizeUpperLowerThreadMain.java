
public class SynchronizeUpperLowerThreadMain {

	public static void main(String[] args) {
		SynchronizeUpperLowerPrintSharedObject sharedObject = 
				new SynchronizeUpperLowerPrintSharedObject();
		/*
		 * 객체는 2개이상은 안됨.
		 */
		
		SynchronizeUpperThread upperThread = 
				new SynchronizeUpperThread(sharedObject);
		SynchronizeLowerThread lowerThread = 
				new SynchronizeLowerThread(sharedObject);

		upperThread.start();
		lowerThread.start();
		
	}
}
