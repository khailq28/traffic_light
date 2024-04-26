package traffic_light;

import traffic_light.middleware.Middleware;

public class Client {
    public static void main(String[] args) {
        Middleware tranficLight = TranfficLightWorkFlow.getTranfficLight();
        tranficLight.start();
    }
}
