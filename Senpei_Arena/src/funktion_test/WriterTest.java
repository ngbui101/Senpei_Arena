package funktion_test;

import java.io.*;

public class WriterTest {

	public static void main(String[] args) throws IOException {
		PrintWriter p = new PrintWriter(new FileWriter("testWriter.txt"));
		p.println("In eine Datei schreiben");
		p.println("Zweite.");
		p.flush();
		p.close();

	}

}
