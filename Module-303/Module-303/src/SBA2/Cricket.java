package SBA2;

import java.util.Arrays;

public class Cricket {

    int[] playerIDs;

    Cricket() {
        playerIDs = new int[12];
        Arrays.fill(playerIDs, 1);


        System.out.println("A new cricket team has been formed");

    }

    void calculateAvgAge(int[] age) {
        int sum = 0;
        for (int i = 0; i < age.length; i++) {
            sum = sum + age[i];
        }
        double avg = (double) sum / age.length;
        System.out.println("The average age of the cricket team is " + String.format("%.2f", avg));
    }

    void retirePlayer(int id) {
        playerIDs[id] = -1;
        System.out.println("Player with id" + id +" has retired");
        if (playerIDs[id] == -1){
            System.out.println("Player has already retired");
        }
    }

    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        int[] age = {34,45,34,23,45,65,32};
        cricket.calculateAvgAge(age);
        cricket.retirePlayer(3);

        System.out.println(cricket.playerIDs[3]);
        cricket.retirePlayer(11);
    }
}
