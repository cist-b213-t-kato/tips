import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CodeIQ {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        try {
            while (true) {
                String line = br.readLine();
                if (line == null || line.length() == 0) {
                    break;
                }
                String[] keyValues = line.split(",");
                map.put(keyValues[0], keyValues[1]);
            }
        } finally {
            br.close();
        }

        if(map.containsKey("java")){
            System.out.println(map.get("java").toUpperCase());
        } else {
        	System.out.println("");
        }
        if(map.containsKey("ruby")){
            System.out.println(map.get("ruby").toUpperCase());
        } else {
        	System.out.println("");
        }
        if(map.containsKey("go")){
            System.out.println(map.get("go").toUpperCase());
        } else {
        	System.out.println("");
        }
    }

}
