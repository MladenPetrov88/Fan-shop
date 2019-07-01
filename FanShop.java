import java.util.Scanner;

public class FanShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        int countItems = Integer.parseInt(scanner.nextLine());
        int price = 0;
        int totalPrice = 0;
        for (int i = 1; i <= countItems; i++) {
            String product = scanner.nextLine();
            if (product.equals("hoodie")) {
                price = 30;
            } else if (product.equals("keychain")){
                price = 4;
            } else if (product.equals("T-shirt")) {
                price = 20;
            } else if (product.equals("flag")) {
                price = 15;
            } else if (product.equals("sticker")) {
                price = 1;
            }
            totalPrice += price;
        }
        if (budget >= totalPrice) {
            int leftMoney = budget - totalPrice;
            System.out.printf("You bought %d items and left with %d lv.", countItems, leftMoney);
        } else {
            int needMoney = totalPrice - budget;
                System.out.printf("Not enough money, you need %d more lv.", needMoney);
        }
    }
}
