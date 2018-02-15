
public class AdjacentElementsProduct {

	int adjacentElementsProduct(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			int first = inputArray[i];
			int second = inputArray[i + 1];
			if (first > second) {
				return first;
			}

		}
		return second;

	}

}
