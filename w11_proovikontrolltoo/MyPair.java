import java.security.PublicKey;

public interface MyPair<K, V> {
    public K getKey();
    public V getValue();
}
