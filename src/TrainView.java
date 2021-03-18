import java.time.LocalTime;
import java.util.Scanner;

class TrainView {        // View
    Scanner in;
    String menu = """
                Меню:
                1 - вывести все поезда
                2 - отфильтровать по наличию общих мест (4 класса)
                3 - отфильтровать по заданному пункту назначения и отправлению после заданного времени
                4 - выход из программы
                """;

    String timeFormat = "HH:MM";

    TrainView() {
        in = new Scanner(System.in);
    }

    void scannerSkip()
    {
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    }

    int menuPrompt() {
        System.out.println(menu);
        int res = in.nextInt();
        scannerSkip();
        return res;
    }

    String destinationPrompt() {
        System.out.println("Введите место назначения: ");
        return in.nextLine();
    }

    LocalTime timePrompt() {
        System.out.println("Введите время отправления (в формате HH:MM)");
        return LocalTime.parse(in.nextLine());
    }

    void printException(RuntimeException ex) {
        System.out.println(ex.getMessage());
    }

    void printInvalidInput() {
        System.out.printf("Неправильный формат ввода!%n");
    }

}
