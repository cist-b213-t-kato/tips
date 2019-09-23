package javagold.murasaki.ch08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter(new File("gold.txt"))) {
			fw.write("比嘉");
			fw.flush();
			fw.write("かじゅま");
			System.exit(-1);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public static void method() {
		try (DataOutputStream dos = new DataOutputStream(
				new FileOutputStream("gold.txt"));
			DataInputStream dis =  new DataInputStream(
					new FileInputStream("gold.txt"));
				) {

			dos.writeInt(100);

		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
