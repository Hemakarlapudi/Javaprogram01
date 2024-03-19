package com.qualizeal.javaapp.mainprogram;

import com.qualizeal.javaapp.mathematics.Addition;
import com.qualizeal.javaapp.mathematics.Subtraction;
import com.qualizeal.javaapp.mathematics.Multiplication;
import com.qualizeal.javaapp.mathematics.Division;

import com.qualizeal.javaapp.mathematics.geometry.Triangle;
import com.qualizeal.javaapp.ecommerce.Cart;

import com.qualizeal.javaapp.ecommerce.Order;

public class Program {
    public static void main(String[] args) {
    Addition addition=new Addition();
    addition.operation1();

    Subtraction subtract=new Subtraction();
    subtract.operation1();

    Multiplication mul=new Multiplication();
    mul.operation1();

    Division div=new Division();
    div.operation1();

    Triangle triangle = new Triangle();
    triangle.operation1();

    Cart cart = new Cart();
    cart.operation1();

    Order order = new Order();
    order.operation1();
    }
}
