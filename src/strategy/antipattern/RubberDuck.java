package strategy.antipattern;

public class RubberDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("City quack");
    }
}
