package per.owisho.signature.security.ex1;

import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.IOException;

import per.owisho.signature.security.doer.Doer;

public class TextFileDisplayer implements Doer {

	private String fileName;

	public TextFileDisplayer(String fileName) {
		this.fileName = fileName;
	}

	public void doYourThing() {

		try {
			FileReader fr = new FileReader(fileName);
			try {
				CharArrayWriter caw = new CharArrayWriter();

				int c;
				while ((c = fr.read()) != -1) {
					caw.write(c);
				}
				System.out.println(caw.toString());
			} catch (IOException e) {
			} finally {
				try {
					fr.close();
				} catch (Exception e2) {
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
