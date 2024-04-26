package traffic_light.middleware;

public abstract class Middleware {
    protected Middleware nextHandle;

    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware next : chain) {
            head.nextHandle = next;
            head = next;
        }
        head.nextHandle = first;
        return first;
    }

    protected void switchLight(Middleware light) {
        light.turnOn();
        this.notifyMsg();
        this.showCountDown();
    }

    public void start() {
        this.switchLight(this);
        Middleware head = this;
        while (true) {
            this.nextHandle.switchLight(head.nextHandle);
            head = head.nextHandle;
        }
    }

    protected abstract void turnOn();
    protected abstract void turnOff();
    protected abstract void notifyMsg();
    protected abstract void showCountDown();
}
