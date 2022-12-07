
public class CreateCustomThreadMain {

	public static void main(String[] args) {
		/*
		3. Thread 객체를 생성한다. (스레드를 사용해서 스레드를 만들것이다.)
		4. Thread 객체를통해서 Thread를 시작시킨다.
		
		 */
		System.out.println("1.main thread start");
		CreateCustomThread cct = new CreateCustomThread();
		cct.setName("사용자정의쓰레드");
		System.out.println("2.main thread CreateCustomThread객체.start()메소드호출전");
		
		cct.start();/*메인스레드*/
		System.out.println("3.main thread CreateCustomThread객체.start()메소드호출후");
		while(true) {
			System.out.println("4.main thread end return");
		}
		

	}

}
