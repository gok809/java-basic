package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {

	public static int sum(int[] values) {
		//return String.valueOf(Arrays.stream(values).sum());

		int total = 0;
		for (int val : values) {
			total += val;
		}
		return total;
	}
	public static double average(int[] values) {
		//return String.valueOf(Arrays.stream(values).average());
		return sum(values) / values.length;
	}
	public static int min(int[] values) {
		//return String.valueOf(Arrays.stream(values).min());
		int minValue = values[0];
		for (int val : values) {
			if (val < minValue) {
				minValue = val;
			}
		}
		return minValue;
	}
	public static int max(int[] values) {
		//return String.valueOf(Arrays.stream(values).max());
		int maxValue = values[0];
		for (int val : values) {
			if (val > maxValue) {
				maxValue = val;
			}
		}
		return maxValue;
	}

}
