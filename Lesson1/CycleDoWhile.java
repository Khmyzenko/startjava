public class CycleDoWhile{

    public static void main(String[] args){

        int value = 10;
        int summ =0;
        do {
            if (value % 2 != 0){
                summ = summ + value;
            }
            value++;
        } while (value<=20);
        System.out.println(summ);
    }
}