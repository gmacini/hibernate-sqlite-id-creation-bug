Run using

```./mvnw clean -e compile exec:java -Dexec.mainClass="com.example.Main"```

This will create a file in the root directory named hibernate-bug-test.db.

You can analyze the generated database and observe the following:

1) Table working-id-with-generation-type-auto: the field 'id' is created correctly with Data Type INTEGER.

2) Table not-working-id-with-generation-type-identity: the field 'id' is created with the incorrect type ANY because the generation type is set to IDENTITY.
