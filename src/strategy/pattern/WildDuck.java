package strategy.pattern;

public class WildDuck extends Duck {
    WildDuck() {
        super(new WildQuackBehavior());
    }
}
