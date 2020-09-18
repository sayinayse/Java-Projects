import java.util.Arrays;
public class Main {
 	public static int[] loadfromPorts (int[] options, int x){
		Arrays.sort(options);
		int low = 0, high = (options.length - 1);
 		int[] ports  = {0,0};
			
		while(low < high){
			if(options[low] + options[high] == x){
				ports[0] = options[low];
				ports[1] = options[high];
				return ports;
			}
			if(options[low] + options[high] < x){
				low++;
			}
			else{
				high--;
			}
		}	
		System.out.println("Pair not found");
		return ports;
}

public static void main(String[] args) {
	int[] options = {3, 7, 6, 10};
	//int[] options = {3, 2, 4};
	int x = 9;
    int[] result = loadfromPorts(options, x);
    System.out.println("Two ports with the sum " + x + " is (" + result[0] 
                    + ", " + result[1] + ")");
  }
}

