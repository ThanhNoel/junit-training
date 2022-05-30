package junit5.support;

import org.junit.jupiter.api.extension.*;

public class LoggingExtension implements BeforeAllCallback, AfterAllCallback, BeforeEachCallback, AfterEachCallback, BeforeTestExecutionCallback, AfterTestExecutionCallback {

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("afterEach............" + extensionContext.getDisplayName());
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        System.out.println("beforeAll............" + extensionContext.getDisplayName());
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("beforeEach............" + extensionContext.getDisplayName());
    }

    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        System.out.println("afterAll............" + extensionContext.getDisplayName());
    }


    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        System.out.println("beforeTestExecution............" + extensionContext.getDisplayName());
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        System.out.println("afterTestExecution............" + extensionContext.getDisplayName());
    }
}
