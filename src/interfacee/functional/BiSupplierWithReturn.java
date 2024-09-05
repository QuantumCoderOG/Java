package src.interfacee.functional;

@FunctionalInterface
public interface  BiSupplierWithReturn<T, U, R> {
    R apply(T t, U u);
}
