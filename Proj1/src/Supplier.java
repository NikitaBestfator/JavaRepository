public interface Supplier<T>{
    T get();
}
// не принимает никаких аргументов, но должен возвращать объект типа T