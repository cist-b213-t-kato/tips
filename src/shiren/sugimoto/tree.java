package shiren.sugimoto;

import java.io.File;

public class tree extends Keisan {
    String dirName = "C:\\hajiboot-a\\kato3";
int hie = 0;
    void execute() {
        File directory = new File(dirName);
        File[] subFiles = directory.listFiles();

        for (int i = 0; i < subFiles.length; i++) {
            if (subFiles[i].isDirectory()) {
                hierarchy(hie);
                System.out.println(subFiles[i].getName());
                hie= hie + 1;
                dirName = subFiles[i].getPath();
                execute();
                hie = hie - 1;
            }
            if (subFiles[i].isFile()) {
                hierarchy(hie);
                System.out.println(subFiles[i].getName());
            }
        }
    }

    void hierarchy(int hie) {
        switch (hie) {
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print(" *");
                break;
            case 2:
                System.out.print("  *");
                break;
            case 3:
                System.out.print("   *");
                break;
            case 4:
                System.out.print("    *");
                break;


        }
    }
}
