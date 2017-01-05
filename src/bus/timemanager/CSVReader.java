package bus.timemanager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CSVReader extends FileReader{
    private BufferedReader br;

    public CSVReader(String fileName) throws FileNotFoundException {
            super(fileName);
            br = new BufferedReader(this);
    }

    //csvのレコードを表現するString[]型を返す
    public String[] readRecord(){
        String line;
        try {
            if((line = br.readLine()) != null){
                return line.split(",");
            }else{
                br.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    @Override
    public void close(){
        try {
            super.close();
        } catch (IOException ex) {
            Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}