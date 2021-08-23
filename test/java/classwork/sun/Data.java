package classwork.sun;

import java.util.List;
import java.util.Objects;

public class Data {

    public String code;
    public List <User> data;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data1 = (Data) o;
        return Objects.equals(code, data1.code) && Objects.equals(data, data1.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, data);
    }
}
