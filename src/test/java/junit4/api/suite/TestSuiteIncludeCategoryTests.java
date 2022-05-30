package junit4.api.suite;

import junit4.AssertionTests;
import junit4.LifeCycleTests;
import junit4.Parameter1Tests;
import junit4.api.category.TestMac;
import junit4.api.category.TestOrder;
import junit4.MethodOrderTests;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;

import static org.junit.experimental.categories.Categories.IncludeCategory;
import static org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory({TestMac.class, TestOrder.class})
@SuiteClasses({LifeCycleTests.class, Parameter1Tests.class, AssertionTests.class, MethodOrderTests.class})
public class TestSuiteIncludeCategoryTests {
}
