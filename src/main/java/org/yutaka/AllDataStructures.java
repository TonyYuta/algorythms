package org.yutaka;

import java.util.*;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class AllDataStructures {

    public long startTime, endTime, duration;

    public static void main(String[] args) {

        // instance of a class AllDataStructures
        AllDataStructures allDataStructures = new AllDataStructures();

    } // main

    boolean arrayCollectionsMap(int num, int elemBegin, int elemIntMiddle, int elemIntEnd, String elemStr, int ind) {

        /*=============================== Array ===================================================*/

        int[] arr = new int[num];
        //----------- populate ----------------
        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            arr[i] = i;
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000000; //s
        System.out.println("Array                | Populate " + num / 1000000 + " Mln elements  takes " + duration + "s");

        //----------- insert into middle ----------------
        startTime = System.nanoTime();
        arr[ind] = elemIntMiddle;
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Array                | (" + num / 1000000 + " Mln elements): insert element into pos " + ind / 1000000 + " Mln takes " + duration + "mks");

        //----------- get element from middle ----------------
        int retrievedElem;
        startTime = System.nanoTime();
        retrievedElem = arr[ind];
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Array                | (" + num / 1000000 + " Mln elements): get element from pos " + ind / 1000000 + " Mln takes " + duration + "mks");

        //----------- remove element from middle ----------------
        startTime = System.nanoTime();
        arr = ArrayUtils.remove(arr, ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Array                | (" + num / 1000000 + " Mln elements): remove element from pos " + ind / 1000000 + " Mln takes " + duration + "mks");

        /*=============================== Vector ===================================================*/

        Vector vc = new Vector();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            vc.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000000; //s
        System.out.println("Vector               | Populate " + num / 1000000 + " Mln elements takes " + duration + "s");

        startTime = System.nanoTime();
        vc.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Vector               | (" + num / 1000000 + " Mln elements): add element takes " + duration + "mks");

        startTime = System.nanoTime();
        vc.add(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Vector               | (" + num / 1000000 + " Mln elements): add element into pos " + ind / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        vc.get(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Vector               | (" + num / 1000000 + " Mln elements): get element from pos " + ind / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        vc.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Vector               | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + "mks");

        startTime = System.nanoTime();
        vc.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Vector               | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        vc.remove(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Vector               | (" + num / 1000000 + " Mln elements): remove element from pos " + ind / 1000000 + " Mln takes " + duration + "mks");

        /*=============================== ArrayList ===================================================*/

        List al = new ArrayList();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            al.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000000; //s
        System.out.println("ArrayList            | Populate " + num / 1000000 + " Mln elements takes " + duration + "s");

        startTime = System.nanoTime();
        al.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayList            | (" + num / 1000000 + " Mln elements): add element takes " + duration + "mks");

        startTime = System.nanoTime();
        al.add(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayList            | (" + num / 1000000 + " Mln elements): add element into pos " + ind / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        al.get(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayList            | (" + num / 1000000 + " Mln elements): get element from pos " + ind / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        al.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayList            | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + "mks");

        startTime = System.nanoTime();
        al.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayList            | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        al.remove(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayList            | (" + num / 1000000 + " Mln elements): remove element from pos " + ind / 1000000 + " Mln takes " + duration + "mks");

        /*=============================== LinkedList ===================================================*/

        List ll = new LinkedList();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            ll.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000000; //s
        System.out.println("LinkedList           | Populate " + num / 1000000 + " Mln elements takes " + duration + "s");

        startTime = System.nanoTime();
        ll.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedList           | (" + num / 1000000 + " Mln elements): add element takes " + duration + "mks");

        startTime = System.nanoTime();
        ll.add(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedList           | (" + num / 1000000 + " Mln elements): add element into pos " + ind / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        ll.get(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedList           | (" + num / 1000000 + " Mln elements): get element from pos " + ind / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        ll.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedList           | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + "mks");

        startTime = System.nanoTime();
        ll.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedList           | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        ll.remove(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedList           | (" + num / 1000000 + " Mln elements): remove element from pos " + ind / 1000000 + " Mln takes " + duration + "mks");


        /*=============================== HashSet ===================================================*/

        Set hs = new HashSet<Integer>();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            hs.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000000; //s
        System.out.println("HashSet              | Populate " + num / 1000000 + " Mln elements takes " + duration + "s");

        startTime = System.nanoTime();
        hs.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashSet              | (" + num / 1000000 + " Mln elements): add element takes " + duration + "mks");

        startTime = System.nanoTime();
        hs.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashSet              | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + "mks");

        startTime = System.nanoTime();
        hs.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashSet              | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + "mks");

        /*=============================== LinkedHashSet ===================================================*/

        Set lhs = new LinkedHashSet<Integer>();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            hs.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000000; //s
        System.out.println("LinkedHashSet        | Populate " + num / 1000000 + " Mln elements takes " + duration + "s");

        startTime = System.nanoTime();
        lhs.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashSet        | (" + num / 1000000 + " Mln elements): add element takes " + duration + "mks");

        startTime = System.nanoTime();
        lhs.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashSet        | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + "mks");

        startTime = System.nanoTime();
        lhs.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashSet        | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + "mks");


        /*=============================== TreeSet ===================================================*/

        Set ts = new TreeSet<Integer>();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            ts.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000000; //s
        System.out.println("TreeSet              | Populate " + num / 1000000 + " Mln elements takes " + duration + "s");

        startTime = System.nanoTime();
        ts.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeSet              | (" + num / 1000000 + " Mln elements): add element takes " + duration + "mks");

        startTime = System.nanoTime();
        ts.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeSet              | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + "mks");

        startTime = System.nanoTime();
        ts.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeSet              | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + "mks");


        /*=============================== Stack ===================================================*/

        Stack st = new Stack();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            st.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000000; //s
        System.out.println("Stack                | Populate " + num / 1000000 + " Mln elements takes " + duration + "s");

        startTime = System.nanoTime();
        st.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Stack                | (" + num / 1000000 + " Mln elements): add element takes " + duration + "mks");

        startTime = System.nanoTime();
        st.insertElementAt(elemIntMiddle, ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Stack                | (" + num / 1000000 + " Mln elements): add element into pos " + ind / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        st.elementAt(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Stack                | (" + num / 1000000 + " Mln elements): get element from pos " + ind / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        st.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Stack                | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + "mks");

        startTime = System.nanoTime();
        st.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Stack                | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        st.remove(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Stack                | (" + num / 1000000 + " Mln elements): remove element from pos " + ind / 1000000 + " Mln takes " + duration + "mks");

        /*=============================== PriorityQueue ===================================================*/

        PriorityQueue pq = new PriorityQueue();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            pq.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000000; //s
        System.out.println("PriorityQueue        | Populate " + num / 1000000 + " Mln elements takes " + duration + "s");

        startTime = System.nanoTime();
        pq.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("PriorityQueue        | (" + num / 1000000 + " Mln elements): add element takes " + duration + "mks");

        startTime = System.nanoTime();
        pq.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("PriorityQueue        | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + "mks");

        startTime = System.nanoTime();
        pq.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("PriorityQueue        | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        pq.remove(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("PriorityQueue        | (" + num / 1000000 + " Mln elements): remove element from pos " + ind / 1000000 + " Mln takes " + duration + "mks");

        /*=============================== ArrayDeque ===================================================*/

        ArrayDeque ad = new ArrayDeque();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            ad.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000000; //s
        System.out.println("ArrayDeque           | Populate " + num / 1000000 + " Mln elements takes " + duration + "s");

        startTime = System.nanoTime();
        ad.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayDeque           | (" + num / 1000000 + " Mln elements): add element takes " + duration + "mks");

        startTime = System.nanoTime();
        ad.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayDeque           | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + "mks");

        startTime = System.nanoTime();
        ad.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayDeque           | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        ad.remove(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayDeque           | (" + num / 1000000 + " Mln elements): remove element from pos " + ind / 1000000 + " Mln takes " + duration + "mks");

        /*=============================== HashMap ===================================================*/

        Map hm = new HashMap<Integer, Integer>();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            hm.put(i, i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000000; //s
        System.out.println("HashMap              | Populate " + num / 1000000 + " Mln elements takes " + duration + "s");

        startTime = System.nanoTime();
        hm.put(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashMap              | (" + num / 1000000 + " Mln elements): put element takes " + duration + "mks");

        startTime = System.nanoTime();
        hm.get(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashMap              | (" + num / 1000000 + " Mln elements): get element with key " + ind / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        hm.containsValue(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashMap              | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + "mks");

        startTime = System.nanoTime();
        hm.replace(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashMap              | (" + num / 1000000 + " Mln elements): replace element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        hm.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashMap              | (" + num / 1000000 + " Mln elements): remove element with value " + ind / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        hm.remove(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashMap              | (" + num / 1000000 + " Mln elements): remove element with key " + ind / 1000000 + " Mln takes " + duration + "mks");


        /*=============================== Hashtable ===================================================*/

        Map ht = new Hashtable<Integer, Integer>();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            ht.put(i, i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000000; //s
        System.out.println("Hashtable            | Populate " + num / 1000000 + " Mln elements takes " + duration + "s");

        startTime = System.nanoTime();
        ht.put(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Hashtable            | (" + num / 1000000 + " Mln elements): put element takes " + duration + "mks");

        startTime = System.nanoTime();
        ht.get(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Hashtable            | (" + num / 1000000 + " Mln elements): get element with key " + ind / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        ht.containsValue(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Hashtable            | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + "mks");

        startTime = System.nanoTime();
        ht.replace(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Hashtable            | (" + num / 1000000 + " Mln elements): replace element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        ht.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Hashtable            | (" + num / 1000000 + " Mln elements): remove element with value " + ind / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        ht.remove(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Hashtable            | (" + num / 1000000 + " Mln elements): remove element with key " + ind / 1000000 + " Mln takes " + duration + "mks");



        /*=============================== LinkedHashMap ===================================================*/

        Map lhm = new LinkedHashMap<Integer, Integer>();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            lhm.put(i, i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000000; //s
        System.out.println("LinkedHashMap        | Populate " + num / 1000000 + " Mln elements takes " + duration + "s");

        startTime = System.nanoTime();
        lhm.put(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashMap        | (" + num / 1000000 + " Mln elements): put element takes " + duration + "mks");

        startTime = System.nanoTime();
        lhm.get(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashMap        | (" + num / 1000000 + " Mln elements): get element with key " + ind / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        lhm.containsValue(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashMap        | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + "mks");

        startTime = System.nanoTime();
        lhm.replace(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashMap        | (" + num / 1000000 + " Mln elements): replace element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        lhm.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashMap        | (" + num / 1000000 + " Mln elements): remove element with value " + ind / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        lhm.remove(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashMap        | (" + num / 1000000 + " Mln elements): remove element with key " + ind / 1000000 + " Mln takes " + duration + "mks");


        /*=============================== TreeMap ===================================================*/

        Map tm = new TreeMap<Integer, Integer>();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            tm.put(i, i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000000; //s
        System.out.println("TreeMap              | Populate " + num / 1000000 + " Mln elements takes " + duration + "s");

        startTime = System.nanoTime();
        tm.put(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeMap              | (" + num / 1000000 + " Mln elements): put element takes " + duration + "mks");

        startTime = System.nanoTime();
        tm.get(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeMap              | (" + num / 1000000 + " Mln elements): get element with key " + ind / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        tm.containsValue(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeMap              | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + "mks");

        startTime = System.nanoTime();
        tm.replace(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeMap              | (" + num / 1000000 + " Mln elements): replace element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        tm.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeMap              | (" + num / 1000000 + " Mln elements): remove element with value " + ind / 1000000 + " Mln takes " + duration + "mks");

        startTime = System.nanoTime();
        tm.remove(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeMap              | (" + num / 1000000 + " Mln elements): remove element with key " + ind / 1000000 + " Mln takes " + duration + "mks");

        return tm != null;
    }

//===============================================================================================

    boolean array(int num, int elemBegin, int elemIntMiddle, int elemIntEnd, String elemStr, int ind) {

        /*=============================== Array ===================================================*/

        int[] arr = new int[num];
        //----------- populate ----------------
        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            arr[i] = i;
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; //ms
        System.out.println("Array                | Populate " + num / 1000000 + " Mln elements  takes " + duration + " ms");

        //----------- contains in the middle ----------------
        startTime = System.nanoTime();
        Arrays.sort(arr);
        int contains = Arrays.binarySearch(arr, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Array                | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + " mks");

        //----------- insert into start ----------------
        startTime = System.nanoTime();
        arr[0] = elemIntMiddle;
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Array                | (" + num / 1000000 + " Mln elements): insert element into pos 0 takes " + duration + " mks");

        //----------- insert into middle ----------------
        startTime = System.nanoTime();
        arr[ind] = elemIntMiddle;
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Array                | (" + num / 1000000 + " Mln elements): insert element into pos " + ind / 1000000 + " Mln takes " + duration + " mks");

        //----------- insert into end ----------------
        startTime = System.nanoTime();
        arr[elemIntEnd-1] = elemIntEnd;
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Array                | (" + num / 1000000 + " Mln elements): insert element into pos " + num / 1000000 + " Mln takes " + duration + " mks");

        //----------- get element from middle ----------------
        int retrievedElem;
        startTime = System.nanoTime();
        retrievedElem = arr[ind];
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Array                | (" + num / 1000000 + " Mln elements): get element from pos " + ind / 1000000 + " Mln takes " + duration + " mks");

        //----------- remove element from middle ----------------
        startTime = System.nanoTime();
        arr = ArrayUtils.remove(arr, ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Array                | (" + num / 1000000 + " Mln elements): remove element from pos " + ind / 1000000 + " Mln takes " + duration + " mks");

        return arr != null;
    }

    boolean vector(int num, int elemIntBegin, int elemIntMiddle, int elemIntEnd, String elemStr, int ind) {

        /*=============================== Vector ===================================================*/

        Vector vc = new Vector();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            vc.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; //ms
        System.out.println("Vector               | Populate " + num / 1000000 + " Mln elements takes " + duration + " ms");

        startTime = System.nanoTime();
        vc.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Vector               | (" + num / 1000000 + " Mln elements): add element " + elemIntMiddle + " takes " + duration + " mks");

        startTime = System.nanoTime();
        vc.add(elemIntBegin, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Vector               | (" + num / 1000000 + " Mln elements): add element into pos " + elemIntBegin + "  takes " + duration + " mks");

        startTime = System.nanoTime();
        vc.add(elemIntMiddle, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Vector               | (" + num / 1000000 + " Mln elements): add element into pos " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        vc.add(elemIntEnd, elemIntEnd);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Vector               | (" + num / 1000000 + " Mln elements): add element into pos " + elemIntEnd / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        vc.get(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Vector               | (" + num / 1000000 + " Mln elements): get element from pos " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        vc.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Vector               | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + " mks");

        startTime = System.nanoTime();
        vc.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Vector               | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        vc.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Vector               | (" + num / 1000000 + " Mln elements): remove element from pos " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        return vc != null;
    }

    boolean arrayList(int num, int elemIntBegin, int elemIntMiddle, int elemIntEnd, String elemStr, int ind) {

        /*=============================== ArrayList ===================================================*/

        List al = new ArrayList();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            al.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; //ms
        System.out.println("ArrayList            | Populate " + num / 1000000 + " Mln elements takes " + duration + " ms");

        startTime = System.nanoTime();
        al.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayList            | (" + num / 1000000 + " Mln elements): add element takes " + duration + " mks");

        startTime = System.nanoTime();
        al.add(ind, elemIntBegin);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; //ms
        System.out.println("ArrayList            | (" + num / 1000000 + " Mln elements): add element into pos " + elemIntBegin + " takes " + duration + " mks");

        startTime = System.nanoTime();
        al.add(elemIntMiddle, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; //ms
        System.out.println("ArrayList            | (" + num / 1000000 + " Mln elements): add element into pos " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        al.add(elemIntEnd, elemIntEnd);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; //ms
        System.out.println("ArrayList            | (" + num / 1000000 + " Mln elements): add element into pos " + elemIntEnd / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        al.get(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayList            | (" + num / 1000000 + " Mln elements): get element from pos " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        al.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayList            | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + " mks");

        startTime = System.nanoTime();
        al.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayList            | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        al.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayList            | (" + num / 1000000 + " Mln elements): remove element from pos " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        return al != null;
    }

    boolean linkedList(int num, int elemIntBegin, int elemIntMiddle, int elemIntEnd, String elemStr, int ind) {

        /*=============================== LinkedList ===================================================*/

        List ll = new LinkedList();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            ll.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; //ms
        System.out.println("LinkedList           | Populate " + num / 1000000 + " Mln elements takes " + duration + " ms");

        startTime = System.nanoTime();
        ll.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedList           | (" + num / 1000000 + " Mln elements): add element takes " + duration + " mks");

        startTime = System.nanoTime();
        ll.add(elemIntBegin, elemIntBegin);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedList           | (" + num / 1000000 + " Mln elements): add element into begin pos takes " + duration + " mks");

        startTime = System.nanoTime();
        ll.add(elemIntMiddle, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedList           | (" + num / 1000000 + " Mln elements): add element into pos " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        ll.add(elemIntEnd, elemIntEnd);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedList           | (" + num / 1000000 + " Mln elements): add element into end pos takes " + duration + " mks");

        startTime = System.nanoTime();
        ll.get(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedList           | (" + num / 1000000 + " Mln elements): get element from pos " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        ll.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedList           | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + " mks");

        startTime = System.nanoTime();
        ll.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedList           | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        ll.remove(ind);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedList           | (" + num / 1000000 + " Mln elements): remove element from pos " + ind / 1000000 + " Mln takes " + duration + " mks");

        return ll != null;
    }

    boolean hashSet(int num, int elemIntBegin, int elemIntMiddle, int elemIntEnd, String elemStr, int ind) {

        /*=============================== HashSet ===================================================*/

        Set hs = new HashSet<Integer>();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            hs.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; //ms
        System.out.println("HashSet              | Populate " + num / 1000000 + " Mln elements takes " + duration + " ms");

        startTime = System.nanoTime();
        hs.add(elemIntBegin);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashSet              | (" + num / 1000000 + " Mln elements): add element " + elemIntBegin +"  takes " + duration + " mks");

        startTime = System.nanoTime();
        hs.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashSet              | (" + num / 1000000 + " Mln elements): add element " + elemIntMiddle +"  takes " + duration + " mks");

        startTime = System.nanoTime();
        hs.add(elemIntEnd);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashSet              | (" + num / 1000000 + " Mln elements): add element " + elemIntEnd +"  takes " + duration + " mks");

        startTime = System.nanoTime();
        hs.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashSet              | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + " mks");

        startTime = System.nanoTime();
        hs.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashSet              | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        return hs != null;
    }

    boolean linkedHashSet(int num, int elemIntBegin, int elemIntMiddle, int elemIntEnd, String elemStr, int ind) {

        /*=============================== LinkedHashSet ===================================================*/

        Set lhs = new LinkedHashSet<Integer>();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            lhs.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; //ms
        System.out.println("LinkedHashSet        | Populate " + num / 1000000 + " Mln elements takes " + duration + " ms");

        startTime = System.nanoTime();
        lhs.add(elemIntBegin);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashSet        | (" + num / 1000000 + " Mln elements): add element " + elemIntBegin +"  takes " + duration + " mks");

        startTime = System.nanoTime();
        lhs.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashSet        | (" + num / 1000000 + " Mln elements): add element " + elemIntMiddle +"  takes " + duration + " mks");

        startTime = System.nanoTime();
        lhs.add(elemIntEnd);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashSet        | (" + num / 1000000 + " Mln elements): add element " + elemIntEnd +"  takes " + duration + " mks");

        startTime = System.nanoTime();
        lhs.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashSet        | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + " mks");

        startTime = System.nanoTime();
        lhs.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashSet        | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        return lhs != null;
    }

    boolean treeSet(int num, int elemIntBegin, int elemIntMiddle, int elemIntEnd, String elemStr, int ind) {

        /*=============================== TreeSet ===================================================*/

        Set ts = new TreeSet<Integer>();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            ts.add(i);
        }

        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; //ms
        System.out.println("TreeSet              | Populate " + num / 1000000 + " Mln elements takes " + duration + " ms");

        startTime = System.nanoTime();
        ts.add(elemIntBegin);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeSet              | (" + num / 1000000 + " Mln elements): add element " + elemIntBegin +"  takes " + duration + " mks");

        startTime = System.nanoTime();
        ts.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeSet              | (" + num / 1000000 + " Mln elements): add element " + elemIntMiddle +"  takes " + duration + " mks");

        startTime = System.nanoTime();
        ts.add(elemIntEnd);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeSet              | (" + num / 1000000 + " Mln elements): add element " + elemIntEnd +"  takes " + duration + " mks");

        startTime = System.nanoTime();
        ts.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeSet              | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + " mks");

        startTime = System.nanoTime();
        ts.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeSet              | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        return ts != null;
    }

    boolean stack(int num, int elemIntBegin, int elemIntMiddle, int elemIntEnd, String elemStr, int ind) {

        /*=============================== Stack ===================================================*/

        Stack st = new Stack();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            st.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; //ms
        System.out.println("Stack                | Populate " + num / 1000000 + " Mln elements takes " + duration + " ms");

        startTime = System.nanoTime();
        st.push(elemIntBegin);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Stack                | (" + num / 1000000 + " Mln elements): add element into start pos (push) takes " + duration + " mks");

        startTime = System.nanoTime();
        st.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Stack                | (" + num / 1000000 + " Mln elements): add element to the end (add) takes " + duration + " mks");

        startTime = System.nanoTime();
        st.insertElementAt(elemIntMiddle, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Stack                | (" + num / 1000000 + " Mln elements): add element into pos " + elemIntMiddle / 1000000 + " Mln (add) takes " + duration + " mks");

        startTime = System.nanoTime();
        st.elementAt(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Stack                | (" + num / 1000000 + " Mln elements): get element from pos " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        st.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Stack                | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + " mks");

        startTime = System.nanoTime();
        st.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Stack                | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        st.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Stack                | (" + num / 1000000 + " Mln elements): remove element from pos " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        st.pop();
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Stack                | (" + num / 1000000 + " Mln elements): remove element from 0 pos 0 (pop) takes " + duration + " mks");

        startTime = System.nanoTime();
        st.peek();
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Stack                | (" + num / 1000000 + " Mln elements): get element from pos (peek)  takes " + duration + " mks");

        return st != null;
    }

    boolean priorityQueue(int num, int elemBegin, int elemIntMiddle, int elemIntEnd, String elemStr, int ind) {

        /*=============================== PriorityQueue ===================================================*/

        PriorityQueue pq = new PriorityQueue();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            pq.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; //ms
        System.out.println("PriorityQueue        | Populate " + num / 1000000 + " Mln elements takes " + duration + " ms");

        startTime = System.nanoTime();
        pq.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("PriorityQueue        | (" + num / 1000000 + " Mln elements): add element takes " + duration + " mks");

        startTime = System.nanoTime();
        pq.poll();
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("PriorityQueue        | (" + num / 1000000 + " Mln elements): Poll first element (poll) takes " + duration + " mks");

        startTime = System.nanoTime();
        pq.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("PriorityQueue        | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + " mks");

        startTime = System.nanoTime();
        pq.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("PriorityQueue        | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        pq.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("PriorityQueue        | (" + num / 1000000 + " Mln elements): remove element from pos " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        pq.poll();
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("PriorityQueue        | (" + num / 1000000 + " Mln elements): retrieve  and remove the first elem (pool) takes " + duration + " mks");

        startTime = System.nanoTime();
        pq.peek();
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("PriorityQueue        | (" + num / 1000000 + " Mln elements): get first element (peek) takes " + duration + " mks");

        return pq != null;
    }

    boolean arrayDeque(int num,  int elemBegin, int elemIntMiddle, int elemIntEnd, String elemStr, int ind) {

        /*=============================== ArrayDeque ===================================================*/

        ArrayDeque ad = new ArrayDeque();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            ad.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; //ms
        System.out.println("ArrayDeque           | Populate " + num / 1000000 + " Mln elements takes " + duration + " ms");

        startTime = System.nanoTime();
        ad.add(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayDeque           | (" + num / 1000000 + " Mln elements): add element takes " + duration + " mks");

        startTime = System.nanoTime();
        ad.contains(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayDeque           | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present takes " + duration + " mks");

        startTime = System.nanoTime();
        ad.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayDeque           | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        ad.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayDeque           | (" + num / 1000000 + " Mln elements): remove element from pos " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        ad.pop();
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayDeque           | (" + num / 1000000 + " Mln elements): remove element from 0 pos 0 (pop) takes " + duration + " mks");

        startTime = System.nanoTime();
        ad.peekFirst();
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayDeque           | (" + num / 1000000 + " Mln elements): get first element (peekFirst) takes " + duration + " mks");

        startTime = System.nanoTime();
        ad.peekLast();
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayDeque           | (" + num / 1000000 + " Mln elements): get last element (peekLast) takes " + duration + " mks");

        startTime = System.nanoTime();
        ad.poll();
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("ArrayDeque           | (" + num / 1000000 + " Mln elements): Poll first element (poll) takes " + duration + " mks");

        return ad != null;
    }

    boolean hashMap(int num, int elemIntBegin, int elemIntMiddle, int elemIntEnd, String elemStr, int ind) {

        /*=============================== HashMap ===================================================*/

        Map hm = new HashMap<Integer, Integer>();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            hm.put(i, i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; //ms
        System.out.println("HashMap              | Populate " + num / 1000000 + " Mln elements takes " + duration + " ms");

        startTime = System.nanoTime();
        hm.put(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashMap              | (" + num / 1000000 + " Mln elements): put element takes " + duration + " mks");

        startTime = System.nanoTime();
        hm.get(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashMap              | (" + num / 1000000 + " Mln elements): get element with key " + elemIntMiddle / 1000000 + " Mln (get) takes " + duration + " mks");

        startTime = System.nanoTime();
        hm.containsValue(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashMap              | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present (containsValue) takes " + duration + " mks");

        startTime = System.nanoTime();
        hm.replace(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashMap              | (" + num / 1000000 + " Mln elements): replace element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        hm.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashMap              | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        hm.remove(elemIntBegin);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashMap              | (" + num / 1000000 + " Mln elements): remove element with key " + elemIntBegin / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        hm.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashMap              | (" + num / 1000000 + " Mln elements): remove element with key " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        hm.remove(elemIntEnd);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("HashMap              | (" + num / 1000000 + " Mln elements): remove element with key " + elemIntEnd / 1000000 + " Mln takes " + duration + " mks");

        return hm != null;
    }

    boolean hashtable(int num, int elemIntBegin, int elemIntMiddle, int elemIntEnd, String elemStr, int ind) {

        /*=============================== Hashtable ===================================================*/

        Map ht = new Hashtable<Integer, Integer>();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            ht.put(i, i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; //ms
        System.out.println("Hashtable            | Populate " + num / 1000000 + " Mln elements takes " + duration + " ms");

        startTime = System.nanoTime();
        ht.put(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Hashtable            | (" + num / 1000000 + " Mln elements): put element takes " + duration + " mks");

        startTime = System.nanoTime();
        ht.get(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Hashtable            | (" + num / 1000000 + " Mln elements): get element with key " + elemIntMiddle / 1000000 + " Mln (get) takes " + duration + " mks");

        startTime = System.nanoTime();
        ht.containsValue(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Hashtable            | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present (containsValue) takes " + duration + " mks");

        startTime = System.nanoTime();
        ht.replace(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Hashtable            | (" + num / 1000000 + " Mln elements): replace element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        ht.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Hashtable            | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        ht.remove(elemIntBegin);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Hashtable            | (" + num / 1000000 + " Mln elements): remove element with key " + elemIntBegin / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        ht.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Hashtable            | (" + num / 1000000 + " Mln elements): remove element with key " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        ht.remove(elemIntEnd);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("Hashtable            | (" + num / 1000000 + " Mln elements): remove element with key " + elemIntEnd / 1000000 + " Mln takes " + duration + " mks");

        return ht != null;
    }

    boolean linkedHashMap(int num,  int elemIntBegin, int elemIntMiddle, int elemIntEnd, String elemStr, int ind) {

        /*=============================== LinkedHashMap ===================================================*/

        Map lhm = new LinkedHashMap<Integer, Integer>();

        startTime = System.nanoTime();
        for (
                int i = 0;
                i < num; i++) {
            lhm.put(i, i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; //ms
        System.out.println("LinkedHashMap        | Populate " + num / 1000000 + " Mln elements takes " + duration + " ms");

        startTime = System.nanoTime();
        lhm.put(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashMap        | (" + num / 1000000 + " Mln elements): put element takes " + duration + " mks");

        startTime = System.nanoTime();
        lhm.get(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashMap        | (" + num / 1000000 + " Mln elements): get element with key " + elemIntMiddle / 1000000 + " Mln (get) takes " + duration + " mks");

        startTime = System.nanoTime();
        lhm.containsValue(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashMap        | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present (containsValue) takes " + duration + " mks");

        startTime = System.nanoTime();
        lhm.replace(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashMap        | (" + num / 1000000 + " Mln elements): replace element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        lhm.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashMap        | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        lhm.remove(elemIntBegin);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashMap        | (" + num / 1000000 + " Mln elements): remove element with key " + elemIntBegin / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        lhm.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashMap        | (" + num / 1000000 + " Mln elements): remove element with key " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        lhm.remove(elemIntEnd);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("LinkedHashMap        | (" + num / 1000000 + " Mln elements): remove element with key " + elemIntEnd / 1000000 + " Mln takes " + duration + " mks");

        return lhm != null;
    }

    boolean treeMap(int num,  int elemIntBegin, int elemIntMiddle, int elemIntEnd, String elemStr, int ind) {

        /*=============================== TreeMap ===================================================*/

        Map tm = new TreeMap<Integer, Integer>();

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            tm.put(i, i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; //ms
        System.out.println("TreeMap              | Populate " + num / 1000000 + " Mln elements takes " + duration + " ms");

        startTime = System.nanoTime();
        tm.put(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeMap              | (" + num / 1000000 + " Mln elements): put element takes " + duration + " mks");

        startTime = System.nanoTime();
        tm.get(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeMap              | (" + num / 1000000 + " Mln elements): get element with key " + elemIntMiddle / 1000000 + " Mln (get) takes " + duration + " mks");

        startTime = System.nanoTime();
        tm.containsValue(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeMap              | (" + num / 1000000 + " Mln elements): if element with value " + elemIntMiddle / 1000000 + " Mln present (containsValue) takes " + duration + " mks");

        startTime = System.nanoTime();
        tm.replace(ind, elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeMap              | (" + num / 1000000 + " Mln elements): replace element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        tm.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeMap              | (" + num / 1000000 + " Mln elements): remove element with value " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        tm.remove(elemIntBegin);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeMap              | (" + num / 1000000 + " Mln elements): remove element with key " + elemIntBegin / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        tm.remove(elemIntMiddle);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeMap              | (" + num / 1000000 + " Mln elements): remove element with key " + elemIntMiddle / 1000000 + " Mln takes " + duration + " mks");

        startTime = System.nanoTime();
        tm.remove(elemIntEnd);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000; //mks
        System.out.println("TreeMap              | (" + num / 1000000 + " Mln elements): remove element with key " + elemIntEnd / 1000000 + " Mln takes " + duration + " mks");

        return tm != null;
    }

}