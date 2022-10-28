public class Task3 {

    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }


    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }
        catch (ArithmeticException ex) {
            System.out.println("[ОШИБКА] Деление на ноль");
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
}