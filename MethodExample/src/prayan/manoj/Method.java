package prayan.manoj;

public class Method {

    public static void main (String[] args) {

        //for Initial Score Calculation
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;

        //initially defined for score calculation

        int finalScore = calculateScore(true, score, levelCompleted, bonus);
        System.out.println("Your final score is " + finalScore);

        //For identifying Specific user position depending on different manual score

        int highScorePosition = calculateHighScorePosition(10000);
        displayHighScorePosition("Manoj" , highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Roy" , highScorePosition);

        highScorePosition = calculateHighScorePosition(200);
        displayHighScorePosition("Chayan" , highScorePosition);

        highScorePosition = calculateHighScorePosition(0);
        displayHighScorePosition("TestUser" , highScorePosition);



    }


    //Method to determine the Score


    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }

    public static int calculateHighScorePosition(int playerScore) {

//        if(playerScore >= 1000) {
////            return 1;
////        } else if(playerScore >= 500) {
////            return 2;
////        } else if(playerScore >= 100) {
////            return 3;
////        }
////
////        return 4;
        int position = 4;  // assuming position 4 will be returned for default

        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }

        return position;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }




}
