package _08_clean_code_refactoring.exercise.tennis_game;

public class TennisGame {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;

    public static String getScore(String firstPlayerName, String SecondPlayerName, int firstPersonScore, int secondPersonScore) {
        String string = "";
        int tempScore = 0;
        if (firstPersonScore == secondPersonScore) {
            string = result(firstPersonScore);
        } else if (firstPersonScore >= 4 || secondPersonScore >= 4) {
            string = win(firstPersonScore, secondPersonScore);
        } else {
            string = currentScore(firstPersonScore, secondPersonScore, string);
        }
        return string;
    }

    public static String result(int firstPersonScore) {
        String string;
        switch (firstPersonScore) {
            case ZERO:
                string = "Love-All";
                break;
            case ONE:
                string = "Fifteen-All";
                break;
            case TWO:
                string = "Thirty-All";
                break;
            case THREE:
                string = "Forty-All";
                break;
            default:
                string = "Deuce";
                break;
        }
        return string;
    }

    public static String win(int firstPersonScore, int secondPersonScore) {
        String string;
        int minusResult = firstPersonScore - secondPersonScore;
        if (minusResult == 1) {
            string = "Advantage player1";
        } else if (minusResult == -1) {
            string = "Advantage player2";
        } else if (minusResult >= 2) {
            string = "Win for player1";
        } else {
            string = "Win for player2";
        }
        return string;
    }

    public static String currentScore(int firstPersonScore, int secondPersonScore, String string) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = firstPersonScore;
            else {
                string += "-";
                tempScore = secondPersonScore;
            }
            switch (tempScore) {
                case ZERO:
                    string += "Love";
                    break;
                case ONE:
                    string += "Fifteen";
                    break;
                case TWO:
                    string += "Thirty";
                    break;
                case THREE:
                    string += "Forty";
                    break;
            }
        }
        return string;
    }
}