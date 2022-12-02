
public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */
		int stuNum1;
		String name1;
		int kor1;
		int eng1;
		int math1;
		int total1;
		double aver1;
		char gpa1;
		int ranks1;
		
		
		int stuNum2;
		String name2;
		int kor2;
		int eng2;
		int math2;
		int total2;
		double aver2;
		char gpa2;
		int ranks2;
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		
		stuNum1 = 1;
		name1 = "김경호";
		kor1 = 42;
		eng1 = 56;
		math1 = 78;
		
		
		stuNum2 = 2;
		name2 = "김경수";
		kor2 = 42;
		eng2 = 56;
		math2 = 78;
		
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		
		
		if(kor1>0 && kor1<100) {
			System.out.println(kor1+" 은 유효한점수가 아닙니다.");
			return;
		}
		
		
		if(eng1>0 && eng1<100) {
			System.out.println(kor1+" 은 유효한점수가 아닙니다.");
			return;
		}
	
		
		if(math1>0 && math1<100) {
			System.out.println(kor1+" 은 유효한점수가 아닙니다.");
			return;
		}
		
		
		if(kor2>0 && kor2<100) {
			System.out.println(kor1+" 은 유효한점수가 아닙니다.");
			return;
		}
		
		
		if(eng2>0 && eng2<100) {
			System.out.println(kor1+" 은 유효한점수가 아닙니다.");
			return;
		}
	
		
		if(math2>0 && math2<100) {
			System.out.println(kor1+" 은 유효한점수가 아닙니다.");
			return;
		}
		
		
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		
		total1 = kor1+eng1+math1;
		
		aver1 = total1/3;
		
		gpa1 = 'X';
		if (aver1 >= 50) {
			gpa1 = 'A';
		} else if (aver1 >= 40) {
			gpa1 = 'B';
		} else if (aver1 >= 30) {
			gpa1 = 'C';
		} else if (aver1 >= 20) {
			gpa1 = 'D';
		} else {
			gpa1 = 'F';
		}
		
		
		ranks1=0;
		
		
		
		
		total2 = kor1+eng1+math1;
		
		aver2 = total2/3;
			
		gpa2 = 'X';
		if (aver2 >= 50) {
			gpa2 = 'A';
		} else if (aver2 >= 40) {
			gpa2 = 'B';
		} else if (aver2 >= 30) {
			gpa2 = 'C';
		} else if (aver2 >= 20) {
			gpa2 = 'D';
		} else {
			gpa2 = 'F';
		}
		
		
		ranks2=0;
		
		
		/*
		- 출력포맷
 		- 평균은 소수점이하 첫째자리까지출력(반올림)
 		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n","학번","이름","국어", "영어","수학","총점","평균","평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", stuNum1,name1,kor1,eng1,math1,total1,aver1,gpa1,ranks1 );
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", stuNum2,name2,kor2,eng2,math2,total2,aver2,gpa2,ranks2 );

	}

}
