package junit5.support;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.lang.reflect.Field;

public class LogExtension implements BeforeTestExecutionCallback, AfterEachCallback {

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        Object testCase = extensionContext.getTestInstance().get();
        Class<?> clazz = testCase.getClass();
        Field field = clazz.getDeclaredField("list");
        field.setAccessible(true);
        Object value = field.get(testCase);
        System.out.println(">> Before sort " + value);
        field.setAccessible(false);
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        Object testCase = extensionContext.getTestInstance().get();
        Class<?> clazz = testCase.getClass();
        Field field = clazz.getDeclaredField("list");
        field.setAccessible(true);
        Object value = field.get(testCase);
        System.out.println(">> After sort " + value);
        field.setAccessible(false);
    }
}
