//โปรแกรมคำนวณค่าจอดรถ
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        Scanner kb = new Scanner(System.in);
        x = kb.nextInt();
        if (x <= 60) {
            y = 0;
            System.out.println(y);
        } else {
            int z, a;
            z = x - 60;
            a = (z + 59) / 60;
            y = a * 10;

            System.out.println(y);
        }
