package org.thoughtworks.ddd_workshop.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {

    private static final Product I_PAD_PRO = new Product("IPadPro");
    private static final Product HERO_INK_PEN = new Product("Hero ink pen");
    private static final Product REEBOK_CRICKET_BAT = new Product("Reebok Cricket Bat");

    private ShoppingCart shoppingCart;

    @BeforeEach
    void setUp() {
        shoppingCart = new ShoppingCart();
    }

    @Test
    void shouldAddIpadProToCart() {
        shoppingCart.addProduct(I_PAD_PRO);

        Map<Product, Integer> products = shoppingCart.getProducts();

        assertEquals(1, products.get(I_PAD_PRO));
    }

    @Test
    void shouldAddHeroInkPenToCart() {
        shoppingCart.addProduct(HERO_INK_PEN);

        Map<Product, Integer> products = shoppingCart.getProducts();

        assertEquals(1, products.get(HERO_INK_PEN));
    }

    @Test
    void shouldAdd2CricketBatsToCart() {
        shoppingCart.addProduct(REEBOK_CRICKET_BAT, 2);

        Map<Product, Integer> products = shoppingCart.getProducts();

        assertEquals(2, products.get(REEBOK_CRICKET_BAT));
    }
}
