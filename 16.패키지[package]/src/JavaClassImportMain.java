import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;
import com.itwill.shop.product.Product;

/*
import java.lang.*;
java.lang package에있는 클래스는 import 구문생략가능
 */
public class JavaClassImportMain {

	public static void main(String[] args) {
		System.out.println("---------java.lang package------------");
		java.lang.String str1="임포트";
		String str2="김경호";
		Object obj=new Object();
		System.out.println(Math.random());
		
		InputStream in;
		OutputStream out;
		Socket socket;
		
		ShopService shopService;
		Member m;
		Product p;
		
		
		

	}

}