package RandomQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockPrice {

	public static List<Integer> lowStockPriceDays(List<Integer> prices) {
		List<Integer> result = new ArrayList<Integer>();
		Integer count = 0;
		for(int i = 0; i < prices.size(); ++i) {
			count = 0;
			for(int j = i; j >= 0; --j) {
				if(prices.get(j) <= prices.get(i)) {
					count += 1;
				}
				else break;
			}
			result.add(count);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Integer[] i = {100,60,70,65,80,85};
		List<Integer> input = Arrays.asList(i);
		System.out.println(lowStockPriceDays(input));
	}

}
