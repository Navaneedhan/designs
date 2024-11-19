package strategy.antipattern;

public class WildDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Wild quack");
    }
}
