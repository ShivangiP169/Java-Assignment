package Sample;
import java.io.FileWriter;
import java.io.IOException;
public class File_Handling {

	public static void main(String[] args) {
		try {
			FileWriter java = new FileWriter("Java.txt");
			java.write("Java is high level,"
					+"Programming Language");
			java.close();
			System.out.println("File Created");
		}
		catch(IOException e) {
			System.out.println("File not Found Error");
			
			
		}
	}

}
