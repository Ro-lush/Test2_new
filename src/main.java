import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
    static String[] color = new String[]{"R","G","B","W"};
    static int[] number = new int[]{1,2,3,4,5,6,7,8,9,10};
   static ArrayList<String> list = new ArrayList<>();

    static void start(int n, int c) {
        if(n>10 || c>4){
            System.out.println("Введенные числа больше чем максимальные значения" +
                    " С = 4  и N = 10");
            return;
        } else {
        for (int i = 0; i < c; i++) {
            String line = "";

            for (int j = 0; j < n; j++) {
                int colorS = (int) (Math.random()*color.length);
                int numberS = (int) (Math.random()*number.length);
                line=line+color[colorS]+number[numberS]+" ";
            }
            list.add(i,line);
        }
    }
    }

    static void getCards(int c){
        if (c>4|| list.size()==0){
            System.out.println("Введенное число больше чем максимальное значения С = 4"
            + " или игроков нет");
            return;
        }
        System.out.println(c+ " "+ list.get(c-1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков = ");
        int c = scanner.nextInt();
        System.out.print("Введите количество карт = ");
        int n = scanner.nextInt();
        start(n,c);
        System.out.print("Веедите номер игрока = ");
        int number = scanner.nextInt();
        getCards(number);

    }
}
