import java.lang.IO;

// In java 25, a new class IO is created in java.lang package, so it can be used without importing it, 
// It has methods to take input and give output in the console,
// This is mainly created to make the process of input and output easy in java


// some insights about IO class,
// IO class is the final class in jdk25 
// this is the direct child of the Object class
// it is basically 5 public static methods used for input and output in an easy way

// public static void print(Object o)
// public static void println(Object o)
// public static void println()  --> works as a line separator to standard o/p
// public static String readln() --> reads a single line of text from the input
// public static String readln(String prompt)  --> outputs the prompt and then reads a single line of input