/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.nio.file;

public abstract class FileStore extends java.lang.Object
{


   /*@ requires true; ensures true; assignable \everything; */
   protected FileStore();

   /*@ requires true; ensures true; assignable \everything; */
   public abstract java.lang.String name();

   /*@ requires true; ensures true; assignable \everything; */
   public abstract java.lang.String type();

   /*@ requires true; ensures true; assignable \everything; */
   public abstract boolean isReadOnly();

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract long getTotalSpace() throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract long getUsableSpace() throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract long getUnallocatedSpace() throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; */
   public abstract boolean supportsFileAttributeView(java.lang.Class arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public abstract boolean supportsFileAttributeView(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public abstract java.nio.file.attribute.FileStoreAttributeView getFileStoreAttributeView(java.lang.Class arg0);

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract java.lang.Object getAttribute(java.lang.String arg0) throws java.io.IOException;
}