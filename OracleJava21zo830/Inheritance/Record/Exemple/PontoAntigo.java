package OracleJava21zo830.Inheritance.Record.Exemple;

import java.util.Objects;

public class PontoAntigo {
    private final int x;
    private final int y;

    public PontoAntigo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PontoAntigo pontoAntigo = (PontoAntigo) o;
        return x == pontoAntigo.x && y == pontoAntigo.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "PontoAntigo{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}