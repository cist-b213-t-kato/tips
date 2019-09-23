/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiren.kudo;
//import org.netbeans.modules.java.j2seproject.copylibstask.CopyLibs;

/*
 *
 */
public class Shiren {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Gauge gauge = new Gauge();
        try{
        gauge.setValue(200);
        System.out.println(gauge.getValue());
        gauge.setValue(1000);
        System.out.println(gauge.getValue());
        }catch(IllegalArgumentException ex){
            System.out.println("Capacity Over!");
        }
    }
}
