package testTwo.mediator;

// 具体中介者
public class WTO extends Group{
    public WTO() {
        super("WTO");
    }

    @Override
    public void register(Country country) {
        super.register(country);
        country.setWTO(this);
    }
}
