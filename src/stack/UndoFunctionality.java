package src.stack;

import java.util.Stack;

public class UndoFunctionality {
    public static void main(String[] args) {
        Stack<String> actions = new Stack<>();

        // Perform some actions
        performAction(actions, "Open file");
        performAction(actions, "Edit file");
        performAction(actions, "Save file");

        // Undo the last action
        undoAction(actions);
        undoAction(actions);
    }

    private static void performAction(Stack<String> actions, String action) {
        actions.push(action);
        System.out.println("Performed: " + action);
    }

    private static void undoAction(Stack<String> actions) {
        if (!actions.isEmpty()) {
            String lastAction = actions.pop();
            System.out.println("Undid: " + lastAction);
        } else {
            System.out.println("No actions to undo.");
        }
    }
}