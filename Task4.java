import java.util.Scanner;

public class Task4 {

    private static String getInput(String message) throws NonInputValue{
        System.out.println(message);
        try(Scanner scanner = new Scanner(System.in)){
            String input = scanner.nextLine();
            if (input.equals("")){
                throw new NonInputValue("ввод пустой строки");
            }
            else{
                return input;
            }
        }
    }
    

    public static void main(String[] args) throws NonInputValue {
        System.out.println(getInput("Введите что-то: "));
    }
}
