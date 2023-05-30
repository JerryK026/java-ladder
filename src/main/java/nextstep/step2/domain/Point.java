package nextstep.step2.domain;

import java.util.Objects;

public class Point {

    private final boolean value;

    public Point(boolean value) {
        this.value = value;
    }

    public boolean exist() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;

        return value == point.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}