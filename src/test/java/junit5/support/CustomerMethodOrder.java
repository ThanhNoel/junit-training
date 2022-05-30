package junit5.support;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrdererContext;

public class CustomerMethodOrder implements MethodOrderer {
    @Override
    public void orderMethods(MethodOrdererContext methodOrdererContext) {
        methodOrdererContext.getMethodDescriptors().sort((m1, m2) -> m1.getMethod().getName().compareToIgnoreCase(m2.getMethod().getName())); // compare method name ignore case
    }
}
