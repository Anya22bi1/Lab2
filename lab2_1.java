import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class lab2_1 {
    public static void main(String args[]) {
        System.out.println("Введите дату в формате dd/mm/yyyy: ");
        Scanner scanner = new Scanner(System.in);
        String pattern0 = "^((0[1-9])|([12][0-9])|(3[01]))/((0[0-9])|(1[012]))/((19[0-9][0-9])|([2-9][0-9][0-9][0-9]))$";
        String pattern1 = "((0[1-9])|([12][0-8]))/(02)/((19[0-9][0-9])|([2-9][0-9][0-9][0-9]))";
        String pattern2 = "((0[1-9])|([12][0-9])|(30))/((04)|(06)|(09)|(11))/((19[0-9][0-9])|([2-9][0-9][0-9][0-9]))";
        String pattern3 = "((0[1-9])|([12][0-9])|(3[01]))/((01)|(03)|(05)|(07)|(08)|(10)|(12))/((19[0-9][0-9])|([2-9][0-9][0-9][0-9]))";
        String text = scanner.nextLine();
        Pattern p0 = Pattern.compile(pattern0);
        Matcher m0 = p0.matcher(text);
        Pattern p1 = Pattern.compile(pattern1);
        Matcher m1 = p1.matcher(text);
        Pattern p2 = Pattern.compile(pattern2);
        Matcher m2 = p2.matcher(text);
        Pattern p3 = Pattern.compile(pattern3);
        Matcher m3 = p3.matcher(text);

        if (!(m0.matches())) {
            System.out.println("Введённая дата некорректна (dd/mm/yyyy/)");
            System.exit(1);
        }
        if ((m1.matches())|(m2.matches())|(m3.matches())) {
            System.out.println("Введённое выражение является датой");
        } else {
            System.out.println("Данное выражение не является датой");
        }
    }
}
