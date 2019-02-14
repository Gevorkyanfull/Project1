package view;

import services.ProductService;

import java.math.BigDecimal;
import java.util.Scanner;

public class AdminMenu {
    private final Scanner scanner=new Scanner(System.in);
    public void showAdminMenu() throws Exception {
        while(true){
            showMenu();
            switch (scanner.nextLine()){
                case "1":
                    createClient();
                    break;
                case "2":
                    editClient();
                    break;
                case "3":
                    RemoveClient();
                    break;
                case "4":
                    createProduct();
                    break;
                case "5":
                    editProduct();
                    break;
                case "6":
                    removeProduct();
                    break;
                default:
                    System.out.println("Иди проспись");

            }

        }

    }
    private void removeProduct() {
        System.out.println("Введите id товара");
        Integer id=Integer.valueOf(scanner.nextLine());
        System.out.println("Товар успешно удален");

    }
    private void editProduct() {
        System.out.println("Введите id товара");
        Integer id=Integer.valueOf(scanner.nextLine());
        System.out.println("Введите новой название");
        String newName=scanner.nextLine();
        System.out.println("Установите новую стоимость");
        BigDecimal newPrice=new BigDecimal(scanner.nextLine());
        System.out.println("Товар успешно обновлен");

    }
    private void createProduct()throws Exception {
        System.out.println("Введите название товара");
        String name=scanner.nextLine();
        System.out.println("Введите стоимость товара");
        BigDecimal price=new BigDecimal(scanner.nextLine());
        System.out.println("Вы успешно добавили товар");
    }
    private void RemoveClient()throws Exception {
        System.out.println("Введите ваш id");
        Integer id=Integer.valueOf(scanner.nextLine());
        System.out.println("Ваш аккаунт успешно удален!");

    }
    private void editClient() throws Exception {
        System.out.println("Введите ваше Id при регистрации");
        Integer id=Integer.valueOf(scanner.nextLine());
        System.out.println("Введите новое имя");
        String newName=scanner.nextLine();
        System.out.println("Введите новую фамилию");
        String newSurname=scanner.nextLine();
        System.out.println("Введите новый номер телефона");
        String newPhone=scanner.nextLine();
            }
    private void createClient() throws Exception {
        System.out.println("Введите ваше имя");
        String name=scanner.nextLine();
        System.out.println("Введите вашу фамилию");
        String surname=scanner.nextLine();
        System.out.println("Введите ваш телефон");
        String phone=scanner.nextLine();
    }
    private void showMenu() {
        System.out.println("1. Создаем клиента");
        System.out.println("2. Редактируем данные клиента");
        System.out.println("3. Удаляем клиента");
        System.out.println("4. Создаем товар");
        System.out.println("5. Изменяем товар");
        System.out.println("6. Удаляем товар");
        System.out.println("7. Вернуться в главное меню");

    }
}
