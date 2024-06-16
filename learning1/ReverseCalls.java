package learning1;

public class ReverseCalls {
    public static void main(String[] args) {
        Button button = new Button(new ButtonClickHandler());
        button.click();
    }
}

class Button {
    EventHandler handler;

    Button(EventHandler action) { this.handler = action; }

    public void click() { handler.execute(); }
}

interface EventHandler { void execute(); }

class ButtonClickHandler implements EventHandler {
    public void execute() {
        System.out.println("Кнопка нажата");
    }
}