package junit4.api.suite;

import junit4.AssertionTests;
import junit4.LifeCycleTests;
import junit4.Parameter1Tests;
import junit4.api.category.TestMac;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;

import static org.junit.experimental.categories.Categories.ExcludeCategory;
import static org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@ExcludeCategory(TestMac.class)
@SuiteClasses({LifeCycleTests.class, Parameter1Tests.class, AssertionTests.class})
public class TestSuiteExcludeCategoryTests {
}
