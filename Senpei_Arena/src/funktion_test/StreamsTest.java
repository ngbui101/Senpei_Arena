package funktion_test;

import java.io.*;
import java.nio.charset.StandardCharsets;
public class StreamsTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		Writer writer = null;
		try {
			fos = new FileOutputStream("Test.txt",true);
			writer = new BufferedWriter(new OutputStreamWriter(fos,StandardCharsets.US_ASCII));
			writer.write(251);
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();	
		} finally {
			try {
				writer.flush();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
