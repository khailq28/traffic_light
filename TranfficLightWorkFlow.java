package traffic_light;

import traffic_light.constant.Color;
import traffic_light.dto.Light;
import traffic_light.mediator.LightMediator;
import traffic_light.mediator.Mediator;
import traffic_light.middleware.Middleware;

public class TranfficLightWorkFlow {
    public static Middleware getTranfficLight() {
        Mediator<Light> mediator = new LightMediator();

        Light red = new Light(mediator, Color.RED, 10);
        Light green = new Light(mediator, Color.GREEN, 7);
        Light yellow = new Light(mediator, Color.YELLOW, 4);

        mediator.registItem(red, yellow, green);
        return Middleware.link(red, green, yellow);
    }
}
