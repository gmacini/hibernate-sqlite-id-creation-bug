Run using

```./mvnw clean -e compile exec:java -Dexec.mainClass="com.example.Main"```

This will create a file in the root directory named hibernate-bug-test.db.

You can analyze the generated database and observe the following:

1) Table WorkingWithBothFieldsIntegerAndIdAlphabeticallyFirstEntity: the field 'id' is created correctly.

2) Table WorkingOnlyIdAsIntegerAndIdAlphabeticallySecondEntity: the field 'id' is created correctly.

3) Table NotWorkingWithIdNotIntegerAndAnotherColumnAsIntegerAndIdAlphabeticallyFirstEntity: the field 'id' is not created correctly because 'zanotherColumn' is an Integer and 'id' is a Long.

4) Table NotWorkingWithBothFieldsIntegerAndIdAlphabeticallySecondEntity: the field 'id' is not created correctly because it is alphabetically after 'anotherColumn'.