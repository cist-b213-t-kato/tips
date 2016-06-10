package bus;

public class BusStopTime {
	public final long busStopTimeId;
	public final long busStopTypeId;
	public final String stationName;
	public final long additionTime;
	public BusStopTime(long busStopTimeId, long busStopTypeId, String stationName, long additionTime) {
		this.busStopTimeId = busStopTimeId;
		this.busStopTypeId = busStopTypeId;
		this.stationName = stationName;
		this.additionTime = additionTime;
	}
	
}
