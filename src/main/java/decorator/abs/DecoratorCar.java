package decorator.abs;

public abstract class DecoratorCar extends AbstractCar{
    protected AbstractCar decorator;

    public DecoratorCar(AbstractCar decorator) {
        this.decorator = decorator;
    }
}
