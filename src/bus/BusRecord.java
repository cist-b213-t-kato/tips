package bus;

public class BusRecord {
	public final long busRecordId;
	public final long busStopTypeId;
	public final long sourceTime;
	public BusRecord(long busRecordId, long busStopTypeId, long sourceTime) {
		this.busRecordId = busRecordId;
		this.busStopTypeId = busStopTypeId;
		this.sourceTime  = sourceTime; 
	}
}
