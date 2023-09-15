import java.util.Scanner;

/*
Выносим метод inputFromConsole из класса Order и создаем отдельный класс для
внесения информации в заказ. Назовем его ConsoleInput.
 */
public class ConsoleInput {

    private Scanner scanner = new Scanner(System.in);

    public void inputFromConsole(Order order) {
        order.setClientName(prompt("Client name: "));
        order.setProduct(prompt("Product: "));
        order.setQnt(Integer.parseInt(prompt("Quantity: ")));
        order.setPrice(Integer.parseInt(prompt("Price: ")));

    }

    private String prompt(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

}
