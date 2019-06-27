package by.htp.maven.imp;

import by.htp.maven.Service;

import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;

public class MathService implements Service {
    public Double average(List<Integer> values){
        OptionalDouble optionalDouble = values.stream().
                filter(Objects::nonNull).mapToInt(value->value).average();
        return optionalDouble.orElse(0.0);
    }
}
