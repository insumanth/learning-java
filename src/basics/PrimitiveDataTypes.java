package basics;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
/**
 * Primitive Data Types
 * https://dev.java/learn/language-basics/primitive-types/
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 */



/**
 *
 Data  & its Default Value (for fields)
 byte	0
 short	0
 int	0
 long	0L
 float	0.0f
 double	0.0d
 char	\u0000
 String (or any object)	null
 boolean	false
 */

/**
 * Primitive Numeric Data Types.
 *
 * byte: The byte data type is an 8-bit signed two's complement integer.
 * It has a minimum value of -128 and a maximum value of 127 (inclusive).
 * The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters.
 *
 * short: The short data type is a 16-bit signed two's complement integer.
 * It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
 *
 * int: By default, the int data type is a 32-bit signed two's complement integer,
 * which has a minimum value of -231 and a maximum value of 231-1.
 *
 * long: The long data type is a 64-bit two's complement integer.
 * The signed long has a minimum value of -263 and a maximum value of 263-1.
 */
        byte byteNumber = 127;
        short shortNumber = 270;
        int intNumber = 1234;
        long longNumber = 6720L;

/**
 * Primitive IEEE Floating point Data Types
 *
 * float: The float data type is a single-precision 32-bit IEEE 754 floating point.
 *
 * double: The double data type is a double-precision 64-bit IEEE 754 floating point.
 */

        float floatNumber = 1.2F;
        double doubleNumber = 1290.807623;

/**
 * Character Data Type
 *
 * char: The char data type is a single 16-bit Unicode character.
 * It has a minimum value of \u0000 (or 0) and a maximum value of \uffff (or 65,535 inclusive).
 */
        char charData = 'a';

/**
 * Boolean data types
 *
 * boolean: The boolean data type has only two possible values: true and false.
 * Use this data type for simple flags that track true/false conditions.
 * This data type represents one bit of information, but its "size" isn't something that's precisely defined.
 */
        boolean isBooleanType = true;


/**
 * Integer Literals
 * An integer literal is of type long if it ends with the letter L or l; otherwise it is of type int.
 *
 * Values of the integral types byte, short, int, and long can be created from int literals.
 * Values of type long that exceed the range of int can be created from long literals.
 * Integer literals can be expressed by these number systems:
 */

        int decimalValue = 26; // The number 26, in decimal
        int octalValue = 032; // The number 26, in octal, not 32.  So, don't put '0' in front of numbers
        int hexadecimalValue = 0x1a; //  The number 26, in hexadecimal
        int binaryValue = 0b11010; // The number 26, in binary

/**
 * Floating-Point Literals
 * A floating-point literal is of type float if it ends with the letter F or f;
 * otherwise its type is double and it can optionally end with the letter D or d.
 *
 * The floating point types (float and double) can also be expressed using E or e (for scientific notation),
 * F or f (32-bit float literal) and D or d (64-bit double literal; this is the default and by convention is omitted).
 */
        double d1 = 123.4;

        // same value as d1, but in scientific notation
        double d2 = 1.234e2;
        float f1  = 123.4f;

/**
 * Character and String Literals
 * Literals of types char and String may contain any Unicode (UTF-16) characters.
 *  Always use 'single quotes' for char literals and "double quotes" for String literals.
 *
 *  The Java programming language also supports a few special escape sequences for char and String literals:
 *  \b (backspace), \t (tab), \n (line feed), \f (form feed), \r (carriage return), \" (double quote), \' (single quote), and \\ (backslash).
 */

/**
 * There is also a special null literal that can be used as a value for any reference type.
 * The null literal may be assigned to any variable, except variables of primitive types.
 * There is little you can do with a null value beyond testing for its presence.
 * Therefore, null is often used in programs as a marker to indicate that some object is unavailable.
 *
 * Finally, there is also a special kind of literal called a class literal, formed by taking a type name and appending .class;
 * for example, String.class. This refers to the object that represents the type itself, of type Class.
 *
 *
 */

    }
}
