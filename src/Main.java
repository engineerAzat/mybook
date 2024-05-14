public class Main {
    public static void main(String[] args) {

        {      //
            System.out.println("\nЗадача 1\n");    // Переменые Урок первый
            System.out.println("1 2 3 4 5 6 7 8 9 10");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }

        }

        {
            //
            System.out.println("\n\nЗадача 2\n");
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            System.out.println("Сумма чисел от 1 до 100: " + sum);
        }

        {
            //
            System.out.println("\n\nЗадача 3\n");
            long sum = 1L;
            for (int i = 1; i <= 65; i++) {
                sum = sum * i;
            }
            System.out.println("Факториал числа 100: " + sum);
        }

        {
            //
            System.out.println("\n\nЗадача 3\n");
            int a = 12;
            if (a % 2 == 0) {
                System.out.println("Число " + a + " простое");
            } else {
                System.out.println("Число " + a + " не простое");
            }
        }




    }

    }
