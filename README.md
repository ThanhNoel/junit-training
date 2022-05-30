##A.Run junit with maven
1.Run all test classes:
> ```
mvn test
```

2.Run multiple test classes:
> ```
mvn test -Dtest=junit4.api.TestCase1Tests,junit4.api.TestCase2Tests
```

3.Run multiple test classes with wildcard:
> ```
mvn test -Dtest=junit4.api.TestCase*Tests
```

4.Run a test class:
> ```
mvn test -Dtest=junit4.api.TestCase1Tests
```

5.Run a test method inside a test class:
>  ```
mvn test -Dtest=junit4.api.TestCase1Tests#testAddTwoNumber 
```

## B.  Test Coverage
1.To export test coverage report
> ```
mvn jacoco:report
```

2.Report file location
> [${source}/target/site/jacoco/index.html](./target/site/jacoco/index.html)