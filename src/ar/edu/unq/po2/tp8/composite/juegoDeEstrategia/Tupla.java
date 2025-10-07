package ar.edu.unq.po2.tp8.composite.juegoDeEstrategia;

import java.util.Objects;

public class Tupla<A, B> {
    private A first;
    private B second;

    public Tupla(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() { return first; }
    public B getSecond() { return second; }

    public void setFirst(A first) { this.first = first; }
    public void setSecond(B second) { this.second = second; }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tupla<?, ?> tuple = (Tupla<?, ?>) o;
        return first.equals(tuple.first) && second.equals(tuple.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}