package lang;

public class StringUseMain {

	public static void main(String[] args) {
		String str1="Have a nice day!!!";
		String str2="오늘은 금요일 String 클래스를 공부해요.";
		System.out.println("==========length============");
		int length1=str1.length();
		int length2=str2.length();
		int length3="자바가 재미있네요".length();
		String emptyStr="";/**/
		int length4=emptyStr.length();
		System.out.println(length1);
		System.out.println(length2);
		System.out.println(length3);
		System.out.println(length4);
		System.out.println("-------------null----------------");
//		String id=null;
		String id="";
		if(id==null || id.equals("")) {
			System.out.println("아이디를 입력하세요.!");
		}
		System.out.println("------------------substring-----------------");
		System.out.println("Have a nice day!!!".substring(7));
		System.out.println("Have a nice day!!!".substring(7,11));
		System.out.println("오늘은 금요일 String 클레스를 공부해요.".substring(4, 7));
		System.out.println("오늘은 금요일 String 클레스를 공부해요.".substring(4));
		
		System.out.println("---------------charAt--------------------------");
		String userId="testST#00";
		char firstChar = userId.charAt(0);
		System.out.println(">>아이디의첫글자는 영문대(소)문자여야한다.");
		if(firstChar>='a' && firstChar<='z' || (firstChar>='A'&& firstChar<='Z')) {
			System.out.println(firstChar+" 는 아이디첫글자로 유효합니다.");
		}else { System.out.println(firstChar+"는 아이디첫글자로 유효합니다.");
		
		}
		for(int i=0; i<userId.length();i++) {
			char tempChar = userId.charAt(i);
			System.out.println(tempChar+":"+(int)tempChar);/*int 붙으면 숫자로 된다.*/
		}
		System.out.println("---------------split--------------");
		String cardNo="123-456-8990-4562";
		String[] cardNoArray=cardNo.split("-");/* - 를 없애고 출력하는 방법*/
		for(String tempNo:cardNoArray) {
			System.out.println(tempNo);
		}
		System.out.println("---------replace---------");
		String str3="자바는 객체지향언어입니다. 우리는 자바를 공부합니다.";
		String result3=str3.replace('자', '멀').replace('객', '개');
		System.out.println(result3);
		System.out.println(str3.replace("자바", "파이썬"));
		System.out.println(str3);
		System.out.println("--------------toUpperCase,toLowerCase------------");
		System.out.println("JAvA".toUpperCase());
		System.out.println("JAvA".toLowerCase());
		System.out.println("-------------startsWith,endsWith-----------------");
		String name="김경호";
		if(name.startsWith("김")) {
			System.out.println("김씨인사람:"+name);
		}
		System.out.println("------친구들-------");
		String[] names= {"정경호","김미숙","최경녀","김은희","신명숙"};
		for(int i=0; i<names.length;i++) {
			if(names[i].startsWith("김")) {
				System.out.println(names[i]);
			}
		}
		/*
		 * Quiz:
		 * 김씨를 새로운 배열에담아보세요.
		 */
		String[] kimArray=null;
		
		
		
		
		
		System.out.println("---------------endsWith----------------");
		String fileName="a.jpg";
		if(fileName.endsWith(".jpg")|| fileName.endsWith(".gif")) {
			System.out.println("이미지파일입니다:"+fileName);
		}
		System.out.println("----------------trim-------------------");
		String id2=" guar d ";
		System.out.println(id2.length());
		System.out.println(id2.trim().length());
		String chatMessge="                             ";
		if(chatMessge.trim().length()==0) {
			System.out.println("전송안함");
		}
		if(chatMessge.trim().equals("")) {
			System.out.println("전송안함");
		}
	}
}
