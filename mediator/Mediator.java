package traffic_light.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator<T> {
    protected List<T> lists = new ArrayList<>();
    public abstract void change(T item);
    public abstract void notifyMsg();
    public abstract void showCountDown(long second);

    @SuppressWarnings("unchecked")
    public void registItem(T... items) {
        for (T item : items) {
            lists.add(item);
        }
    }
}
