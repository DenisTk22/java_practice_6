package final_java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//import static final_java.Laptop.color;

public class Processor {

    public static void laptopVeiw(){
        Laptop laptop1 = new Laptop("Dell", "Black");
        Laptop laptop2 = new Laptop("Dell", "Grey");
        Laptop laptop3 = new Laptop("Asus", "Black");
        Laptop laptop4 = new Laptop("Asus", "Red");
        Laptop laptop5 = new Laptop("Lenovo", "Grey");
        Laptop laptop6 = new Laptop("Lenovo", "Green");
        Laptop laptop7 = new Laptop("Toshiba", "Black");
        Laptop laptop8 = new Laptop("Huawei", "Grey");
        Laptop laptop9 = new Laptop("Huawei", "White");
        Laptop laptop10 = new Laptop("Acer", "Black");


        Set<Laptop> laptops = new HashSet<>();

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        laptops.add(laptop7);
        laptops.add(laptop8);
        laptops.add(laptop9);
        laptops.add(laptop10);

        System.out.println(laptops);

        HashMap<Integer, Laptop> laptopMap = new HashMap<>();
        laptopMap.put(1, laptop1);
        laptopMap.put(2, laptop2);
        laptopMap.put(3, laptop3);
        laptopMap.put(4, laptop4);
        laptopMap.put(5, laptop5);
        laptopMap.put(6, laptop6);
        laptopMap.put(7, laptop7);
        laptopMap.put(8, laptop8);
        laptopMap.put(9, laptop9);
        laptopMap.put(10, laptop10);
//System.out.println("Map:" + laptopMap);
// проверка:
        String color = "Black";
        for (Map.Entry<Integer, Laptop> entry: laptopMap.entrySet()) {
            if (entry.getValue().color.equals(color)) {
                System.out.println(entry);
        }
        }

        String brand = "Lenovo";
        for (Map.Entry<Integer, Laptop> entry: laptopMap.entrySet()) {
            if (entry.getValue().brand.equals(brand)) {
                System.out.println(entry);
            }
        }
    }

        public static void laptopColor(String color) {
            for (Map.Entry<Integer, Laptop> entry: laptopMap.entrySet()) {
            if (entry.getValue().color.equals(color)) {
                System.out.println(entry);
        }
        }
}
    public static void laptopBrand(String brand) {
        for (Map.Entry<Integer, Laptop> entry: laptopMap.entrySet()) {
            if (entry.getValue().color.equals(brand)) {
                System.out.println(entry);
            }
        }
    }
}