# Problem1
MinimumUniqueArraySum


To Run the program
-----------------------
simply run the class MinimumUniqueArraySumExecutor.java .


Input 
--------------------------
1.Enter the numberOfElements for the array. <n> (number of input : 1)
2.Enter the Elements of the Array. (number of inputs : n)

Output:
-----------------
sum of the Array.(number of output:1)


Example Input
----------------
5             
1
2
2
3
7

Output
-----------------
17            - sum of the Array ( 1+2+3+4+7=17)


Note 
--------------------------
1.Interface UniqueArray has the method declarations.
2.MinimumUniqueArraySum is a class which implements the uniqueArray interface.
3.MiminimumUniqueArraySumExecutor is a class which act as an executor,  helps to test the input.

#Problem2
Super Stack 

To Run the program 
------------------------
Simply run the class SuperStackExecutor.java



Input 
--------------------------
1.Enter the number Of Actions to be performed agaist the stack. <n> (number of input : 1)
2.Enter the actions to be performed agaist the stack. (number of inputs : n)

Output:
-----------------
Results of the actions ( number of output:n) 


Example Input
----------------
10
push 4

pop

push 3

push 2

push 5

inc 3 1

push 7

pop

inc 2 2

pop

OutPut:
--------------------------

4
EMPTY
3
2
5
6
7
6
6
5

Actual stack on Every Action:
--------------------------------
10
push 4
[4]
4
pop
EMPTY
push 3
[3]
3
push 2
[3, 2]
2
push 5
[3, 2, 5]
5
inc 3 1
[4, 3, 6]
6
push 7
[4, 3, 6, 7]
7
pop
6
inc 2 2
[6, 5, 6]
6
pop
5

Note
------------
Stack.java - interface which has the declaration action to be performed on the stack.
StackOperation.java - enum which tells the action can be performed on the stack.
SuperStack.java  - Implements the stack interface
SuperStackExecutor.java - executor to test the actions.




#Problem 3
CountingPairs

To Run the program 
---------------------------
Simply Run the class CountingPairs.java 


Input :
--------------------
1 number of elements n 
2.Elements  a[i]
3. difference value which should be with the every distinct pairs. k

Output 
---------
Number of distinct pairs that has the same difference value ( a+k =b) 

Example 
--------------
6    n 

1
1
2
2
3
3

1     k

Output 
---------------
2


Note 
-------------------
1.CountingPairs.java which has the implementation of the logic and main method too.
