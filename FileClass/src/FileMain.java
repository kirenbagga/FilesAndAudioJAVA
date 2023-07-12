import java.io.File;

public class FileMain {
	public static void main(String[] args) {
		
		File file=new File("log1.txt");
		if(file.exists()) {
			System.out.println("file exists");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			file.delete();
		}
		else {System.out.println("file dosent exist");}
	}

}
