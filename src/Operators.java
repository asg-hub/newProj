import java.util.Scanner;

public class Operators {

public static void main(String[] args) {

    String A = args[0];
    String B = args[1];
    String C = args[2];
    //System.out.println(A);

    int A2 = Integer.parseInt(A);
    int B2 = Integer.parseInt(B);
    int C2 = Integer.parseInt(C);

    System.out.println("������ ����� "+ A2);
    System.out.println("������ ����� "+ B2);
    System.out.println("������ ����� "+ C2);

    System.out.println( B2 == C2 ?  "������ ����� ����� �������": A2 == B2 ?
                                    "������ ����� ����� �������": A2 == C2 ?
                                    "������ ����� ����� ��������":
                                    "�� ���� �� ����� �� ����� ���� �����");

    if (A2 > B2 && A2 != C2) {
        System.out.println("������ ����� ������ ��� ������");
        System.out.println("� ������ ����� �� ����� ��������");
    } else if (A2 == B2) {
        System.out.println("������ � ������ ����� �����"); // ���� �� ������ ��������, �����?
    } else if (C2 % B2 == 0) {
         System.out.println("������ ����� ������ �������");
    } else if (A2 > B2){
         System.out.println("������ ����� ������ ��� ������");
    }




//    Scanner in = new Scanner(System.in);
//    System.out.println("������:");
//    int n3 = in.nextInt();
//    System.out.println("result 2 = " + n3);

//        int result1 = 5;
//        int result2 = result1++;//6
//        System.out.println("result 2 = " + result2);
//        System.out.println("result 2 = " + result2);
//        int result3 = result1 + result2;//11
//        System.out.println("result 3 = " + result3);
//        int templ = 0;
//        if(result1 == result2 && result3 / templ > 0) {
//            System.out.println("magic");
//        } else {
//            System.out.println("��� ������ �� 0. ������!");
//        }
    }
}
