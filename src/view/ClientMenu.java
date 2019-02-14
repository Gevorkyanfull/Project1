package view;

import services.OrderService;
import services.OrderServiceimpl;
import java.math.BigDecimal;
import java.util.Scanner;

public class ClientMenu {
    private final Scanner scanner=new Scanner(System.in);
    public void show()throws Exception {
        while (true) {
            showMenu();
            switch (scanner.nextLine()) {
                case "1":
                    createOrder();
                    break;
                case "2":
                    editOrder();
                    break;
                case "3":
                    RemoveOrder();
                    break;
                case "4":
                    showOrder();
                    break;
                default:
                    System.out.println("Иди проспись");

            }
        }
    }
        private void RemoveOrder ()throws Exception {
            System.out.println("Введите ваш id");
            Integer id = Integer.valueOf(scanner.nextLine());
            System.out.println("Ваш заказ успешно удален!");

        }
        private void showOrder () throws Exception {
            System.out.println("Введите ваше id");
            Integer id = Integer.valueOf(scanner.nextLine());
            System.out.println("Ваш заказ");
    }
        private void editOrder () throws Exception {
            System.out.println("Введите id заказа");
            Integer id = Integer.valueOf(scanner.nextLine());
            System.out.println("Изменить заказ");
        }
        private void createOrder () throws Exception {
        boolean isRunning=true;
            System.out.println("Введите id продукта");
            Integer id = Integer.valueOf(scanner.nextLine());
            while (isRunning){
                showsubmenu();
            switch (scanner.nextLine()){
                case "1":
                    System.out.println("Сохранить заказ");
                    break;
                case "2":
                    System.out.println("Выбрать другой товар");
                    break;
                    default:
                        System.out.println("Повторите попытку");
            }}
        }

    private void showsubmenu() {
        System.out.println("1. Сохранить заказ");
        System.out.println("2. Перейти к выбору другого товара");
    }

    private void showMenu () {
            System.out.println("1. Создаем заказ");
            System.out.println("2. Редактируем заказ");
            System.out.println("3. Удаляем заказ");
            System.out.println("4. Показать заказ");
            System.out.println("5. Вернуться в главное меню");

        }
    }