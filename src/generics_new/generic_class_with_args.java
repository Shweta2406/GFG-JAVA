package generics_new;

public class generic_class_with_args<K,V> {
    K key;
    V value;

    public generic_class_with_args(K key,V value)
    {
        this.key=key;
        this.value=value;
    }
}
