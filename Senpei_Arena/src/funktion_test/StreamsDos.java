package funktion_test;
import java.io.*;
public class StreamsDos {

	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("TestFOS.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(1);
		dos.writeDouble(1.1);
		dos.close();
		int i = 10;
		PrintStream p = new PrintStream(System.out);
		p.print(i);
		p.close();
	}

}
