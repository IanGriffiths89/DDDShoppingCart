package org.thoughtworks.ddd_workshop.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        Item oneIpadPro = new Item(I_PAD_PRO, 1);

        shoppingCart.addItem(oneIpadPro);

        List<Item> items = shoppingCart.getItems();

        assertEquals(oneIpadPro, items.get(0));
    }

    @Test
    void shouldAddHeroInkPenToCart() {
        Item oneHeroInkPen = new Item(HERO_INK_PEN, 1);

        shoppingCart.addItem(oneHeroInkPen);

        List<Item> items = shoppingCart.getItems();

        assertEquals(oneHeroInkPen, items.get(0));

    }

    @Test
    void shouldAdd2CricketBatsToCart() {
        Item twoCricketBats = new Item(REEBOK_CRICKET_BAT, 2);

        shoppingCart.addItem(twoCricketBats);

        List<Item> items = shoppingCart.getItems();

        assertEquals(twoCricketBats, items.get(0));
    }

    @Test
    void shouldAddIpadProAndThenRemoveFromCart() {
        Item oneIpadPro = new Item(I_PAD_PRO, 1);

        shoppingCart.addItem(oneIpadPro);
        shoppingCart.removeItem(oneIpadPro);

        List<Item> items = shoppingCart.getItems();

        assertTrue(items.isEmpty());
    }
}
