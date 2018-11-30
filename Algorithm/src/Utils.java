
public class Utils {
	public static int[] getIntegerArray(String[] param) {
    	int[] result = new int[param.length];
    	
    	for(int i = 0; i < param.length; i++) {
    		result[i] = Integer.parseInt(param[i]);
    	}
    	
    	return result;
    }
	
	public static long[] getLongArray(String[] param) {
    	long[] result = new long[param.length];
    	
    	for(int i = 0; i < param.length; i++) {
    		result[i] = Long.parseLong(param[i]);
    	}
    	
    	return result;
    }
}
