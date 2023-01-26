# Java-Lab-002

## Variables, Types and Operators

Be able to explain what variables are. Understand variable types, allowed names, and valid values.
Know how to create and use string, integer, floating-point, and boolean variables.

### Part 1 - PricelessScript.java - [MasterCard YouTube Ad](https://www.youtube.com/watch?v=Q_6stXKGuHo)

The lab template contains a program that prints the following:
```
2 tickets: $28.00
2 hotdogs, 2 popcorn, 2 sodas: $18.00
1 autographed baseball $45.00
real conversation with 11 year old son: priceless
true
```

Ignore the code that you don't fully recognize and concentrate on changing the variables to alter the MasterCard *Priceless* script to say:
```
3 tickets: $42.00
3 hotdogs, 3 popcorn, 3 sodas: $27.00
2 autographed baseball $90.00
watching the Giants win: priceless
false
```

### Part 2 - Interpretation
Take note of the various variables and their data types. Write a brief summary in this section of the README.md file listing the:
* Variable name
* Its data type
* and example values you can assign them.

------------------------------------------

people
int
5

ticketPrice
float
12.0f

itemPrice
double
142.45

trueOrFalse
boolean
true
-------------------------------------------

Next give TWO example variable names and 
TWO example variable assignments that are 
*WRONG* and explain why.
* Hint: your IDE can help you discover these!

______________________________________________
Variable names that you can't use 
because they are reserved include:
double, boolean, int, import... You also cannot have
spaces in the variable names, or start variable name 
with a number.

Some variable assignments that are wrong, for example 
int x = 5.0 is wrong because 5.0 needs to be a floating-point
and needs to be double x = 5.0.

Another wrong one is double y = 1 / 3 this is wrong because
the interpreter divides the two integers, so Java does integer 
division and returns an int value of 0 and then gets converted 
to a double value of 0.0


______________________________________________





### Part 3 - Bonus: Play around with Java String Format Specifiers.

Pick several of the Java format specifiers below and define variables of the correct type utilize *sout* and *String.format* to view the resulting formats.

![Format Specifiers](JavaStringFormatSpecifiers.png)

### Part 4 - Submission
* Just as you did last week (Reference the Lab video in your Week 1 module), create a Spring2023 feature branch of your code
* Commit your working code to your local copy
* Push it to your Remote/origin branch (i.e. GitHub: Spring2023 -> origin/Spring2023)
* Then issue a Pull request to my instructor branch
    * Make sure to save the Pull request URL and submit it for the lab.
