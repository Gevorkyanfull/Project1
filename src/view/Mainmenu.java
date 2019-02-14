package view;

import java.util.Scanner;

public class Mainmenu {
    private final Scanner scanner=new Scanner(System.in);
    AdminMenu adminMenu=new AdminMenu();
    ClientMenu clientMenu=new ClientMenu();

    public void showMenu() throws Exception {
        boolean isRunning=true;
        while(isRunning){
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.println("0. Exit");
            switch (scanner.nextLine()){
                case "1":
                    adminMenu.showAdminMenu();
                    break;
                case "2":
                    clientMenu.show();
                    break;
                case "0":
                    isRunning=false;
                   System.out.println("...Встав i вийшов");
                    break;
                default:
                    System.out.println("Наркоман, шо ты клацаешь");
                    break;
            }
        }

    }
}
