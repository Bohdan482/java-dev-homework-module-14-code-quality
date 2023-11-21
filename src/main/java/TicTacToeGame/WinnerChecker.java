package TicTacToeGame;


public class WinnerChecker {
    public int checkWinner(String[] box) {
        int result;
        if (isPlayerWinner(box)){
            result = 0;
        } else if (isMachineWinner(box)){
            result = 0;
        }else if (isBoxFull(box)) {
            result = 1;
        }else {
            result = 2;
        }
        return result;
    }

    public String sayWhoWon(String[] box) {
        String result = "";
        if (isPlayerWinner(box)) {
            result = "You won the game!\nCreated by Shreyas Saha. Thanks for playing!";
        } else if (isMachineWinner(box)) {
            result = "You lost the game!\nCreated by Shreyas Saha. Thanks for playing!";
        } else if (isBoxFull(box)) {
            result = "It's a draw!\nCreated by Shreyas Saha. Thanks for playing!";
        }
            return result;
    }

    public boolean isBoxFull(String[] box){
            boolean boxFull = true;
        for (String s : box) {
            if (!s.equals("X")  && !s.equals("O")) {
                boxFull = false;
                break;
            }
        }
            return boxFull;
        }

        private boolean isPlayerWinner(String[] box) {
            return (box[0].equals("X") && box[1].equals("X") && box[2].equals("X"))
                    || (box[3].equals("X") && box[4].equals("X") && box[5].equals("X"))
                    || (box[6].equals("X") && box[7].equals("X") && box[8].equals("X"))
                    || (box[0].equals("X") && box[3].equals("X") && box[6].equals("X"))
                    || (box[1].equals("X") && box[4].equals("X") && box[7].equals("X"))
                    || (box[2].equals("X") && box[5].equals("X") && box[8].equals("X"))
                    || (box[0].equals("X") && box[4].equals("X") && box[8].equals("X"))
                    || (box[2].equals("X") && box[4].equals("X") && box[6].equals("X"));
        }
        private boolean isMachineWinner(String[] box){
        return (box[0].equals("O") && box[1].equals("O") && box[2].equals("O"))
                || (box[3].equals("O") && box[4].equals("O") && box[5].equals("O"))
                || (box[6].equals("O") && box[7].equals("O") && box[8].equals("O"))
                || (box[0].equals("O") && box[3].equals("O") && box[6].equals("O"))
                || (box[1].equals("O") && box[4].equals("O") && box[7].equals("O"))
                || (box[2].equals("O") && box[5].equals("O") && box[8].equals("O"))
                || (box[0].equals("O") && box[4].equals("O") && box[8].equals("O"))
                || (box[2].equals("O") && box[4].equals("O") && box[6].equals("O"));
        }
}
