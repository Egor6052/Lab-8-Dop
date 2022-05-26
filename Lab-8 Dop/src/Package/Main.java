package Package;

import java.time.LocalDate;

/**
 * Работу выполнял Семенов Егоа АТ-212
 */
public class Main {
    /**
     * Наименование   |   Определить среднюю стоимость товарови товар с минимальной стоимостью.
     * Количество     |
     * Цена           |
     * Производитель  |
     * Дата выпуска   |
     */
    private static void Task1() {
        System.out.println("Test#1");
        Products Product1 = new Products("Яблоко", 5, 12.5, "Агроном-Сад", LocalDate.of(2022, 3, 29));
        Products Product2 = new Products("Вишня", 10, 10.3, "Ecofruct", LocalDate.of(2022, 4, 15));
        Products Product3 = new Products("Банан", 3, 20, "Эквадор", LocalDate.of(2022, 3, 15));
        Products Product4 = new Products("Персик", 4, 14.5, "Агролюкс", LocalDate.of(2022, 4, 18));
        Products Product5 = new Products("Слива", 5, 11.5, "IMLEK", LocalDate.of(2022, 4, 10));
        Products Product6 = new Products("Виноград", 3, 18.8, "Vlla Des Rois", LocalDate.of(2022, 4, 18));
        int size = 6;
        Products[] Products = new Products[size];
        Products[0] = Product1;
        Products[1] = Product2;
        Products[2] = Product3;
        Products[3] = Product4;
        Products[4] = Product5;
        Products[5] = Product6;
        //нахожу среднюю цену;
        double ans = ((Product1.getPrice() + Product2.getPrice() + Product3.getPrice() + Product4.getPrice() + Product5.getPrice() + Product6.getPrice()) / 6);
        System.out.println("Средняя стоимость всех товаров: " + ans + " грн");
        double MinPrice = Products[0].getPrice();
        for (int i = 0; i < size; i++) {           //нахожу минимальную цену;
            if (Products[i].getPrice() < MinPrice) {
                MinPrice = (int) Products[i].getPrice();
                System.out.println("Товар с минимальной стоимостью: " + Products[i] + " c ценой: " + MinPrice);
            }
        }
    }

    /**
     * Наименование      | Вывести сведения о товарах, срок годности которых менее 20-ти дней.
     * Цена              | Определить количество просроченных товаров.
     * Дата производства |
     * Срок годности     |
     * Количество        |
     * Производитель     |
     */
    private static void Task2() {
        System.out.println("Task#2");
        Shelves Shelf1 = new Shelves("Яблоко", 12.5, LocalDate.of(2022, 4, 15), 21, 10, "Агроном-Сад");
        Shelves Shelf2 = new Shelves("Вишня", 10.3, LocalDate.of(2022, 4, 16), 18, 40, "Ecofruct");
        Shelves Shelf3 = new Shelves("Банан", 20, LocalDate.of(2022, 4, 17), 22, 20, "Агроном-Сад");
        Shelves Shelf4 = new Shelves("Персик", 14.5, LocalDate.of(2022, 4, 9), 17, 16, "Агроном-Сад");
        Shelves Shelf5 = new Shelves("Слива", 11.5, LocalDate.of(2022, 4, 8), 10, 17, "Агроном-Сад");
        Shelves Shelf6 = new Shelves("Виноград", 18.8, LocalDate.of(2022, 4, 17), 18, 35, "Агроном-Сад");
        int size = 6;
        Shelves[] Shelves = new Shelves[size];
        Shelves[0] = Shelf1;
        Shelves[1] = Shelf2;
        Shelves[2] = Shelf3;
        Shelves[3] = Shelf4;
        Shelves[4] = Shelf5;
        Shelves[5] = Shelf6;
        System.out.println("Товары, срок годности которых мене 20 дней: ");
        int days = 20;
        for (int i = 0; i < size; i++) {            // определяю товары, срок годности которых меньше 20 дней;
            if (Shelves[i].getShelfLife() < days) {
                System.out.println(Shelves[i].getNames());
            }
        }
        System.out.println("\nПросроченые товары: ");

        for (int i = 0; i < size; i++) {             //определяю просроченые товары;
            if (20 - (Shelves[i].getShelfLife()) > 0) {  //если 20 - срок годности > 0 = срок истек;
                System.out.println(Shelves[i].getNames());
            }
        }
    }

    public static void main(String[] args) {
        Task1();
        Task2();
    }
}

