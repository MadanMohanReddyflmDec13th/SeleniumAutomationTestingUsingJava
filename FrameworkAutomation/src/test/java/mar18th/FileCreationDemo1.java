package mar18th;

import java.io.File;
import java.io.IOException;

public class FileCreationDemo1 {

	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\FLM13thDec\\FileCraetionExample.txt");
		f.createNewFile();
		System.out.println("End of Program");
	}

}
