package strategy.antipattern;

public class StrategyMain {
    public static void main(String[] args) {
        Duck cityDuck = new CityDuck();
        Duck wildDuck = new WildDuck();
        Duck rubberDuck = new RubberDuck();

        cityDuck.quack();
        wildDuck.quack();
        rubberDuck.quack();
    }
}
