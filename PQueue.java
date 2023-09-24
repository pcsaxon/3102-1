package dateorganizer;

import java.util.*;

/**
 * This class describes a priority min-queue that uses an array-list-based min binary heap 
 * that implements the PQueueAPI interface. The array holds objects that implement the 
 * parameterized Comparable interface.
 * @author Duncan
 * @param <E> the priority queue element type. 
 * @since 99-99-9999
 */
public class PQueue<E extends Comparable<E>> implements PQueueAPI<E>
{    
   /**
    * A complete tree stored in an array list representing the 
    * binary heap
    */
   private ArrayList<E> tree;
   /**
    * A comparator lambda function that compares two elements of this
    * heap when rebuilding it; cmp.compare(x,y) gives 1. negative when x less than y
    * 2. positive when x greater than y 3. 0 when x equal y
    */   
   private Comparator<? super E> cmp;
   
   /**
    * Constructs an empty PQueue using the compareTo method of its data type as the 
	* comparator
    */
   public PQueue()
   {
      //implement this method
   }
   
   /**
    * A parameterized constructor that uses an externally defined comparator    
    * @param fn - a trichotomous integer value comparator function   
    */
   public PQueue(Comparator<? super E> fn)
   {
	   // implement this method
   }

   public boolean isEmpty()
   {
      // implement this method
      return false;
   }

   public void insert(E obj)
   {
      //implement this method
   }

   public E remove() throws PQueueException
   {
      //implement this method
      return null;
   }
 
   public E peek() throws PQueueException
   {
      //implement this method
      return null;
   }

   public int size()
   {
      //implement this method
      return -1;
   }
   
   /**
    * Swaps a parent and child elements of this heap at the specified indices
    * @param place an index of the child element on this heap
    * @param parent an index of the parent element on this heap
    */
   private void swap(int place, int parent)
   {
      //implement this method
   }

   /**
    * Rebuilds the heap to ensure that the heap property of the tree is preserved.
    * @param root the root index of the subtree to be rebuilt
    */
   private void rebuild(int root)
   {
      //implement this method
   }
}
