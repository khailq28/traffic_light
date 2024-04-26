package traffic_light.dto;

import traffic_light.constant.Color;
import traffic_light.constant.State;
import traffic_light.mediator.Mediator;
import traffic_light.middleware.Middleware;

public class Light extends Middleware{
    private Mediator<Light> mediator;
    private Color color;
    private State state = State.OFF;
    private long countDown;

    public Light(Mediator<Light> mediator, Color color, long countDown) {
        this.mediator = mediator;
        this.color = color;
        this.countDown = countDown;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public long getCountDown() {
        return countDown;
    }

    public void setCountDown(long countDown) {
        this.countDown = countDown;
    }

    @Override
    protected void turnOn() {
        this.state = State.ON;
        this.mediator.change(this);
    }

    @Override
    public void turnOff() {
        this.state = State.OFF;
    }

    public boolean equals(Light light) {
        return this.color == light.getColor();
    }

    @Override
    protected void notifyMsg() {
        this.mediator.notifyMsg();
    }

    @Override
    protected void showCountDown() {
        this.mediator.showCountDown(this.countDown);
    }

}
