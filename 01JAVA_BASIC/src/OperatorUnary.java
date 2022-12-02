
public class OperatorUnary {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		
		int ar = -a;
		int br = +b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(ar);
		System.out.println(br);
		
		
		boolean isPlay=true;
		System.out.println(isPlay);
		isPlay=!isPlay;
		System.out.println(isPlay);
		
		
		int kor=90;
		boolean isValldScore = kor >= 0 && kor <=100;
		System.out.println(isValldScore);
		boolean isInvalidScore = !isValldScore;
		System.out.println(isInvalidScore);
		
		/*
		 * 증가, 감소, 연산자
		 * - 합은 반드시 변수이여야 한다.
		 * - 형태 : ++, --
		 * - 항변수의값을 정수1 만큼 증가(감소)시킨후 항변수에 대입
		 */
		System.out.println("-----------[++i,--i]-------------------");
		int i=5;
		int j=5;
		++i;// i = i+1;
		--j;// j=j-1;
		System.out.println(i);
		System.out.println(j);
		System.out.println("-----------[++i,--i]-------------------");
		i=5;
		j=5;
		j++;
		i--;
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("----------[i++ , ++i]-----------");
		i=5;
		j=5;
		System.out.println(++i);
		System.out.println(j++);//5 이후에 증가이기 때문에 지금 상태의 값이 나옴 그래서 5가 나옴.
		System.out.println(i);
		System.out.println(j);// 여기서는 결과 값이 나오기 때문에 6이 나온다.
		
	

	}

}
