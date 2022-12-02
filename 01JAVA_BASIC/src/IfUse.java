
public class IfUse {

	public static void main(String[] args) {
		/*
		 * 짝수, 홀수판별
		 */
		int no1=51;
		
		if(no1%2==0) {
			System.out.printf("%d 은 %s입니다.\n",no1,"짝수"); //%d(숫자) 당 한개의 값을 입력 ,%s는 짝수를 의미함
			
		}else {
			System.out.printf("%d 은 %s입니다.\n",no1,"홀수");
		}
		/*
		 * 4의 배수판별
		 */
		int no2=4000;
		if(no2%4==0) {
			System.out.printf("%d 는 4의배수\n",no2);
		}else {
			System.out.printf("%d 는 4의배수아님\n",no2);
		}
		/*
		 * 점수의 유효성체크
		 */
		int kor = -90;
		if(kor>=0 && kor <=100) {
			System.out.printf("%d는 유효한점수입니다.\n",kor);
		}else {
			System.out.printf("%d는 유효한점수 아닙니다.\n",kor);
		}
		/*
		 * 율년여부출력
		 */
		int year=2022;
		String msg="";
		if(year%4==0 && year%100!=0|| year%400==0) {
			msg="율년";
			
		}else {
			
		}
		System.out.printf("%d 는 %s 입니다.",year,msg);
		/*
		 * 공배수
		 */
		int no3=45;
		if(no3==0 && no3%4==0) {
			System.out.printf("%10d 는 3과4의\t 공배수입니다.\n",no3);//10은 전체자릿수를 의미한다.
		}else {
			System.out.printf("%d 는 3과4의\t 공배수가 아닙니다.\n",no3);
		}
		/*
		 * 문자판단
		 */
		char c='X';
		if(c>='A' && c<='Z') {
			System.out.printf("%c 는 알파벳대문자입니다.\n",c);
		}
		c='9';
		if(c>='0' && c<='9') {
			System.out.printf("%c 는 숫자형대문자입니다.\n",c);
		}

		/* Quiz:
			 다음문자는 아이디의 첫글자입니다. 
			 이문자가 아이디의 첫글자로 유효한지판단후출력하세요 
			   - 아이디의첫글자는 알파벳대문자 이거나 소문자이다
			 */
		

//		int kor = -90;
//		if(kor>=0 && kor <=100) {
//			System.out.printf("%d는 유효한점수입니다.\n",kor);
//		}else {
//			System.out.printf("%d는 유효한점수 아닙니다.\n",kor);
		
		
		
		char idFirstLetter='g'; 
		
		if((idFirstLetter>='A' && idFirstLetter<='Z')||(idFirstLetter>='a' && idFirstLetter<='z')) {
			System.out.printf("%c 는 유효한문자입니다.\n", idFirstLetter);
		}else {
			System.out.printf("%c 는 유효안한문자입니다.\n", idFirstLetter);
			
		}
		
		
		
//		char idFirstLetter='F';
//		if(idFirstLetter>=65 && idFirstLetter <=72) {
//			System.out.printf("%d는 유효한다.\n",idFirstLetter);
//			
//		}else {
//			System.out.printf("%d는 유효안합니다.\n",idFirstLetter);
//			
//		}
//		if(idFirstLetter >='A' && idFirstLetter <='G') {
//			System.out.printf("%c 는 알파벳대문자입니다.\n",idFirstLetter);
			
		}
		
	}


