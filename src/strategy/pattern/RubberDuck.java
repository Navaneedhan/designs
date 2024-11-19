package strategy.pattern;

public class RubberDuck extends Duck {
    RubberDuck() {
        super(new CityQuackBehavior());
    }
}
