# -TDDwJUnitRomanNumeralConverterI
 TDD with JUnit
========================
Given the IRoman interface below:
 
                                public interface IRoman {
                                                                                                public int convert(String input);
                                }
Use TDD to write approppriate tests and the implementating code to meet the below requirements.
The implementing classes must implement the approppriate service interface provided
 
This service requires an implementing class Roman that fulfils the interface contract.
To be successful, the implementing class must return the appropriate String value when an int representing an input is passed in.
They are as follows:
•             return 1 when input I.
•             return 5 when input V.
•             return 10 when input X.
•             return ERROR_MESSAGE when input is empty.
•             return ERROR_MESSAGE when input is blank spaces.
•             return ERROR_MESSAGE when input is too long.
