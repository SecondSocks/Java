package learning1;

public class ReverseCalls1 {
    public static void main(String[] args) {
        Buttons tvButton = new Buttons(new EventHandler() {
            private boolean on = false;
            public void execute() {
                if (on) {
                    System.out.println("");
                }
            }
        });
    }
}

class Buttons {
    EventHandler handler;

    Buttons(EventHandler action) { this.handler = action; }

    public void click() { handler.execute(); }
}