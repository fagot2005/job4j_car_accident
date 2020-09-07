package di;

import org.springframework.stereotype.Component;

@Component
public class UserActions {
    private final String [] userAction = new String[] {
            "Add", "Found all", "Found Item", "Edit Item", "Replase Item", "Exit"
    };

    public String getId(int index) {
        return userAction[index];
    }
}
