# Assignment_Concept-of-programming

# Questio of Assignment - 01


Q wap to demonstrate ternary operator .define a variable marks  .ask its value from user and using ternary operator check if marks > 40 store "Pass" in result varible else store "Fail"

Q 2 using ternary check if number entered by user is positive or negative .
In case number is positive store "Positive number" else store negative number to Result variable

Q 3 WAP to ask name ,age and salary of an employee and print on console.

Q 4 wap  that ask two numbers from user and print greater number among two 

Q 5 wap to ask product name and price of product from user and calculate discount i.e 
if price > 2000 then discount is 10 percent of price 
else 
discount is 7 % of price

Q 6   Wap to swap two numbers

Q 7  How to swap two numbers without using a third variable?

Q 8 wap to check is number is evenor odd.

Q 9   A school has following rules for grading system:
 a. Below 25 - F
 b. 25 to 45 - E
 c. 45 to 50 - D
 d. 50 to 60 - C
 e. 60 to 80 - B
 f. Above 80 - A
 Ask user to enter marks and print the corresponding grade 

Q  10 wap to check greater number among three numbers


# Questino Assignment 02


Q1 Write a program to calculate the sum of first 10 natural number.

Q 2 Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 

Q 3 Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.

Q 4 Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate.(while loop)

Q 5 Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )

Q 6 Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 24 ..... 

Q 7 Write a program to print following :

i)

**********
**********
**********
**********

ii)

*
**
***
****
*****

iii)

      *
      **
      ***
      ****
      *****
 

iv)

        *
      ***
    *****
  *******
*********

v)

        1
      222
    33333
  4444444
555555555

vi )     ABCDEEDCBA
         ABCD  DCBA
         ABC    CBA
         AB      BA
         A        A


Q 8 Write a program in java to find the sum of the even and odd digits of the number which is given as input.

Q9 Write a program to check if given number is prime or not

Q 10 write a program to print prime numbers between 2 to 20.

Q 11 Write program to find largest among three numbers

Q 20 Write a program to find sum of all integers greater than 100 and less than 200 that are divisible by 7

Q 21 8.	Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
Hint 
            System.out.println("\nDivided by 3: ");		
		for (int i=1; i<100; i++) {
			if (i%3==0) 
			System.out.print(i +", ");			
		}
 Q 22 create a menu driven application in java that show 
   "Add"        Add two number 
  "subtract"  Subtract two number 
  "Multiple"    Multiple two numbers
  "Exit "           Exit 

Ask two numbers from user  and as per user choice perform necessary action using switch command 

Q 23  Write a program to display first 1 to 20  even number on screen . Terminate the program when number 16 is found using break command .

Q 24 Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.
Hint n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1


# Question Assignment - 03

Q 1 Write a Java program to sum values of an array.

Q 2 Write a Java program to calculate the average value of array elements

Q 3Write a Java program to test if an array contains a specific value

Q 4Write a Java program to find the index of an array element

Q 5Write a Java program to copy an array by iterating the array

Q 6Write a Java program to find the maximum and minimum value of an array

Q 7Write a Java program to reverse an array of integer values.'

Q 8 Write a Java program to test the equality of two arrays

Q 9Write a Java program to find the number of even and odd integers in a given array of integers.

Q 10 Write a program to search element in array using (linear search and binary search)

Q 11 Take 20 integer inputs from user and print the following:

number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.

# Assignment 4

Q 1) create a class three methods

a) void cube(int a)

b) void square (int b)

c) void greater(int a,int b,int c)

create another class having main method
display menu
1) cube
2) square
3) greater
Ask choice from user and based on choice call above methods
Repeat the menu till choice is not equal to 0


# Cop Internal Exam Question

Q 1  Create package MyShop. 

A company named MyShop started online portal for flower selling .Design Java application that keeps its flower record and also maintain its customer database for future promotions .


b) define class Flower having fields like name ,no_of_petals, price, no_of_piece, total price
c) define no argument constructor  and initialize with some default values
d) define parameterized constructor .
e)  create calculate_discount method that checks if total price is greater than 2000 then give return 200 else return 100
f) define display method to show all values . and values after discount .

 Part B 
 In same package create another method Customer having fields like cname, address , pincode .
g) create getData and showDate method to get and display customer data .

Part C 
 
h) Create separate class AllData in same package that contains main method 
i) in main method display menu 
     1) Flower
     2) Customer 

using switch case call particular class method .Keep repeating the menu till user enter 0 (zero) 


Q 2   Given an array, print all the elements which are leaders. A Leader is an element that is greater than all of the elements on its right side in the array.

Example 1:
Input:
arr = [4, 7, 1, 0] 
Output:
7 1 0
 
Explanation:
Rightmost element is always a leader. 7 and 1 are greater than the elements in their right side. 

 
Example 2: 
Input:
arr = [10, 22, 12, 3, 0, 6]
 
Output:
22 12 6
 
Explanation:
6 is a leader. In addition to that, 12 is greater than all the elements in its right side (3, 0, 6), also 22 is greater than 12, 3, 0, 6.
 


Q 3  write a programming to check any number is spy number or not 

example 
1124 is spy  i.e 1+1+2+4  =8 
                     and 1*1*2*4=8
		
# solution 

Myshop and internal Exam folder contain solution
