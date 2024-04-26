package traffic_light.mediator;

import traffic_light.constant.Constanst;
import traffic_light.dto.Light;

public class LightMediator extends Mediator<Light> {

    @Override
    public void change(Light item) {
        this.lists.stream().filter(e -> !item.equals(e)).forEach(e -> {
            e.turnOff();
        });
    }

    @Override
    public void notifyMsg() {
        this.lists.forEach(light -> {
            System.out.printf("\n%sO%s - %s%s%s",
                light.getState().getConsoleColor(),
                Constanst.ANSI_RESET,
                light.getColor().getConsoleColor(),
                light.getColor(),
                Constanst.ANSI_RESET
            );
        });
        System.out.println("\n------------");
    }

    @Override
    public void showCountDown(long second) {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + second * 1000;

        while (System.currentTimeMillis() <= endTime) {
            long remainingTime = (endTime - System.currentTimeMillis()) / 1000; // Convert milliseconds to seconds
            System.out.print("\rTime remaining: " + remainingTime + " seconds");
        }
        System.out.println("\n------------");
    }

}
