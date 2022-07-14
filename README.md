# KIT107_Assign1
This is an assignment for a Java program to calculate and display all possible flavours for a range of banana pieces and curry concentrations.
I got 93.75% which is a HD for this assignment.

My solution runs in Dr Java and comprise the following files:
• SweetFAInterface.java and SweetFA.java — the Flavour ADT. You should have the following methods: a constructor, ‘getters’ and ‘setters’ for the curry concentration object and number of banana pieces, and ‘doer’ methods to calculate the flavour, determine whether the flavour exceeds the threshold, and convert the flavour to each of a double and a String.
• CurryInterface.java and Curry.java — the specification and implementation (respectively) of a curry concentration. A curry concentration should be implemented as a class with instance variables which consist of:
o the current curry concentration value (as a double); and
o the curry step value (as a double).
The class should also contain methods as specified in the interface, i.e. a constructor, setter and getter for the step value, getter for the concentration value, a doer which checks whether the concentration value is at the maximum (and if so returns false, and if not increases the concentration value by the step and returns true), and a method to convert the concentration value to a String.
• AssigOne120.java — the file which contains the main() method.
