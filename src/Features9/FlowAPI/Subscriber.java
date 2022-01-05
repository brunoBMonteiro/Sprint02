package Features9.FlowAPI;

import java.util.concurrent.Flow;

public interface Subscriber<T> {
    public void onSubscribe(Flow.Subscription subscription);
    public void onNext(T item);
    public void onError(Throwable throwable);
    public void onComplete();
}
