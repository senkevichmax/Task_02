package by.epamtc.senkevichmaxim.task02.runner;

import by.epamtc.senkevichmaxim.task02.logic.Basket;
import by.epamtc.senkevichmaxim.task02.logic.Ball;
import by.epamtc.senkevichmaxim.task02.logic.Color;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.addBall(new Ball(914.88, Color.BROWN));
        basket.addBall(new Ball(808.12, Color.YELLOW));
        basket.addBall(new Ball(645.97, Color.BLUE));
        basket.addBall(new Ball(513.37, Color.PINK));
        basket.addBall(new Ball(322.28, Color.BLUE));
        basket.addBall(new Ball(752.7, Color.RED));

        System.out.println("Вес мячей " + basket.getGeneralWeight() + "г");
        System.out.println("Здесь " + basket.countBalls(Color.BLUE) + " синих мяча");
    }
}
