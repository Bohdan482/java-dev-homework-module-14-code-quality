package TicTacToeGame;

import java.util.Arrays;
import java.util.Random;

public class BoxBuilder {
    public String[] buildArray(String[] box, int input){
        String[] newBox = new String[box.length];
        if (input > 0 && input < 10) {
            if (("X".equals(box[input-1])) || "O".equals(box[input-1])) {
                System.out.println("That one is already in use. Enter another.");
            }else {
                for (int i = 0; i < box.length; i++) {
                    if (box[i].equals(String.valueOf(input))) {
                        newBox[i] = "X";
                    }else
                        newBox[i] = box[i];
                }
            }
        }else {
            System.out.println("Invalid input. Enter again.");
        }
       return newBox;
    }


    public String[] setMachineMove(String[] box){
        WinnerChecker winnerChecker = new WinnerChecker();
                String[] result = new String[box.length];
                boolean isSetted = true;

                if (!winnerChecker.isBoxFull(box)) {
                    while (isSetted) {
                        int randomNumber = new Random().nextInt(1, 10);
                        if (!"X".equals(box[randomNumber - 1]) && !"O".equals(box[randomNumber - 1])) {
                            result = Arrays.copyOf(fillTheArray(box, result, randomNumber), box.length);
                            isSetted = false;
                        }
                    }
                }else {
                    result = Arrays.copyOf(box, box.length);
                }
                return result;
    }

    private String[] fillTheArray(String[] input, String[] output, int number){
            for (int i = 0; i < input.length; i++) {
                if (input[i].equals(String.valueOf(number))) {
                    output[i] = "O";
                } else
                    output[i] = input[i];
            }
            return output;
    }
}
