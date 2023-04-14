package final_java;

import java.util.Scanner;
import com.sun.tools.javac.Main;
import static final_java.Processor.*;
public class View {
    public static void userInput() {
        Scanner iscan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите: \n" +
                    "1 - посмотреть список ноутбуков \n" +
                    "2 - выбрать бренд ноутбука \n" +
                    "3 - выбрать цвет ноутбука \n" +
                    "4 - выход");
            int userCh = iscan.nextInt();
            if (userCh == 1) laptopVeiw();
            if (userCh == 2){
                System.out.println("В наличие бренды:\n" +
                        "1 - Dell\n" +
                        "2 - Asus\n" +
                        "3 - Lenovo\n" +
                        "4 - Toshiba\n" +
                        "5 - Huawei\n" +
                        "6 - Acer");
                int userChBrand = iscan.nextInt();
                if (userChBrand == 1){
                    laptopBrand("Dell");
                }
                if (userChBrand == 2){
                    laptopBrand("Asus");
                }
                if (userChBrand == 3){
                    laptopBrand("Lenovo");
                }
                if (userChBrand == 4){
                    laptopBrand("Toshiba");
                }
                if (userChBrand == 5){
                    laptopBrand("Huawei");
                }
                if (userChBrand == 6){
                    laptopBrand("Acer");
                }
            }
            if (userCh == 3){
                System.out.println("Цвета в наличие:\n" +
                        "1 - Black\n" +
                        "2 - Grey\n" +
                        "3 - Red\n" +
                        "4 - Green\n" +
                        "5 - White");
                int userChColor = iscan.nextInt();
                if (userChColor == 1){
                    laptopColor("Black");
                }
                if (userChColor == 2){
                    laptopColor("Grey");
                }
                if (userChColor == 3){
                    laptopColor("Red");
                }
                if (userChColor == 4){
                    laptopColor("Green");
                }
                if (userChColor == 5){
                    laptopColor("White");
                }
            }
            if (userCh == 4){
                break;
            }
        }
    }
}
