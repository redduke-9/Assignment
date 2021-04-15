import java.io.*;
public class Input3 {
	public static void main(String[] args) {
		try {
		File file = new File("D:\\test.txt");
		FileWriter fr = new FileWriter(file, true);
		fr.write("\nvannakam");
		fr.close();
	}
		catch(IOException e) {
			e.printStackTrace();
		}
}
}
