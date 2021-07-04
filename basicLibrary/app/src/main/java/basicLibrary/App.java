/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basicLibrary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

//    public static void main(String[] args) {
//        System.out.println(new App().getGreeting());
//    }

    public static String weatherData(int[][] weeklyMonthTemperatures) {
        HashSet<Integer> weatherSet = new HashSet<>();
        StringBuilder solve = new StringBuilder();
        for (int[] ints : weeklyMonthTemperatures) {
            for (int day : ints) {
                weatherSet.add(day);
            }
        }
        if (weatherSet.isEmpty()) return "0";
        int min = weeklyMonthTemperatures[0][0], max = weeklyMonthTemperatures[0][0];
        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {

                for (int j = 0; j < weeklyMonthTemperatures[i].length; j++) {
                    if (weeklyMonthTemperatures[i][j] >= max) {
                        max = weeklyMonthTemperatures[i][j];
                    }
                    if (weeklyMonthTemperatures[i][j] <= min) {
                        min = weeklyMonthTemperatures[i][j];
                    }
                }


        }
        solve.append("High: ").append(max).append("\n");
        solve.append("Low: ").append(min).append("\n");
        for (int i = min; i < max; i++) {
            if (!weatherSet.contains(i))
                solve.append("Never saw temperature: ").append(i).append("\n");
        }
        return solve.toString();
    }
    public static String tally(List<String> votes) {

        HashSet<String> votedItems = new HashSet<>();
        votedItems.addAll(votes);

        int numVotes = 0;
        String winner = null;

        for (String item : votedItems) {
            int count = Collections.frequency(votes, item);
            if (numVotes < count) {
                numVotes = count;
                winner = String.format("%s received the most votes!", item);
            } else if (numVotes == count) {
                winner = "Tie for the winner, a re-vote is needed";
            }
        }

        return winner;
    }

    public static void main(String[] args) {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println(weatherData(weeklyMonthTemperatures));
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");
    }
}