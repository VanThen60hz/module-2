package ss8_clean_code_mvc.excercise;

public class TennisGame {
    public static String getScore(String playerFirstName, String playerSecondName, int mScoreFirst, int mScoreSecond) {
        String result = "";
        int tempScore = 0;
        if (mScoreFirst == mScoreSecond) {
            switch (mScoreFirst) {
                case 0:
                    result = "Love-All";
                    break;
                case 1:
                    result = "Fifteen-All";
                    break;
                case 2:
                    result = "Thirty-All";
                    break;
                case 3:
                    result = "Forty-All";
                    break;
                default:
                    result = "Deuce";
                    break;

            }
        } else if (mScoreFirst >= 4 || mScoreSecond >= 4) {
            int score = mScoreFirst - mScoreSecond;
            if (score == 1) result = "Advantage player1";
            else if (score == -1) result = "Advantage player2";
            else if (score >= 2) result = "Win for player1";
            else result = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = mScoreFirst;
                else {
                    result += "-";
                    tempScore = mScoreSecond;
                }
                switch (tempScore) {
                    case 0:
                        result += "Love";
                        break;
                    case 1:
                        result += "Fifteen";
                        break;
                    case 2:
                        result += "Thirty";
                        break;
                    case 3:
                        result += "Forty";
                        break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getScore("King", "Queen", 3,1));
    }
}