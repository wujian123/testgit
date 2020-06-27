package org.simulate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    private final String abc = "abc";

    private static final String aa = "1111111111";

    public static void main(String[] args) {
        System.out.println("test");
        LOGGER.info("test");
    }

    public int add(IService service, int a, int b) {
        if (a > 10) {
            return 1;
        }
        int i = service.hashCode();
        System.out.println(i);
        return service.add(a, b);
    }

    public String add2(String s1, String s2) {
        return s1 + s2;
    }
}
