public class FindNumber {
    public static void main(String[] args) {
        int number = 30;
        int fNumer=2;
        if (fNumer < number) {
            for (int i = fNumer; i < number; i++) {
                System.out.println("Число больше " + fNumer);
                fNumer++;
            }
            System.out.println("Угадали число = " + fNumer);
        }
        if (fNumer > number) {
            for (int i = fNumer; i > number; i--) {
                System.out.println("Число меньше " + fNumer);
                fNumer--;
            }
            System.out.println("Угадали число = " + fNumer);
        }
    }
}
