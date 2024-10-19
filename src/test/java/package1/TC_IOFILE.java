package package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class TC_IOFILE {
	FileInputStream fromfile;
	FileOutputStream tofile;
	
	public void init(String source,String dest) {
		try {
			fromfile=new FileInputStream(source);
			tofile=new FileOutputStream(dest);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void copycontents() {
		try {
			int i=fromfile.read();
			while(i!=-1) {
				tofile.write(i);
				i=fromfile.read();
			}
		}catch(IOException e) {
			System.out.println("Exception:"+e.getMessage());
		}
	}
	
	public void closefiles() {
		try {
			fromfile.close();
			tofile.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sourcefile="Source.txt";
		String destfile="Destination.txt";
		TC_IOFILE obj=new TC_IOFILE();
		obj.init(sourcefile, destfile);
		obj.copycontents();
		obj.closefiles();
		
	}
}
