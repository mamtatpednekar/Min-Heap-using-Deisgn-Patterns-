# Min-Heap-using-Deisgn-Patterns-

The goal of this assignment is to improve on your assignment one and implement iterator, null 
object, decorator and strategy patterns.

1. Review your units tests for adding elements to the Min Heap from assignment 1. Make sure
that the tests adequately test adding elements to the heap. Record those tests. When you
are done with the assignment determine how good the tests were. That after making the
changes required in this assignment you were confident that worked after running the tests.
Did you have add to or modify your tests?
2. Refactor your heap code to use standard names for methods, remove helper methods on
the heap that deal with heap nodes, and any other clean up you feel is needed in your
code. You might find the refactorings rename and move useful here.
3. The heap class is a collection. Determine the correct location in your language’s collection
class hierarchy. Find all methods that you need to implement in-order to add your class in
the language’s collection class hierarchy.
4. Make the parent class of your heap the parent determined in problem 3. Rename your existing methods to conform to the collection classes standards. One may need to stub some
methods to satisfy the parent class's constraints. Note we will only be interested in implementing a few of these methods. You do not have to implement all the methods in the parent class. We will need at least the add method, toArray and the toString method. As in assignment 1 don't use arrays or other collection classes to implement your heap.
5. Use the strategy pattern to allow your heap to be either a min heap or a max heap.
6. Implement an external iterator for your heap. Using an in-order traversal will be easier than
pre-order or post-order. Don't covert your heap to an array or other collection to implement
your iterator.
7. Implement an internal iterator for your heap.
8. Use the null object pattern to remove null checks when finding the height of the heap. Can
you remove other null checks?
9. Implement what we will for now will call OddFilter. Using Java syntax the class will have the
methods given below. People using other languages may need to implement different
methods to conform to their language's conventions.
OddFilter(Iterator input) - constructor 
boolean hasNext() - returns true if the iteration has more elements that are odd integers. 
next() - returns the next element in the iteration that is an odd integer. 
10.Create a decorator class OddHeapDecorator that decorates your new Heap class. The
decorator modifies the toString, toArray and iterator methods to return just odd integers.
Does this make sense as a decorator?
