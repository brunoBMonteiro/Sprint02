package features9.FlowAPI;

public interface Subscription {
    public void request(long n);
    public void cancel();
}
