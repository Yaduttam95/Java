<p align="center">
    <a href="https://github.com/Yaduttam95/Java">
        <img alt="Java" src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" >
    </a>
</p>

<p align="center">
This repository consists of programs created by me using Java.
</p>


[![GitHub last commit](https://img.shields.io/github/last-commit/Yaduttam95/Java)](https://github.com/Yaduttam95/Java/commits/master)
[![GitHub repo size](https://img.shields.io/github/repo-size/Yaduttam95/Java)](https://github.com/Yaduttam95/Java/archive/master.zip)


# Java
Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere meaning that compiled Java code can run on all platforms that support Java without the need to recompile.

## Origin and History
Java was originally developed by James Gosling at Sun Microsystems and released in May 1995 as a core component of Sun Microsystems' Java platform. The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GPL-2.0-only license. Oracle offers its own HotSpot Java Virtual Machine, however the official reference implementation is the OpenJDK JVM which is free open-source software and used by most developers and is the default JVM for almost all Linux distributions.
### Goals in creation of Java Language
1.  It must be simple, object-oriented, and familiar.
2.  It must be robust and secure.
3.  It must be architecture-neutral and portable.
4.  It must execute with high performance.
5.  It must be interpreted, threaded, and dynamic.

## Versions
| Version | Date |
| --- | --- |
| JDK Beta | 1995 |
| JDK 1.0 | January 23, 1996 |
| JDK 1.1 | February 19, 1997 |
| J2SE 1.2 | December 8, 1998 |
| J2SE 1.3 | May 8, 2000 |
| J2SE 1.4 | February 6, 2002 |
| J2SE 5.0 | September 30, 2004 |
| Java SE 6 | December 11, 2006 |
| Java SE 7 | July 28, 2011 |
| Java SE 8 (LTS) |	March 18, 2014 |
| Java SE 9 | September 21, 2017 |
| Java SE 10 | March 20, 2018 |
| Java SE 11 (LTS) | September 25, 2018 |
| Java SE 12 | March 19, 2019 |
| Java SE 13 | September 17, 2019 |
| Java SE 14 | March 17, 2020 |
| Java SE 15 | September 15, 2020 |
| Java SE 16 | March 16, 2021 |
| Java SE 17 (LTS) | September 14, 2021 |
| Java SE 18 | March 2022 |


## Compilation and Running
Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture.
One design goal of Java is portability, which means that programs written for the Java platform must run similarly on any combination of hardware and operating system with adequate run time support. This is achieved by compiling the Java language code to an intermediate representation called Java bytecode, instead of directly to architecture-specific machine code. Java bytecode instructions are analogous to machine code, but they are intended to be executed by a virtual machine (VM) written specifically for the host hardware. End-users commonly use a Java Runtime Environment (JRE) installed on their device for standalone Java applications or a web browser for Java applets.

Standard libraries provide a generic way to access host-specific features such as graphics, threading, and networking.

The use of universal bytecode makes porting simple. However, the overhead of interpreting bytecode into machine instructions made interpreted programs almost always run more slowly than native executables. Just-in-time (JIT) compilers that compile byte-codes to machine code during runtime were introduced from an early stage. Java's Hotspot compiler is actually two compilers in one; and with GraalVM (included in e.g. Java 11, but removed as of Java 16) allowing tiered compilation. Java itself is platform-independent and is adapted to the particular platform it is to run on by a Java virtual machine (JVM) for it, which translates the Java bytecode into the platform's machine language.


## Syntax
The syntax of Java is largely influenced by C++ and C. Unlike C++, which combines the syntax for structured, generic, and object-oriented programming, Java was built almost exclusively as an object-oriented language. All code is written inside classes, and every data item is an object, with the exception of the primitive data types, (i.e. integers, floating-point numbers, boolean values, and characters), which are not objects for performance reasons. Java reuses some popular aspects of C++ (such as the printf method).

Unlike C++, Java does not support operator overloading or multiple inheritance for classes, though multiple inheritance is supported for interfaces.

Java uses comments similar to those of C++. There are three different styles of comments: a single line style marked with two slashes (//), a multiple line style opened with /* and closed with */.
### Hello World Example
```java
public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```
