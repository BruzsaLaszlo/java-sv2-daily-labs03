package day02;

public class Mathematics {

    public boolean isPrime(int number) {

        if (number < 2) return false;

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(i + " osztója a {" + number + "}-nak/nek");
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        Mathematics mathematics = new Mathematics();

        System.out.println(mathematics.isPrime(2));
        System.out.println(mathematics.isPrime(29));
        System.out.println(mathematics.isPrime(127));
        System.out.println();
        System.out.println(mathematics.isPrime(119));

    }

}
