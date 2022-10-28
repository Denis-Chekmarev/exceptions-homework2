import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Task1
 */
public class Task1 {


    private static float getFloat(String message, String errorMessage){
        System.out.println(message);
        try(Scanner scanner = new Scanner(System.in)){
            while (true){
                try{
                    return scanner.nextFloat();
                }
                catch(InputMismatchException e){
                    System.out.println(errorMessage);
                    scanner.nextLine();
                }
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(getFloat("Введите дробное число: ", "Некорректный ввод, попробуйте снова: "));
    }
}