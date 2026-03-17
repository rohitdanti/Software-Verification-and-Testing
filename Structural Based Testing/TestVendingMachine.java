package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
//import VendingMachine;

public class TestVendingMachine{

    // Test case 1: Purchase candy with exact amount
    @Test
    public void testCandyExactAmount() {
        assertEquals("Item dispensed.", VendingMachine.dispenseItem(20, "candy"));
    }

    // Test case 2: Purchase candy with more than required amount
    @Test
    public void testCandyMoreThanCost() {
        assertEquals("Item dispensed and change of 5 returned", VendingMachine.dispenseItem(25, "candy"));
    }

    // Test case 3: Purchase candy with less than required amount
    @Test
    public void testCandyLessThanCost() {
        assertEquals("Item not dispensed, missing 5 cents. Cannot purchase item.", VendingMachine.dispenseItem(15, "candy"));
    }

    // Test case 4: Purchase coke with exact amount
    @Test
    public void testCokeExactAmount() {
        assertEquals("Item dispensed.", VendingMachine.dispenseItem(25, "coke"));
    }

    // Test case 5: Purchase coke with more than required amount
    @Test
    public void testCokeMoreThanCost() {
        assertEquals("Item dispensed and change of 10 returned", VendingMachine.dispenseItem(35, "coke"));
    }

    // Test case 6: Purchase coke with less than required amount
    @Test
    public void testCokeLessThanCost() {
        assertEquals("Item not dispensed, missing 5 cents. Can purchase candy.", VendingMachine.dispenseItem(20, "coke"));
    }

    // Test case 7: Purchase coffee with exact amount
    @Test
    public void testCoffeeExactAmount() {
        assertEquals("Item dispensed.", VendingMachine.dispenseItem(45, "coffee"));
    }

    // Test case 8: Purchase coffee with more than required amount
    @Test
    public void testCoffeeMoreThanCost() {
        assertEquals("Item dispensed and change of 5 returned", VendingMachine.dispenseItem(50, "coffee"));
    }

    // Test case 9: Purchase coffee with less than required amount (enough for coke or candy)
    @Test
    public void testCoffeeLessThanCost() {
        assertEquals("Item not dispensed, missing 10 cents. Can purchase candy or coke.", VendingMachine.dispenseItem(35, "coffee"));
    }

    // Test case 10: Purchase coffee with less than required amount (enough for candy)
    @Test
    public void testCoffeeLessThanCostEnoughForCandy() {
        assertEquals("Item not dispensed, missing 25 cents. Can purchase candy.", VendingMachine.dispenseItem(20, "coffee"));
    }

    // Test case 11: Purchase coffee with insufficient amount (cannot purchase any item)
    @Test
    public void testCoffeeInsufficientAmount() {
        assertEquals("Item not dispensed, missing 40 cents. Cannot purchase item.", VendingMachine.dispenseItem(5, "coffee"));
    }

    // Test case 12: Invalid item selection with sufficient amount
    @Test
    public void testInvalidItemSufficientAmount() {
        assertEquals("Item dispensed.", VendingMachine.dispenseItem(50, "water"));
    }

    // Test case 13: Invalid item selection with insufficient amount
    @Test
    public void testInvalidItemInsufficientAmount() {
        assertEquals("Item dispensed.", VendingMachine.dispenseItem(10, "water"));
    }

    // Test case 14: Input amount equals zero
    @Test
    public void testZeroInputAmount() {
        assertEquals("Item not dispensed, missing 20 cents. Cannot purchase item.", VendingMachine.dispenseItem(0, "candy"));
    }

    // Test case 15: Input amount is negative
    @Test
    public void testNegativeInputAmount() {
        assertEquals("Item not dispensed, missing 25 cents. Cannot purchase item.", VendingMachine.dispenseItem(-5, "coke"));
    }

    // Test case 16: Purchase candy with amount just below cost
    @Test
    public void testCandyJustBelowCost() {
        assertEquals("Item not dispensed, missing 1 cents. Cannot purchase item.", VendingMachine.dispenseItem(19, "candy"));
    }

    // Test case 17: Purchase coke with amount just below cost
    @Test
    public void testCokeJustBelowCost() {
        assertEquals("Item not dispensed, missing 1 cents. Can purchase candy.", VendingMachine.dispenseItem(24, "coke"));
    }

    // Test case 18: Purchase coffee with amount just below cost
    @Test
    public void testCoffeeJustBelowCost() {
        assertEquals("Item not dispensed, missing 1 cents. Can purchase candy or coke.", VendingMachine.dispenseItem(44, "coffee"));
    }

    // Test case 19: Purchase with amount sufficient for candy but selecting coffee
    @Test
    public void testPurchaseCoffeeWithCandyAmount() {
        assertEquals("Item not dispensed, missing 25 cents. Can purchase candy.", VendingMachine.dispenseItem(20, "coffee"));
    }

    // Test case 20: Purchase with amount sufficient for coke but selecting coffee
    @Test
    public void testPurchaseCoffeeWithCokeAmount() {
        assertEquals("Item not dispensed, missing 20 cents. Can purchase candy or coke.", VendingMachine.dispenseItem(25, "coffee"));
    }

    // Test case 21: Input amount is exactly enough for the most expensive item (coffee)
    @Test
    public void testExactAmountForCoffee() {
        assertEquals("Item dispensed.", VendingMachine.dispenseItem(45, "coffee"));
    }

    // Test case 22: Purchase candy with excessive amount
    @Test
    public void testCandyWithLargeExcessAmount() {
        assertEquals("Item dispensed and change of 80 returned", VendingMachine.dispenseItem(100, "candy"));
    }

    // Test case 23: Purchase coke with excessive amount
    @Test
    public void testCokeWithLargeExcessAmount() {
        assertEquals("Item dispensed and change of 75 returned", VendingMachine.dispenseItem(100, "coke"));
    }

    // Test case 24: Purchase coffee with excessive amount
    @Test
    public void testCoffeeWithLargeExcessAmount() {
        assertEquals("Item dispensed and change of 55 returned", VendingMachine.dispenseItem(100, "coffee"));
    }

    // Test case 25: Invalid item with zero amount
    @Test
    public void testInvalidItemZeroAmount() {
        assertEquals("Item dispensed.", VendingMachine.dispenseItem(0, "snack"));
    }
}
