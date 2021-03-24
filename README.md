# Demo 03/2021
This is the code for the two questions about palindromes and revers binary.

## How to use
For the palindromes you need to use the next endpoint

```
localhost:8080/palindromes/getLongest?toFind=abbc
```

Where toFind is the param to be search.


For the binary reverse, you just need to run the test, and put the desiarable string in the Before method

```java
@BeforeAll
	static void setUpBeforeClass() throws Exception {
		nums = Stream.of("47","65","12").collect(Collectors.toList());
	}
```