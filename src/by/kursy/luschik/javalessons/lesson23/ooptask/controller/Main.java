//package by.kursy.luschik.javalessons.lesson23.ooptask.controller;
//
//import by.kursy.luschik.javalessons.lesson23.ooptask.model.entity.*;
//import by.kursy.luschik.javalessons.lesson23.ooptask.model.logic.ShopAssistance;
//
//
//public class Main {
//    public static void main(String[] args) {
//
//        Flower[] flowers = new Flower[10];
//
//        for (int i = 0; i < 5; i++) {
//            flowers[i] = new Rose("Pink Panther", "pink", 3.5, 78, 200, 1.5, 5);
//        }
//
//        for (int i = 5; i < flowers.length; i++) {
//            flowers[i] = new Sunflower("Pink Panther", "pink", 3.5, 78, 200, 15, 2);
//        }
//
//        Bouquet4 bouquet = new Bouquet4(flowers);
//        double weight = ShopAssistance.calculateTotalWeight(bouquet);
//        double price = ShopAssistance.calculateTotalPrice(bouquet);
//
//        System.out.println(bouquet);
//        System.out.println("Total price: " + price);
//        System.out.println("Total weight: " + weight);
//    }
//}
