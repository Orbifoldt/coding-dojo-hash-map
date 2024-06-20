# Coding Dojo Kata: HashMap
## Hash map background info 
A hash map (or hash table) is a data structure for storing key-value pairs. These key-value pairs are grouped by the hash value of their keys, each of these groups is called "bucket". This allows for constant-time lookup of data.

## Goal
Create a `HashMap` implementation using the provided hashing function [`HashingFunction::hash`](./src/main/java/com/abnamro/HashingFunction.java). It must match the following requirements:
- A HashMap must be able to store key-value pairs, where the keys are `String`s.
- Must be able to retrieve a value based on the key. The map should return `null` if it doesn't contain the key.
- Each key in a HashMap must be unique.
- A HashMap must provide constant-time performance (`O(1)`) for adding, removing, and retrieving elements.
- A HashMap must provide a way to get the number of elements currently stored in the map.

[//]: # (Bonus:)
[//]: # (- A HashMap must provide an iterator that traverses the elements in the order they were added.)
[//]: # (- A HashMap must implement the `java.util.Map` interface)
[//]: # (- A HashMap must be able to dynamically resize itself as needed to accommodate more elements.)

# Coding Dojo 
A coding dojo is a collaborative and hands-on session where programmers can practice and improve their coding skills. Participants work on a coding challenge together, taking turns at the keyboard and sharing their thought process and feedback.

A "randori coding dojo" is a coding dojo where the group switches roles every few minutes  to keep everyone involved and focused. These roles are:
- Driver: the person that is typing
- Copilot: assists the driver
- Audience: listen and watch, and only make suggestions when all tests are green or when asked directly
- Sensei: doesn't participate but leads the whole session and ensures we follow the rules

Besides this we will also follow the principles of TDD.

# Test driven development (TDD)
TDD is a software development process following these rules:
- start with writing a test describing a requirement of the program, this test will fail (red), 
- then write "just enough" code to make the test pass (green), 
- and finally refactor the code to improve its design. 

This cycle is repeated for each new feature or change, resulting in a well tested piece of software. Note that this in particular means that you are only allowed to write new code once you have a failing test, and that the code that you write should be the absolute minimum to let the test pass.

