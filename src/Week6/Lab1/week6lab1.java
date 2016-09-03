package Week6.Lab1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class week6lab1 {

	public static void main(String[] args) throws IOException {
		File writtenText = new File("Lab6.txt");
				
		FileOutputStream output = new FileOutputStream("temp.dat");
		
		 byte[] textInBytes = GUIReadWrite.WriteTextArea.getText().getBytes();
			output.write(textInBytes);
		
			output.close();
	
		
	}
}

