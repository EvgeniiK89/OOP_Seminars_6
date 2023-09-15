import java.util.InputMismatchException;

public class Program {

    public static void main(String[] args) {

        Order order = new Order();
        ConsoleInput input = new ConsoleInput();
        Saver saver = new Saver();
        input.inputFromConsole(order);

        /*
        Определяем нужный нам формат выбором метода
         */
        saver.saveToJson(order);
//        saver.saveToTxt(order);
//        saver.saveToXML(order);

    }

}
