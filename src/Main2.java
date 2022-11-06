public class Main2 {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 3");
        System.out.println("Задание 1");
        int year = 2022;
        int BeforeYear = year - 200;
        int afterYear = year + 100;
        int i = 0;
        while (i < afterYear ) {
            i += 79;
            if(i > BeforeYear && i < afterYear){
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println("Задача 2");
        int a = 2;
        int b = 1;
        for (; b <= 10; b++) {
            int c = a * b;
            System.out.println(a + "*" + b + "=" + c);
        }

    }
}
