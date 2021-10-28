package day04;

public class Sultan {

    public static void main(String[] args) {

        Prison prison = new Prison();

        prison.openFreeCells();

        for (int i = 0; i < prison.getCells().length; i++) {
            if(prison.getCells()[i])
                System.out.println(i);
        }

    }

}
