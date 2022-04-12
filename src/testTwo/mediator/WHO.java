package testTwo.mediator;

// 具体中介者
public class WHO extends Group{
    public WHO() {
        super("WHO");
    }

    @Override
    public void register(Country country) {
        super.register(country);
        country.setWHO(this);
    }
}
