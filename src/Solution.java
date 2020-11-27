
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
	public static class RatingStatisticsCollectorImpl implements RatingStatisticsCollector {
		Map<String, Integer> myMap = new HashMap<>();

		@Override
		public void putNewRating(String app, int rating) {
			myMap.put(app, rating);
		}

		@Override
		public double getAverageRating(String app) {

			return 0;
		}

		@Override
		public int getRatingsCount(String app) {
			HashMap<Integer, String> duplicatMap = new HashMap<>();

			Set<Entry<String, Integer>> entrySet = myMap.entrySet();
			Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
			while (iterator.hasNext()) {
				Entry<String, Integer> entry = iterator.next();
				String key = entry.getKey();
				Integer value = entry.getValue();

				if (duplicatMap.containsKey(value)) {
					duplicatMap.put(value, duplicatMap.get(value) + ", " + key);
				} else {
					duplicatMap.put(value, key);
				}
			}
//			return duplicatMap.get();
			return 10;
		}
	}

	////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

	public interface RatingStatisticsCollector {
		// Ratings feed will call this method when new app rating information is
		// received. This is input to your class. ratings is a non negative integer
		// between 0 to 10.
		public void putNewRating(String app, int rating);

		// Report the average rating of the app.
		public double getAverageRating(String app);

		// Report the total number of rating for an app.
		public int getRatingsCount(String app);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numLines = Integer.parseInt(scanner.nextLine());
		int currentLine = 0;
		while (currentLine++ < numLines) {
			final RatingStatisticsCollector stats = new RatingStatisticsCollectorImpl();
			final Set<String> apps = new TreeSet<>();

			String line = scanner.nextLine();
			String[] inputs = line.split(",");
			for (int i = 0; i < inputs.length; ++i) {
				String[] tokens = inputs[i].split(" ");
				final String app = tokens[0];
				apps.add(app);
				final int runs = Integer.parseInt(tokens[1]);

				stats.putNewRating(app, runs);

			}

			for (String app : apps) {
				System.out.println(
						String.format("%s %.2f %d", app, stats.getAverageRating(app), stats.getRatingsCount(app)));
			}

		}
		scanner.close();

	}
}