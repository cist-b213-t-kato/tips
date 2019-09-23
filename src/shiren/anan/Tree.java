/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiren.anan;

import java.io.File;

/**
 *
 * @author user
 */
public class Tree implements Execute{

    public  void dumpFile(File file, int level){
        File[] files = file.listFiles();     
        if(files == null){
            return;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < level; i++){
            sb.append("  ");
        }
        String indent = sb.toString();
        
        System.out.println(indent + "*" + file.getName());
        
        for (File tmpFile : files) {
            if(tmpFile.isDirectory()){
                dumpFile(tmpFile, level + 1);
            }else{
                System.out.println(indent + "|-" + tmpFile.getName());
            }
        }
    }

    @Override
    public void execute() {
        dumpFile(new File(System.getProperty("user.dir")), 0);
    }
}
