package daynine.consumer;

@FunctionalInterface
public interface ConsumerElements<T> {
	
	public void acceptElement(T t);

}
