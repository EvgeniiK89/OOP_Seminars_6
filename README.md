Доработать приложение (семинар, пакет srp2) в рамках понимания работы принципов SOLID
Переработать приложение с учетом принципа SPR


    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        order.saveToJson();
    }
