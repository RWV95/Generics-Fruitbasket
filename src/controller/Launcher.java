package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;


public class Launcher {

    public static void main(String[] args) {
       // TODO Try and use the FruitBasket class for different kind of fruits and also for a mix of fruits
        FruitBasket<Fruit> applePearBananaBasket = new FruitBasket<>();
        FruitBasket<Fruit> pearBananaBasket = new FruitBasket<>();
        FruitBasket<Apple> appleBasket = new FruitBasket<>();
        
        Apple apple = new Apple();
        Pear pear = new Pear();
        Banana banana = new Banana();
        
        applePearBananaBasket.add(apple);
        applePearBananaBasket.add(pear);
        applePearBananaBasket.add(banana);

        System.out.println(applePearBananaBasket.size());
        System.out.println(applePearBananaBasket.contains(pear));
        System.out.println(applePearBananaBasket.isEmpty());
        System.out.println(applePearBananaBasket);

        System.out.println(applePearBananaBasket.get());
        System.out.println(applePearBananaBasket.size());
    }
}