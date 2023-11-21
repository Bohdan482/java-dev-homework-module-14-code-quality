package TicTacToeGame;

public class BoxPrinter {

    private String[] box;

    public void printBox(String[] box) {
            System.out.println(" " + box[0] + " | " + box[1] + " | " + box[2] + " ");
            System.out.println("-----------");
            System.out.println(" " + box[3] + " | " + box[4] + " | " + box[5] + " ");
            System.out.println("-----------");
            System.out.println(" " + box[6] + " | " + box[7] + " | " + box[8]);
    }

    public String[] getBox() {
        return box;
    }

    public void setBox(String[] box) {
        this.box = box;
    }
}
