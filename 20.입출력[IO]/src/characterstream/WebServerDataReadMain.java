package characterstream;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;



public class WebServerDataReadMain {

	public static void main(String[] args) throws Exception {
		/********html(text)***********/
		URL urlStr = new URL("http://image1.lottetour.com/static/trvtour/201909/723/30fe1a9df8f3aac93c34e5d2b80f694a.jpg");
		InputStream in = urlStr.openStream();
		FileOutputStream fout=new FileOutputStream("image.jpg");
		while(true) {
			int readByte=in.read();
			if(readByte==-1)break;
			fout.write(readByte);
			System.out.println((char)readByte);
		}
		in.close();
		fout.close();
		

	}

}
