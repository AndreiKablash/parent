package by.htp.maven;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) throws IOException {
        Service service = ServiceLoader.load(Service.class).findFirst()
                .orElseThrow(() -> new RuntimeException("No Service"));
        List<Integer> testData = new ArrayList<>();
        testData.add(1);
        testData.add(null);
        testData.add(1);

        Double result = service.average(testData);
        System.out.println(result);
    }
}
