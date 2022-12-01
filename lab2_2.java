import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class lab2_2 {
    public static void main(String args[]) {
        System.out.println("Введите пароль: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String password = scanner.nextLine();
            String pattern0 = "((?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z0-9_]{8,})";
//в пароль должно быть как минимум по одной:
//Заглавная, строчная, цифра(всего 8)
            Pattern p0 = Pattern.compile(pattern0);
            Matcher m0 = p0.matcher(password);
            if ((m0.matches())) {
                System.out.println("Пароль надёжный");
                System.exit(0);
            } else {
                System.out.println("Пароль ненадёжный");

            }
        }
    }
}
