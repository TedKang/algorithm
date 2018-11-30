import java.util.*;


public class Test {
	private static Stack<Integer> combinations;
	private static int sum = 0;
	private static int arrSize = 0;
	private static int result = 0;
	
	/*
    public static void main(String[] args) {
        int[] arr;
        int[] arr2;        
        
        Scanner sc = new Scanner(System.in);
        Test.combinations = new Stack<Integer>();
        
        //Remove Duplicate Elements and sort.
        String[] temp = sc.nextLine().split(" ");
        arr = Test.getIntegerArray(temp);
        
        temp = sc.nextLine().split(" ");
        arr2 = Test.getIntegerArray(temp);
        
        //Get Intersection
        Test.calcIntersectionCount(arr, arr2);
        
        //Output
        System.out.println(result);
        
    }*/
    
    public static int[] getIntegerArray(String[] param) {
    	int[] result = new int[param.length];
    	
    	for(int i = 0; i < param.length; i++) {
    		result[i] = Integer.parseInt(param[i]);
    	}
    	
    	return result;
    }
    
    public static boolean checkElementSum() {
    	boolean result = false;
    	int tmp = 0;
    	
    	for (int i = 0; i < Test.combinations.size(); i++) {
    		tmp += Test.combinations.get(i);    		
    	}    	    	
    	
    	if (tmp == sum) {
    		result = true;
    	}
    	
    	return result;
    }
    
    public static void calcIntersectionCount(int[] param, int[] param2) {
    	arrSize = param[0];
    	sum = param[1];
    	
    	for (int i = 1; i <= arrSize; i++) {
    		Test.setCombination(arrSize, i, param2, 0);	
    		System.out.println(arrSize + "C" + i + " case:");
    	}    	
    }
    
    public static void setCombination(int n, int r, int[] param, int idx) {    	    	
    	if (r == 0) {
    		if (Test.checkElementSum()) { result++;}    		
    	} else if (n == r) {
    		for (int i = 0; i < n; i++) {
    			Test.combinations.add(param[idx + i]);
    		}    		
    		if (Test.checkElementSum()) { result++;}
    		for (int i = 0; i < n; i++) {
    			Test.combinations.pop();
    		}
    	} else {    		
    		Test.combinations.add(param[idx]);
    		Test.setCombination(n-1, r-1, param, idx + 1);
    		
    		Test.combinations.pop();    		
    		Test.setCombination(n-1, r, param, idx + 1);    		
    	}    	    
    } 
}