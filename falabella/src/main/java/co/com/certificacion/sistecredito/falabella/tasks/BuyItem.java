package co.com.certificacion.sistecredito.falabella.tasks;

import co.com.certificacion.sistecredito.falabella.models.Person;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class BuyItem implements Task {
    private final Person person;

    public BuyItem(Person person) {
        this.person = person;
    }

    public static BuyItem cellPhone(Person persona) {
        return Tasks.instrumented(BuyItem.class, persona);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AddProduct.toBag(person.getCategory(), person.getProduct()),
                EnterThe.location(person.getRegion(), person.getCity(), person.getNeighborhood()),
                AddressFor.dispatch(person.getAddress(), person.getPrefix())
        );
    }
}
