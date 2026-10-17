import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> products = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.println("==============================");
            System.out.println("       シンプル在庫管理システム");
            System.out.println("==============================");
            System.out.println("1. 商品を登録する");
            System.out.println("2. 商品一覧を表示する");
            System.out.println("3. 終了する");
            System.out.print("番号を入力してください：");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {

                System.out.print("登録する商品名を入力してください：");
                String productName = scanner.nextLine();

                products.add(productName);

                System.out.println(productName + " を登録しました！");

            } else if (choice.equals("2")) {

                System.out.println();
                System.out.println("======= 商品一覧 =======");

                if (products.isEmpty()) {
                    System.out.println("登録されている商品はありません。");
                } else {
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + ". " + products.get(i));
                    }
                }

                System.out.println("========================");

            } else if (choice.equals("3")) {

                System.out.println("在庫管理システムを終了します。");
                break;

            } else {

                System.out.println("1～3の番号を入力してください。");

            }
        }

        scanner.close();
    }
}