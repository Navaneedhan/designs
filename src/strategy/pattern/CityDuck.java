package strategy.pattern;

public class CityDuck extends Duck {
    CityDuck() {
        super(new CityQuackBehavior());
    }
}
