import java.util.Scanner;

public class Main {
    public static int Calculator(int a, int b, char c) {

        int result;
        result = 0;
        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Вы ввели неверные данные");

        }
        System.out.println(result);
        return result;

    }
    public static void Sum(int a, int b) {
        var result = a + b;
        System.out.println(result);;
    }
    public static void Delenie(int a, int b) {
        var result = a / b;
        System.out.println(result);;
    }
    public static void Proizvedneie(int a, int b) {
        var result = a * b;
        System.out.println(result);;
    }

    public static void Raznost(int a, int b) {
        var result = a - b;
        System.out.println(result);;
    }



    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int number;
        int number2;
        int number3;
        int number4;
        int number5;
        char operation;

//Задание 1
        System.out.println("Для получение суммы чисел, введите первое число");
        number = scanner1.nextInt();
        System.out.println("Для получение суммы чисел, введите второе число");
        number2 = scanner1.nextInt();
        Sum(number,number2);
//Задание2
        System.out.println("Для получение значения при делении, введите первое число");
        number = scanner1.nextInt();
        System.out.println("Для получение значения при делении, введите второе число");
        number2 = scanner1.nextInt();
        Delenie(number,number2);

//Задание3
        System.out.println("Для получение значения при умножении, введите первое число");
        number = scanner1.nextInt();
        System.out.println("Для получение значения при умножении, введите второе число");
        number2 = scanner1.nextInt();
        Proizvedneie(number,number2);

//Задание4
        System.out.println("Для получение значения разности, введите первое число");
        number = scanner1.nextInt();
        System.out.println("Для получение значения разности, введите второе число");
        number2 = scanner1.nextInt();
        Raznost(number,number2);


//Задание5
        System.out.println("Необходимо ввести 5 чисел, введите число № 1");
        number = scanner1.nextInt();
        System.out.println("Введите число № 2");
        number2 = scanner1.nextInt();
        System.out.println("Введите число № 3");
        number3 = scanner1.nextInt();
        System.out.println("Введите число № 4");
        number4 = scanner1.nextInt();
        System.out.println("Введите число № 5");
        number5 = scanner1.nextInt();
        int[] massiv = {number,number2,number3,number4,number5};
        int s = massiv[0];
        int l = massiv[0];
        int g = massiv[0];

        for(int i = 1; i < massiv.length; i++) {//min/max
            if(massiv[i] > l)l = massiv[i];
            else if (massiv[i] < s)s = massiv[i];
        }

        for (int j = 0; j < massiv.length; j++) { //среднее арифм.
            g += massiv[j];
        }
        System.out.println("Максимум: " + l);
        System.out.println("Минимум: " + s);
        System.out.println("Среднее арифметическое: " + g/massiv.length);
        System.out.print("Вывод чисел массива: ");
        for (int i = 0; i < massiv.length; i++) {

            System.out.print(massiv[i]+", ");
        }
        System.out.println();
//Калькулятор
        System.out.println("Калькулятор");
        System.out.println("Введите число № 1");
        number = scanner1.nextInt();
        System.out.println("Введите арифметическое действие");
        operation =scanner1.next().charAt(0);
        System.out.println("Введите число № 2");
        number2 = scanner1.nextInt();
        Calculator(number,number2,operation);
    }
}