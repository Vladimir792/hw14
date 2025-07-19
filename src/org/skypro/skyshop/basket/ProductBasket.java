package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] products = new Product[5]; // Хранит список товаров
    private int size = 0;                       // Текущий размер корзины

    // Метод добавления товара в корзину
    public void addProduct(Product product) {
        if (size >= products.length) {
            System.out.println("Невозможно добавить продукт.");
            return;
        }
        products[size++] = product;
    }

    // Метод получения общей стоимости корзины
    public int getTotalCost() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += products[i].getPrice(); // Используем геттер getPrice()
        }
        return total;
    }
    // Метод печати содержимого корзины
    public void printProducts() {
        if (size == 0) {
            System.out.println("В корзине пусто.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(products[i].getName() + ": " + products[i].getPrice()); // Используем геттеры getName() и getPrice()
        }
        System.out.println("Итого: " + getTotalCost());
    }

    // Метод проверки наличия товара по имени
    public boolean containsProductByName(String name) {
        for (int i = 0; i < size; i++) {
            if (products[i].getName().equals(name)) { // Используем геттер getName()
                return true;
            }
        }
        return false;
    }

    // Метод очистки корзины
    public void clearBasket() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
        size = 0;
    }
}