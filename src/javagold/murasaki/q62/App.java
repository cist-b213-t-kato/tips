package javagold.murasaki.q62;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class App {
	public static void method(Path path, String attribute) {
		try {
			Object obj = Files.getAttribute(path, attribute);
			System.out.println(obj);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			BasicFileAttributes attrs =
					Files.readAttributes(Paths.get("/Users/tkato"),
					BasicFileAttributes.class);
			System.out.println(attrs.lastModifiedTime());
			System.out.println(attrs.lastAccessTime());
			System.out.println(attrs.creationTime());
		} catch (IOException e) {
			e.printStackTrace();
		}
		method(Paths.get("/Users/tkato"), "creationTime");
//		method(Paths.get("/Users/tkato"), "readonly");
	}
}
