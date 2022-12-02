
public class CarFactoryStaticMain {

	public static void main(String[] args) {
//		Car.count=0;
		Car c1=new Car(1, "K3", "RED");
		Car.count++;
		Car c2=new Car(2, "K5", "GREEN");
		Car.count++;
		Car c3=new Car(3, "K7", "BLUE");
		Car.count++;
		
		System.out.println(
				"차량총생산대수:"+Car.count);
		Car/*static이 붙으면서 사용할수 있다.*/.headerPrint();
		c1.print();
		c2.print();
		c3.print();

	
	
	}

}
