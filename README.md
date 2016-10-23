# ProgrammerProfiler (aka PP Tool)
Automatic Programmer Profiling Tool for Java Language

Developed as part of a Master's Dissertation in Software Engineering at Minho University

Currently there is no standalone version of the PP Tool. 
In order to run it must be manually compiled.

To execute the tool for a set af exercises to the same problem, run the ProjectProfiler.main() class passing a path of exercises and one of those exercise's folder as parameters. E.g:
```sh
ProjectProfiler.main() "ExerciseExamples\\Ex1_P1_Numeros" "P"
```
This previous example is ready to run on the project.

To calulate the profiles for a set of exercises solved, you must call the PP class:
```sh
PP.main()
```

This latter class does not need parameters.
