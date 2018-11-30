
public class Problem2869 {
	long day, night, v;
	
	public Problem2869(long day, long night, long v) {
		this.day = day;
		this.night = night;
		this.v = v;
	}
	
	public long getRes() {		
		long cnt = 0;
		
		long remainingDist = v;				
		
		while(true) {			
			long day_ = remainingDist / day == 0 ? 1 : remainingDist / day;
			long night_ = night * (day_ - 1);
			cnt += day_;
			
			remainingDist = remainingDist - (day * day_ - night_);						
			
			
			if (remainingDist <= 0) {
				break;			
			}			
			remainingDist += night;					
		}
		
		return cnt;
	}		
}
