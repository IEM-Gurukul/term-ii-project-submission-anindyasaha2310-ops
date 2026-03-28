[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title: Student Attendance Management System Using OOP in Java (Console-Based)

## Problem Statement:
Maintaining student attendance manually is time-consuming and prone to errors. Teachers often face difficulty in calculating attendance percentages and organizing records efficiently using traditional methods. There is a need for a simple automated system that can store student details, record attendance, and calculate attendance percentages accurately. This project proposes a console-based Student Attendance Management System developed using Object-Oriented Programming (OOP) in Java. The system enables teachers to add students, mark attendance, and view attendance records in a structured and organized manner.

## Target User
• Teachers (System Operators)
• School or College Faculty Members

## Core Features
• Add new students to the system
• Mark attendance as present or absent
• View all student attendance records
• Automatic calculation of attendance percentage
• Menu-driven console interface

## OOP Concepts Used
Abstraction: An abstract class 'User' is used to define common properties.
Inheritance: 'Student' and 'Teacher' classes inherit from the 'User' class.
Polymorphism: Method overriding is implemented through the displayRole() method.
Exception Handling: Try-catch blocks handle invalid inputs and duplicate entries.
Collections: HashMap is used to dynamically store student records

## Proposed Architecture Description
The system follows a simple structured design where the main class controls the execution through a menu-driven interface. Separate classes are created for different roles to ensure modularity. Student data is stored in memory using Java Collections. The project demonstrates core OOP principles including abstraction, inheritance, and polymorphism in a practical implementation.

## How to Run
The system can be executed using any standard Java development environment such as Eclipse. All source files are organized into appropriate packages and must be compiled before execution. The application is initiated through the MainApp class, which contains the main method. Upon execution, a menu-driven console interface is displayed, allowing the user to perform operations such as adding students and marking attendance.

## Git Discipline Notes
Minimum 10 meaningful commits required.
