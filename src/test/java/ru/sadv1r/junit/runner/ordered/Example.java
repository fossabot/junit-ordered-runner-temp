package ru.sadv1r.junit.runner.ordered;

import org.junit.Ignore;
import org.junit.Test;

@Ignore("Test class with ordered tests example")
public class Example {
    @Test
    @Order(1)
    public void needToBeFirst() {
        System.out.println("First");
    }

    @Test
    @Order(3)
    public void needToBeThird() {
        System.out.println("Third");
    }

    @Test
    public void withoutOrder() {
        System.out.println("without Order");
    }

    @Test
    @Order(2)
    public void needToBeSecond() {
        System.out.println("Second");
    }

    @Test
    public void withoutOrderPairOne() {
        System.out.println("Without Order Pair One");
    }

    @Test
    public void withoutOrderPairTwo() {
        System.out.println("Without Order Pair Two");
    }

    @Test
    @Order(Integer.MAX_VALUE)
    public void needToBeAfterAll() {
        System.out.println("After All");
    }

    @Test
    @Order(-1)
    public void needToBeBeforeFirst() {
        System.out.println("Before All");
    }

    @Test
    @Order(0)
    public void justZero() {
        System.out.println("Just Zero");
    }
}