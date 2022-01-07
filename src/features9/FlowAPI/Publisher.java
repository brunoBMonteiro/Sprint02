package features9.FlowAPI;

public interface Publisher<T> {
    public void subscribe(Subscriber<? super T> subscriber);
}
