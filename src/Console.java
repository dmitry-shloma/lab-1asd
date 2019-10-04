import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Console {
    public static String read(String msg) {
        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void out(String msg) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd, HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(String.format("[%s]: %s", dtf.format(now), msg));
    }
}
