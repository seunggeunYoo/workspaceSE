public class Child1 extends Parent {
	/*
	public int member1;
	public int member2;
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}
	위에는 부모정보*/
	public int member3;/*<---- 왜 member3 이냐면
						위에 부모 상속이 member1이 있기 
						때문에 3부터 시작을 한다.*/
	public int member4;
	public void method3() {
		System.out.println("Child1.method3()");
	}
	public void method4() {
		System.out.println("Child1.method4()");
	}
}