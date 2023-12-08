public class Main {
    public static void main(String[] args) {
        int number = 13; // Ganti angka ini dengan nilai yang ingin diuji keprimaannya
        if (isPrima(number)) {
            System.out.println(number + " adalah bilangan prima.");
        } else {
            System.out.println(number + " bukan bilangan prima.");
        }
    }

    static boolean isPrima(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
