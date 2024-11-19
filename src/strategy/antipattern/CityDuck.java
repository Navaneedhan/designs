package strategy.antipattern;

public class CityDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("City quack");
    }
}
