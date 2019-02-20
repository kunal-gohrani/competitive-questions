# competitve-questions
This repository contains many competitive questions and their codes written in java

Q1)Create a game with a language only containing 'A' and 'B', we take input of two strings:- initial and target. We need to convert the initial to the target string by using these two rules:-
  1. Add 'A' to end of initial
  2. Add 'B' to end of initial and reverse the string such that B is first letter.
  
Print "Possible" if we can convert initial to target and "Impossible" if we cannot.
Constraints:-
  1.Initial is always lesser than target
  2. initial is between 1 and 49 characters
  3. target is between 2 and 50 characters
  
 
 Sameple Input:-
 1. initial string :- AB
    target string :- ABA
    (Add A to end of initial)
    initial string:- ABA
    initial string == target string
    
2. initial string:- ABA
    target string:- BABA
    (add B to end of initial and reverse the string)
    initial string:- BABA
    initial string == target string
    
     See Eng.java for code.
    
 
