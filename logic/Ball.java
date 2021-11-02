package by.epamtc.senkevichmaxim.task02.logic;

public class Ball {
    private double weight;
    private Color color;

    public Ball(double weight, Color color) {
        this.color = color;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Этот мяч " + color + " и весит" + weight + " г";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Ball ball = (Ball) object;
        return Double.compare(ball.weight, weight) == 0 && color == ball.color;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }
}
