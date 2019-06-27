package by.htp.maven.imp;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class MathServiceTest {
    private MathService mathService;

    @org.junit.Before
    public void setUp() throws Exception {
        mathService = new MathService();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void average() {

        List<Integer> testData = new ArrayList<>();
        testData.add(1);
        testData.add(null);
        testData.add(2);

        Double d = mathService.average(testData);
        assertEquals(1.5, d, 0);
    }
}