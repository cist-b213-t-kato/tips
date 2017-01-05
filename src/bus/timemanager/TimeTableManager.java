
package bus.timemanager;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class MainFrame extends JFrame{
	public MainFrame(){
		initialize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 800, 100);
		setVisible(true);
	}

	public void initialize(){}

}

public class TimeTableManager {


    public static void main(String[] args){

        MainFrame frame = new MainFrame(){
        	public void initialize(){
                        final TimeTableManager ttm = new TimeTableManager();
                        String[] combodata = new String[ttm.stations.size()];
                        for(int i=0; i<combodata.length; i++){
                                combodata[i] = ttm.stations.get(i).name;
                        }
        		setTitle("一番近い時間は？");
        		setSize(100, 200);
        		JPanel p = new JPanel(new GridLayout(1, 2));

        		final JComboBox combo = new JComboBox(combodata);
        		final JTextField textField = new JTextField(new SimpleDateFormat("HH:mm").format(new Date()));
        		final JLabel label = new JLabel(ttm.method3((String)combo.getSelectedItem(), textField.getText()));
        		label.setFont(new Font("メイリオ", Font.PLAIN, 30));
        		combo.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						label.setText(ttm.method3((String)combo.getSelectedItem(), textField.getText()));
					}
        		});
        		combo.setFont(new Font("メイリオ", Font.PLAIN, 24));

        		textField.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						label.setText(ttm.method3((String)combo.getSelectedItem(), textField.getText()));
					}
        		});
        		textField.setFont(new Font("メイリオ", Font.PLAIN, 30));

                        /*
                        JLabel messageLabel = new JLabel("到着時刻");
                        messageLabel.setHorizontalAlignment(JLabel.RIGHT);
                        messageLabel.setFont(new Font("メイリオ", Font.PLAIN, 20));
                        p.add(messageLabel);
                        */

        		p.add(combo);
        		p.add(textField);
        		p.add(label);

        		getContentPane().add(p, BorderLayout.WEST);
        	}
        };

    }

	class Station{
		public String name;
		public ArrayList<String> departureTime = new ArrayList<>();
	}

	public ArrayList<Station> stations = new ArrayList<Station>();


    public TimeTableManager(){
        try {
            CSVReader csvr = new CSVReader("./src/bus/TimeTable.csv");
            String[] buf;
            for(int i=0; (buf = csvr.readRecord())!=null; i++){
            	Station bufStation = new Station();
                bufStation.name = new String(buf[0]);
	            for(int j=0; j<buf.length-1; j++){
	                bufStation.departureTime.add(new String(buf[j+1]));
	            }
            	stations.add(bufStation);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(TimeTableManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String method3(String stationName, String cT){

    	double currentTime = TimeToMinute(cT);

    	Iterator<Station> itr = stations.iterator();

    	while(itr.hasNext()){
    		Station station = itr.next();
    		if(station.name.equals(stationName)){
    	    	for(int i=0; i<station.departureTime.size(); i++){
    	    		if(currentTime < TimeToMinute(station.departureTime.get(i)) ){
    	    			return station.departureTime.get(i);
    	    		}
    	    	}
    			return station.departureTime.get(0);
    		}
    	}
    	return null;

    }


    public void method2(){

        String sPlace = "千歳駅";
        String dPlace = "本部棟";

        Iterator<Station> itr = stations.iterator();

        while(itr.hasNext()){
            System.out.println("hoge");
                    /*
		    if(.equals(timeTableRecord[0]) && dPlace.equals(timeTableRecord[1])){
		        System.out.println(sPlace+"から発車して"+dPlace+"に到着するまで"+timeTableRecord[2]+"分かかります");
		    }
                    */
        }

        String time;

    }


    public static int TimeToMinute(String time){
        String[] s = time.split(":");
        if(s.length!=2){
            //System.out.println("!引数は不正な時刻");
            return 0;
        }
        int buf = Integer.parseInt(s[0])*60+Integer.parseInt(s[1]);
        return buf;
    }

    public static String MinuteToTime(int minute){
        String buf = ""+minute/60+":"+minute%60;
        return buf;
    }


    public void method1(){
        try {
            CSVReader cr = new CSVReader("./src/bus/ElapsedTime.csv");
            String[] s;
            while( (s = cr.readRecord())  != null){
                System.out.println(s[0]+"から"+s[1]+"まで"+s[2]+"分かかります");
            }
            cr.close();

        } catch (FileNotFoundException ex) {
        }
    }





}
