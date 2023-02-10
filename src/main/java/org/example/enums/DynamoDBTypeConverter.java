package org.example.enums;

public interface DynamoDBTypeConverter<S, T> {
    S convert(T var1);
    T unconvert(S var1);

    public static class NullSafeConverter<S, T> extends DelegateConverter<S, T> {
        public NullSafeConverter(DynamoDBTypeConverter<S, T> delegate) {super(delegate); }
        public S convert(T object) {return object == null ? null : super.convert(object); }
        public T unconvert(S object) {return object == null ? null : super.unconvert(object); }
    }
    public static class DelegateConverter<S, T> extends AbstractConverter<S, T> {
        private final DynamoDBTypeConverter<S, T> delegate;
        public DelegateConverter(DynamoDBTypeConverter<S, T> delegate) {this.delegate = delegate; }
        public S convert(T object) {return this.delegate.convert(object); }
        public T unconvert(S object) {return this.delegate.unconvert(object); }
    }
    @SdkInternalApi
    public abstract static class AbstractConverter<S, T> implements DynamoDBTypeConverter<S, T> {
        public AbstractConverter() {}
        public static <S, U, T> ExtendedConverter
    }
}
