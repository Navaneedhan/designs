package strategy.pattern;

public class WildQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Wild quack");
    }
}
