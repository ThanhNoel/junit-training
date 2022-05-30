package junit4.api.suite;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit4.api.testcase.TestCaseJunit3StyleTests;

public class RunTestSuites {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuite01.class, TestCaseJunit3StyleTests.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure);
        }
        System.out.println(result.wasSuccessful());
    }
}
