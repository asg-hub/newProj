import java.util.Scanner;

public class Operators {

public static void main(String[] args) {

    String A = args[0];
    String B = args[1];
    String C = args[2];

    int A2 = Integer.parseInt(A);
    int B2 = Integer.parseInt(B);
    int C2 = Integer.parseInt(C);

    System.out.println("Первое число "+ A2);
    System.out.println("Второе число "+ B2);

    System.out.println("Третье число "+ C2);

    System.out.println( B2 == C2    ?   "Второе число равно третьем" : A2 == B2
                                    ?   "Первое число равно второму" : A2 == C2
                                    ?   "Первое число равно третьему":
                                        "Ни одно из чисел не равно друг другу");

    if (A2 > B2 && A2 != C2) {
        System.out.println("Первое число больше чем второе");
        System.out.println("И Первое число не равно третьему");
    } else if (A2 == B2) {
        System.out.println("Первое и второе число равны"); // кого ты хочешь надурить, малец?
    } else if (C2 % B2 == 0) {
         System.out.println("Третье число кратно второму");
    } else if (A2 > B2){
         System.out.println("Второе число больше чем Первое");
    }

    }
}
