# Java Uncommon Bug: Repeated ArithmeticException

This repository demonstrates a subtle bug in Java exception handling.  The `UncommonBug.java` file contains a program that repeatedly attempts to divide by zero within a loop. Although an `ArithmeticException` is caught, the loop continues without appropriate handling. This leads to the same exception message printed multiple times, suggesting an error without providing useful information for debugging. The `UncommonBugSolution.java` file offers a corrected version.

**The Problem:**
The initial code enters an infinite loop due to the exception. It does not handle the cause of the exception: `i` is incremented but the division by zero will persist until `i` is not zero.

**The Solution:**
The solution demonstrates proper exception handling by adding a `break` statement to exit the loop after catching the `ArithmeticException`, preventing redundant exception messages and infinite loop.