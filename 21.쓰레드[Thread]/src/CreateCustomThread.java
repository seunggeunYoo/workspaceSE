/*
1. Thread 클래스를 상속받는다. - (인터페이스로 만듬.)
2. Thread class의 run method를 overriding 한다.
동사원형:public void run()
*/
public class CreateCustomThread extends Thread {
	@Override
	public void run() {/*run은 return 이 되면 죽어서 JVM으로 호출*/
		while(true) {
			System.out.println("가"+Thread.currentThread().getName()+" 쓰레드실행");
			System.out.println("나"+Thread.currentThread().getName()+" 쓰레드실행후 반환");
		}
	}

}
