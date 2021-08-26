# simple-string-calculator
Part of Incubyte Assessment 😃

Commits explanation: -

1. ## <u>[Init Empty Gradle Project🏭](https://github.com/kartik-madhak/simple-string-calculator/commit/8f93c35f65f1271c7c9006ede65cdd67d5a4f34c)</u>

   This commit just added a basic Gradle Java project (created using IntelliJ), nothing more.

2. ## <u>[Create README.md](https://github.com/kartik-madhak/simple-string-calculator/commit/b3db7120826db78d449ed7023ec42d18c1c3c617)</u>

   This commit added a simple readme file.

3. ## <u>[Added empty test case 🧪](https://github.com/kartik-madhak/simple-string-calculator/commit/9838a6c9c10d12cd758f7934384513f3cdc7622f)</u>

   This commit added an empty testcase which should always pass.

4. ## <u>[Added object creation test case 🎇](https://github.com/kartik-madhak/simple-string-calculator/commit/7a46fb303568157650e3a1f5ea0cfdf2c605327f)</u>

   This commit created ```SimpleCalculator``` class and tested its object creation (by calling constructor before each testcase).

5. ## <u>[Added test case for checking empty string 🧵](https://github.com/kartik-madhak/simple-string-calculator/commit/07d439f12baf6314c3f3cc36fe9fdf45a633840a)</u>

   This commit adds a testcase that verifies that ```SimpleCalculator``` class supports an empty string as an argument. We do not write any logic for ```SimpleCalculator``` beyond what satisfies this testcase.

6. ## <u>[Added test case for checking one number in the string 1️⃣](https://github.com/kartik-madhak/simple-string-calculator/commit/13f44d247011bdf0f9eef311d7952fa4bcef3610)</u>

   This commit adds testcase that verifies the working of our class with one number in the string. We refactor our class to satisfy this testcase.

7. ## <u>[Added test case for checking two comma seperated numbers 🥈](https://github.com/kartik-madhak/simple-string-calculator/commit/874602eda768b4230b7c47a547dcc649d8ff2c70)</u>

   This commit verifies the class for two comma separated values. We are starting to include relevant logic in our code now...

8. ## <u>[Added test case for checking any comma seperated numbers ⚓](https://github.com/kartik-madhak/simple-string-calculator/commit/f0fb1c019b55eae7a9a6bda0d3bad5037ed79897)</u>

   This testcase verifies the program for handling multiple comma separated numbers.

9. ## <u>[Added test case for checking newlines b/w commas 🎈](https://github.com/kartik-madhak/simple-string-calculator/commit/c6826a383a46f612355ced69b34a757ec137760c)</u>

   This commit has testcase which verifies that the code can handle newlines/space characters between the numbers.

10. ## <u>[Added support for specifying delimiter character(s) 🎉](https://github.com/kartik-madhak/simple-string-calculator/commit/52c5167d048d5f58d042219c52593aa8cc97e10d)</u>

    Added the testcases that verifies the program for custom delimiter character(s). Note: multiple delimiter characters are supported. Plus, the previous testcases are not violated 🥳.

11. ## <u>[Added test case for checking negative numbers. ⭕](https://github.com/kartik-madhak/simple-string-calculator/commit/1d8bee9ab27ea04f6bad7f9458ecb630a402d5bb)</u>

    This testcase ensures that negative inputs throw an exception. NOTE: I modified the version of junit from 4 to 5 in this commit.

12. ## <u>[Added test case for checking multiple delimiters. 🤹‍♀️](https://github.com/kartik-madhak/simple-string-calculator/commit/5fea3507263c6694a50d8af01c5edf8b342e8514)</u>

    This final commit contains two changes: -

    - Added support for handling (ignoring) numbers greater than 1000.
    - Added support for handling multiple delimiters enclosed by '[]' in the delimiter string.

    Apart from that, this commit also adds documentation to all the methods in the class.

    This commit might seem large at first glance, but it is just because of the second change for handling multiple delimiters... It could be technically broken down into smaller commits, but I did not do so just to make commits 

