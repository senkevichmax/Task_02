package by.epamtc.senkevichmaxim.task02.logic;

    import java.util.ArrayList;

    public class Basket {
        private ArrayList<Ball> ballsInBasket;

        public Basket() {
            ballsInBasket = new ArrayList<>();
        }

        public void addBall(Ball ball) {
            ballsInBasket.add(ball);
        }


        public int countBalls(Color color) {
            int count = 0;
            for (Ball ball : ballsInBasket) {
                if (ball.getColor() == color) {
                    count++;
                }
            }
            return count;
        }

        public double getGeneralWeight() {
            double generalWeight = 0;
            for (Ball ball : ballsInBasket) {
                generalWeight += ball.getWeight();
            }
            return generalWeight;
        }
    }

