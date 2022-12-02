
public class StudentMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 2명생성
		 */
	
		Student stud1 = new Student();
		Student stud2 = new Student();
		
		
		
		/*
		 * 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		
		stud1.stuNum1 =1;
		stud1.name1 = "김경호";
		stud1.kor1 = 99;
		stud1.eng1 = 99;
		stud1.math1 = 99;
		
		
		stud2.stuNum1 =2;
		stud2.name1 ="김경수";
		stud2.kor1 = 90;
		stud2.eng1 = 90;
		stud2.math1 = 90;
		
		/*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */
		
		stud1.total1 = stud1.kor1+stud1.eng1+stud1.math1;
		stud2.total1 = stud2.kor1+stud2.eng1+stud2.math1;
		
		stud1.aver1 = stud1.total1/3;
		stud2.aver1 = stud2.total1/3;
		
			
				
				stud1.gpa1 = 'X';
		if (stud1.aver1 >= 90) {
			stud1.gpa1 = 'A';
		} else if (stud1.aver1 >= 80) {
			stud1.gpa1 = 'B';
		} else if (stud1.aver1 >= 70) {
			stud1.gpa1 = 'C';
		} else if (stud1.aver1 >= 60) {
			stud1.gpa1 = 'D';
		} else {
			stud1.gpa1 = 'F';
		}
	
		
			
				
				stud2.gpa1 = 'X';
		if (stud2.aver1 >= 90) {
			stud2.gpa1 = 'A';
		} else if (stud2.aver1 >= 80) {
			stud2.gpa1 = 'B';
		} else if (stud1.aver1 >= 70) {
			stud2.gpa1 = 'C';
		} else if (stud2.aver1 >= 60) {
			stud2.gpa1 = 'D';
		} else {
			stud2.gpa1 = 'F';
		}
	
		
		/*
		 * 학생 데이타를 출력 2명
		 */
		
		System.out.println(stud1.stuNum1);
		System.out.println(stud1.name1);
		System.out.println(stud1.kor1);
		System.out.println(stud1.eng1);
		System.out.println(stud1.math1);
		System.out.println(stud1.total1);
		System.out.println(stud1.aver1);
		System.out.println(stud1.gpa1);
		System.out.println(stud1.ranks1);
	
		
		System.out.println(stud2.stuNum1);
		System.out.println(stud2.name1);
		System.out.println(stud2.kor1);
		System.out.println(stud2.eng1);
		System.out.println(stud2.math1);
		System.out.println(stud2.total1);
		System.out.println(stud2.aver1);
		System.out.println(stud2.gpa1);
		System.out.println(stud2.ranks1);
		
		/*- 출력포맷
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
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", stud1.stuNum1,stud1.name1,stud1.kor1,stud1.eng1,stud1.math1,stud1.total1,stud1.aver1,stud1.gpa1,stud1.ranks1 );
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", stud2.stuNum1,stud2.name1,stud2.kor1,stud2.eng1,stud2.math1,stud2.total1,stud2.aver1,stud2.gpa1,stud2.ranks1 );
		  

	}

}
