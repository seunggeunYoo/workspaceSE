/*
	형변환--> 숫자형데이타간에만 가능
	    - 형식 :  (데이타타입)변수 or 리터럴;
	    - 자동형변환(작은데이타-->큰데이타타입변수):promotion
		     byte-->short-->int-->long-->float-->double
	    - 자동형변환안됨(큰데이타-->작은데이타타입변수):casting
		     double-->float-->long-->int-->short-->byte     
   */

public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * 자동형변환
		 */
		int i1=56;
		long l1 = i1;
		double d1=l1;
		System.out.println(d1);
		/*
		 * 강제형변환
		 */
		double avgd = 89.6;
		int avgi = (int)avgd;// 소수점 날리고 정수로 변환
		System.out.println(avgd);
		System.out.println(avgi);
		
		char c='힇';
		int ci = c;
		System.out.println(ci);
		char c1 = (char)ci;
		System.out.println(c1);
		
		/*
		 * 연산시의 형변환
		 * 	- 연산형들중에 가장 큰타입으로 모든항이 형변환된다.
		 * 안짤리게 할려고 하는 것.
		 */
		int ii=100;
		long ll=435435;
		double dd=0.12;
		double result = ii+ll+dd;// int로 하게 되면 숫자가 넘어서 double로 바꿔서 실행.
		System.out.println(result);
		
		

	}

}
