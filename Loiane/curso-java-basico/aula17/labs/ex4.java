package labs;

public class ex4 {

    public static void main(String[] args) {

        int paisA = 80000;
        int paisB = 200000;
        int anos = 0;

        while (paisA < paisB) {
            paisA = (int) (paisA + ((paisA * 3) / 100));
            paisB = (int) (paisB + ((paisB * 1.5) / 100));
            anos++;
        }
        System.out.println("País A: " + paisA);
        System.out.println("País B: " + paisB);
        System.out.println("anos: " + anos);
    }
}