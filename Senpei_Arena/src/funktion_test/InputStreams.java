package funktion_test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreams {

	public static void main(String[] args) throws IOException{
//		int o = System.in.read();
//		System.out.println(o);
		FileOutputStream fos = new FileOutputStream("zahlen.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(9);
		//dos.writeInt(0);
		dos.writeDouble(9.6);
//		for(int i = 0; i < 10; i++) 
//			fos.write(i+1);
		dos.close();
		FileInputStream fis = new FileInputStream("zahlen.txt");
//		for (int i = 0; i < 10; i++) {
//			System.out.println(fis.read());
//		}
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		dis.close();		
	}

}
