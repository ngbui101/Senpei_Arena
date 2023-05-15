package funktion_test;

import java.io.*;

public class zitatMain {

	public static String inhaltExtrahieren(String zeile, String tag) {
		String inhalt;
		if (zeile.indexOf("<" + tag + ">") != -1) {
			int beginn = zeile.indexOf(">");
			int ende = zeile.indexOf("<", beginn);
			inhalt = zeile.substring(beginn + 1, ende);
			return inhalt;
		}
		return "-1";
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("zitate.xml"));
		PrintWriter out = new PrintWriter(new FileWriter("zitateTest.txt"));
//		String test = "<name>Hermann Josef Abs</name>";
//		test = inhaltExtrahieren(test, "name");
//		System.out.println(test);
		// Zeile einlesen
		String zeile;
		while ((zeile = in.readLine()) != null) {
			// System.out.println("erste Schleife test");
			if (zeile.indexOf("<person>") != -1) {
//ok				System.out.println("erste Bedingung test");
				String name = "";
				String beschreibung = "";
				String zitat = "";
				while ((zeile = in.readLine()) != null) {
//ok					System.out.println("Test 2.Schleife");
					if (zeile.indexOf("<name>") != -1)
						name = inhaltExtrahieren(zeile, "name");
					else if (zeile.indexOf("<beschreibung>") != -1)
						beschreibung = inhaltExtrahieren(zeile, "beschreibung");
					else if (zeile.indexOf("<zitat>") != -1)
						zitat += inhaltExtrahieren(zeile, "zitat") + " ";
					else
						break;
				}
				String ausgabe = "\"" + zitat.trim() + "\"\n" + name + ", " + beschreibung;
				System.out.println(ausgabe);
				out.println(ausgabe);
			}
		}

		out.flush();
		out.close();
		in.close();

	}

}
