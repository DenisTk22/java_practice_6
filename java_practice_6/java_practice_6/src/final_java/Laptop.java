//Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//“Введите цифру, соответствующую необходимому критерию:
//1 - бренд
//2 -цвет
//Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package final_java;

public class Laptop {
    public String brand;
    public String color;

    public Laptop(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Laptop: brand = %s/color = %s\n", brand, color);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
}
