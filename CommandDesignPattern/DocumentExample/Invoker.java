import java.util.ArrayList;
import java.util.List;

// Invoker class that holds a list of actions and executes them -- Aggregation
public class Invoker {
    private List<IActionListerner> actions;

    public Invoker() {
        actions = new ArrayList<>();
    }

    public void addAction(IActionListerner action) {
        actions.add(action);
    }

    public void executeActions() {
        for (IActionListerner action : actions) {
            action.execute();
        }
    }
}
