package Week11;

public class Pair <S, T>{
    S obj;
    T obj2;

    public Pair (S o, T t){
        this.obj = o;
        this.obj2 = t;
    }

    public S getFirst(){
        return this.obj;
    }

    public T getSecond(){
        return this.obj2;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        String sep = "(";
        String end = ")";

        builder.append(sep);
        builder.append(getFirst());
        builder.append(", ");
        builder.append(getSecond());
        builder.append(end);

        return builder.toString();
    }
}
