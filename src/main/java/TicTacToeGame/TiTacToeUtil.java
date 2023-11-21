package TicTacToeGame;

import java.util.Scanner;

public class TiTacToeUtil {

    public static void main(String[] args) {
        BoxPrinter boxPrinter = new BoxPrinter();
        BoxBuilder boxBuilder = new BoxBuilder();
        WinnerChecker winnerChecker = new WinnerChecker();
        Scanner scanner = new Scanner(System.in);

        boxPrinter.setBox(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"});
        String[] box = boxPrinter.getBox();

        System.out.println("Enter box number to select. Enjoy!");
        boxPrinter.printBox(box);

        boolean goOnLooping = true;
        while (goOnLooping) {
            String[] ticTacToeBox = boxBuilder.buildArray(boxPrinter.getBox(), scanner.nextInt());
            String[] arreyWithOMove = boxBuilder.setMachineMove(ticTacToeBox);
            boxPrinter.setBox(arreyWithOMove);
            boxPrinter.printBox(boxPrinter.getBox());
            if (winnerChecker.checkWinner(boxPrinter.getBox()) == 0
                        || winnerChecker.checkWinner(boxPrinter.getBox()) == 1){
                    System.out.println(winnerChecker.sayWhoWon(boxPrinter.getBox()));
                    goOnLooping = false;
            }
        }
        scanner.close();
    }
}