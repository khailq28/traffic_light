package traffic_light.constant;

public enum Color {
    RED(Constanst.ANSI_RED), 
    YELLOW(Constanst.ANSI_YELLOW), 
    GREEN(Constanst.ANSI_GREEN);

    private String consoleColor;

    public String getConsoleColor() {
        return consoleColor;
    }

    public void setConsoleColor(String consoleColor) {
        this.consoleColor = consoleColor;
    }

    private Color(String consoleColor) {
        this.consoleColor = consoleColor;
    }
}