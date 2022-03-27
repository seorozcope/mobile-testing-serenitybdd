package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final String user;

    public Login(String user) {
        this.user=user;
    }

    public static Login usingValidUser(String user) {
        return instrumented(Login.class,user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();
    }
}
