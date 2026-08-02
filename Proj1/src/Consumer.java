public interface Consumer<T>{
    void accept(T t);
}
// выполняет некоторое действие над объектом типа T, но ничего не возвращает