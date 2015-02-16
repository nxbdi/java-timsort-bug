/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.io;

public abstract class OutputStream extends java.lang.Object implements java.io.Closeable, java.io.Flushable
{


   /*@ requires true; ensures true; assignable \everything; */
   public OutputStream();

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract void write(int arg0) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public void write(byte[] arg0) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public void write(byte[] arg0, int arg1, int arg2) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public void flush() throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public void close() throws java.io.IOException;
}