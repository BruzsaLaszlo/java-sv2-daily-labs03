package day04;

public class Prison {

    private boolean[] cells = new boolean[100];

    public void openFreeCells() {
        for (int i = 0; i < 100; i++) {
            for (int j = i; j < 100; j += i + 1) {
                cells[j] = !cells[j];
            }
        }
    }

    public boolean[] getCells() {
        return cells;
    }

}
