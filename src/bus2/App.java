package bus2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	static List<BusRecord> busRecordList = new ArrayList<>();
	static List<BusStopTime> busStopTimeList = new ArrayList<>();
	static List<BusStopType> busStopTypeList = new ArrayList<>();
	
	public static void main(String[] args) {

		busRecordList.add(new BusRecord(1, 3, 470));
		busRecordList.add(new BusRecord(2, 2, 480));
		busRecordList.add(new BusRecord(3, 3, 480));
		busRecordList.add(new BusRecord(4, 2, 501));
		busRecordList.add(new BusRecord(5, 1, 510));
		busRecordList.add(new BusRecord(6, 3, 515));

		busStopTimeList.add(new BusStopTime(1, 1, "千歳駅", 0));
		busStopTimeList.add(new BusStopTime(2, 1, "南千歳駅", 9));
		busStopTimeList.add(new BusStopTime(3, 1, "研究棟", 18));
		busStopTimeList.add(new BusStopTime(4, 1, "本部棟", 21));
		busStopTimeList.add(new BusStopTime(5, 2, "南千歳駅", 0));
		busStopTimeList.add(new BusStopTime(6, 2, "研究棟", 9));
		busStopTimeList.add(new BusStopTime(7, 2, "本部棟", 12));
		busStopTimeList.add(new BusStopTime( 8, 3, "千歳駅", 0));
		busStopTimeList.add(new BusStopTime( 9, 3, "研究棟", 15));
		busStopTimeList.add(new BusStopTime(10, 3, "本部棟", 18));
		
		String currentPlace = "南千歳駅";
		long currentTime = 480;
		
		System.out.println(piyo());
		for(BusRecord br : busRecordList){
			System.out.println(hoge(br));
		}
		System.out.println();

		System.out.println("現在位置 " + currentPlace);
		System.out.println("現在時刻 " + transTime(currentTime));
		System.out.println("次のバスの時刻は" + transTime(nearestTime(currentPlace, currentTime)) + "です");
		
		
	}
	
	public static long nearestTime(String currentPlace, long currentTime){

		for(BusRecord br : busRecordList){
			HashMap<String, Long> map = fuga(br);
			if(map.containsKey(currentPlace) && map.get(currentPlace) > currentTime ){
				return map.get(currentPlace);
			}
		}
		
		//TODO いかんでしょ
		for(BusRecord br : busRecordList){
			HashMap<String, Long> map = fuga(br);
			if(map.containsKey(currentPlace)){
				 return map.get(currentPlace);
			}
		}
		return -1;
	}
	
	public static String transTime(long time){
		
		String minute = String.format("%1$02d", time%60);
		
		return String.valueOf(time/60) + ":" + minute;
	}
	
	public static HashMap<String, Long> fuga(BusRecord busRecord){
		//busRecordのタイプと一致するBusStopTimeのリストを取得する
		List<BusStopTime> busStopTimeFilteredList = busStopTimeList.stream()
			.filter(o->o.busStopTypeId==busRecord.busStopTypeId)
			.collect(Collectors.toList());
		
		long value = busRecord.sourceTime;
		
		HashMap<String, Long> map = new HashMap<>();
		for( BusStopTime bst : busStopTimeFilteredList){
			map.put(bst.stationName, value + bst.additionTime);
		}
		
		return map;
	}
	
	public static String hoge(BusRecord busRecord){

		List<BusStopTime> busStopTimeAllList = busStopTimeList.stream()
			.filter(o->o.busStopTypeId==1)
			.collect(Collectors.toList());
		
		StringBuilder sb = new StringBuilder();
		
		HashMap<String, Long> map = fuga(busRecord);
		
		for( BusStopTime bst : busStopTimeAllList){
			if(map.containsKey(bst.stationName)){
				sb.append(transTime(map.get(bst.stationName)));
			}else{
				sb.append("-");
			}
			sb.append("\t");
		}
		
		return sb.toString();
	}
	
	public static String piyo(){

		//busRecordのタイプと一致するBusStopTimeのリストを取得する
		List<BusStopTime> busStopTimeFilteredList = busStopTimeList.stream()
			.filter(o->o.busStopTypeId==1)
			.collect(Collectors.toList());
		
		StringBuilder sb = new StringBuilder();
		for( BusStopTime bst : busStopTimeFilteredList){
			sb.append(bst.stationName);
			sb.append("\t");
		}
		return sb.toString();
	}
	
	
}
