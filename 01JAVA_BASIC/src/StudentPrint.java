
public class StudentPrint{

public static void main(String[] args) {
	/*
	 * 성적관리에서 학생2명 데이타를 담을 변수선언
	 * 	- 번호(int), 이름(String), 국어, 영어, 수학, 총점, 평균(double), 평점(A,B,C)(char), 석차(int)
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
	gpa1='X';

	ranks1=0;
	
	stuNum2 = 2;
	name2 = "김경수";
	kor2 = 44;
	eng2 = 53;
	math2 = 48;
	gpa2='A';
	ranks2=0;
	
	/*
	 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
	 * 총점, 평균 계산 후 대입 (평점은 F , 석차는 0을 대입)
	 */
	
	total1 = kor1+eng1+math1;
	total2 = kor2+eng2+math2;
	
	aver1 = total1/3;
	aver2 = total2/3;		
	
	
	/*
	- 출력포맷
		- 평균은 소수점이하 자리수를 잘라버리세요.
		- 석차,평점은 구하지마세요
		
		--------------학생 성적출력-------------------
	학번  이름   국어 영어 수학 총점 평균 평점 석차
	-----------------------------------------------
	 1   김경호   42   56   78   334  89   A    3  
	 2   김경수   45   53   76   334  78   A    2  
	-----------------------------------------------
	*/
	System.out.printf("--------------학생 성적출력-------------------\n");
	System.out.printf("학번  이름   국어 영어 수학 총점 평균 평점 석차\n");
	System.out.printf("-----------------------------------------------\n");
	System.out.printf(" %d    %s     %d   %d   %d  %d   %.1f  %c    %d     \n ",stuNum1,name1,kor1,eng1,math1,total1,aver1,gpa1,ranks1);
	System.out.printf(" %d    %s     %d   %d   %d  %d   %.1f  %c    %d    \n",stuNum2,name2,kor2,eng2,math1,total2, aver2,gpa2,ranks2);
	System.out.printf("-----------------------------------------------\n");

}
}
