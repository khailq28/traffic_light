package traffic_light.constant;

public enum State {
    ON(Constanst.ANSI_PURPLE), OFF(Constanst.ANSI_WHITE);

    private String consoleColor;

    public String getConsoleColor() {
        return consoleColor;
    }

    public void setConsoleColor(String consoleColor) {
        this.consoleColor = consoleColor;
    }

    private State(String consoleColor) {
        this.consoleColor = consoleColor;
    }
}