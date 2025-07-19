package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        Product coffeeMachine = new Product("Кофеварка", 1500);
        Product smartphone = new Product("Смартфон", 7000);
        Product laptop = new Product("Ноутбук", 25000);
        Product tablet = new Product("Планшет", 18000);

        basket.addProduct(coffeeMachine);
        basket.addProduct(smartphone);
        basket.addProduct(laptop);

        System.out.println("\nПроверка попытки добавить лишний товар:");
        basket.addProduct(tablet); // попытаемся добавить лишнюю позицию

        System.out.println("\nПечатаем содержимое корзины:");
        basket.printProducts();

        int totalCost = basket.getTotalCost();
        System.out.println("\nОбщая стоимость корзины: " + totalCost);

        boolean hasSmartphone = basket.containsProductByName("Смартфон");
        System.out.println("\nТелефон найден в корзине: " + hasSmartphone);

        boolean noTelevision = basket.containsProductByName("Телевизор");
        System.out.println("Телевизора нет в корзине: " + (!noTelevision));

        basket.clearBasket();

        System.out.println("\nКорзина после очистки:");
        basket.printProducts(); // Должно сказать "В корзине пусто"

        int costOfEmptyBasket = basket.getTotalCost();
        System.out.println("\nСтоимость пустой корзины: " + costOfEmptyBasket);

        boolean emptySearchResult = basket.containsProductByName("Смартфон");
        System.out.println("Товар 'смартфон' присутствует в пустой корзине: " + emptySearchResult);
    }
}