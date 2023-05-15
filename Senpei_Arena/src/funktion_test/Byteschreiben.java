package funktion_test;

import java.io.*;

public class Byteschreiben {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("zahlen1.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		for (int i = 0; i < 10; i++) {
			dos.write(i);
		}
		dos.close();

	}

}
