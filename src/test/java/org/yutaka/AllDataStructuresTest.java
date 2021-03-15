package org.yutaka;

import org.testng.annotations.Test;
import org.testng.Assert;


public class AllDataStructuresTest {

    // create an instance of AllDataStructures
    AllDataStructures allDataStructures = new AllDataStructures();
//    public int num = 1000; // 1 K
//    public int num = 1000000; // 1 mln
//    public int num = 2000000; // 2 mln
//    public int num = 5000000; // 5 mln
    public int num = 10000000; // 10 mln
//    public int num = 15000000; // 15 mln
//    public int num = 20000000; // 20 mln
//    public int num = 25000000; // 25 mln
//    public int num = 30000000; // 30 mln
//    public int num = 50000000; // 50 mln
    public String elemStr = "Element";
    public int indMiddle = num/2;
    public int elemIntBegin = 0;
    public int elemIntMiddle = num/2;
    public int elemIntEnd = num;

    @Test(
            enabled = false,
            description = "Different data structures operations",
            groups = {"Collections", "Map", "Array"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void testArrayCollectionsMap() {
        Assert.assertTrue(allDataStructures.arrayCollectionsMap(num, elemIntBegin, elemIntMiddle, elemIntEnd, elemStr, indMiddle),  "mismatch in ArrayList size");
    }

//===================================================================================

    @Test(
            enabled = true,
            description = "Different Array operations",
            groups = {"Array"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void testArray() {
        Assert.assertTrue(allDataStructures.array(num, elemIntBegin, elemIntMiddle, elemIntEnd, elemStr, indMiddle),  "mismatch in Array size");
    }

    @Test(
            enabled = true,
            description = "Different Vector operations",
            groups = {"Collections", "List", "Vector"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 1
    )
    public void testVector() {
        Assert.assertTrue(allDataStructures.vector(num, elemIntBegin, elemIntMiddle, elemIntEnd, elemStr, indMiddle),  "mismatch in Vector size");
    }

    @Test(
            enabled = true,
            description = "Different ArrayList operations",
            groups = {"Collections", "List", "ArrayList"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 2
    )
    public void testArrayList() {
        Assert.assertTrue(allDataStructures.arrayList(num, elemIntBegin, elemIntMiddle, elemIntEnd, elemStr, indMiddle),  "mismatch in ArrayList size");
    }

    @Test(
            enabled = true,
            description = "Different ArrayList operations",
            groups = {"Collections", "List", "linkedList"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 3
    )
    public void testLinkedList() {
        Assert.assertTrue(allDataStructures.linkedList(num, elemIntBegin, elemIntMiddle, elemIntEnd, elemStr, indMiddle),  "mismatch in linkedList size");
    }

    @Test(
            enabled = true,
            description = "Different ArrayList operations",
            groups = {"Collections", "Set", "hashSet"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 4
    )
    public void testHashSet() {
        Assert.assertTrue(allDataStructures.hashSet(num, elemIntBegin, elemIntMiddle, elemIntEnd, elemStr, indMiddle),  "mismatch in hashSet size");
    }

    @Test(
            enabled = true,
            description = "Different ArrayList operations",
            groups = {"Collections", "List", "ArrayList"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 5
    )
    public void testLinkedHashSet() {
        Assert.assertTrue(allDataStructures.linkedHashSet(num, elemIntBegin, elemIntMiddle, elemIntEnd, elemStr, indMiddle),  "mismatch in ArrayList size");
    }

    @Test(
            enabled = true,
            description = "Different ArrayList operations",
            groups = {"Collections", "Set", "TreeSet"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 6
    )
    public void testTreeSet() {
        Assert.assertTrue(allDataStructures.treeSet(num, elemIntBegin, elemIntMiddle, elemIntEnd, elemStr, indMiddle),  "mismatch in TreeSet size");
    }

    @Test(
            enabled = true,
            description = "Different stack operations",
            groups = {"Collections", "Queue", "stack"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 7
    )
    public void testStack() {
        Assert.assertTrue(allDataStructures.stack(num, elemIntBegin, elemIntMiddle, elemIntEnd, elemStr, indMiddle),  "mismatch in stack size");
    }

    @Test(
            enabled = true,
            description = "Different priorityQueue operations",
            groups = {"Collections", "Queue", "priorityQueue"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 8
    )
    public void testPriorityQueue() {
        Assert.assertTrue(allDataStructures.priorityQueue(num, elemIntBegin, elemIntMiddle, elemIntEnd, elemStr, indMiddle),  "mismatch in priorityQueue size");
    }

    @Test(
            enabled = true,
            description = "Different arrayDeque operations",
            groups = {"Collections", "Queue", "arrayDeque"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 9
    )
    public void testArrayDeque() {
        Assert.assertTrue(allDataStructures.arrayDeque(num, elemIntBegin, elemIntMiddle, elemIntEnd, elemStr, indMiddle),  "mismatch in arrayDeque size");
    }

    @Test(
            enabled = true,
            description = "Different hashMap operations",
            groups = {"Map", "hashMap"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 10
    )
    public void testHashMap() {
        Assert.assertTrue(allDataStructures.hashMap(num, elemIntBegin, elemIntMiddle, elemIntEnd, elemStr, indMiddle),  "mismatch in hashMap size");
    }

    @Test(
            enabled = true,
            description = "Different hashtable operations",
            groups = {"Map", "hashtable"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 11
    )
    public void testHashtable() {
        Assert.assertTrue(allDataStructures.hashtable(num, elemIntBegin, elemIntMiddle, elemIntEnd, elemStr, indMiddle),  "mismatch in hashtable size");
    }

    @Test(
            enabled = true,
            description = "Different linkedHashMap operations",
            groups = {"Map", "linkedHashMap"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 12
    )
    public void testLinkedHashMap() {
        Assert.assertTrue(allDataStructures.linkedHashMap(num, elemIntBegin, elemIntMiddle, elemIntEnd, elemStr, indMiddle),  "mismatch in linkedHashMap size");
    }

    @Test(
            enabled = true,
            description = "Different TreeMap operations",
            groups = {"Map", "TreeMap"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 13
    )
    public void testTreeMap() {
        Assert.assertTrue(allDataStructures.treeMap(num, elemIntBegin, elemIntMiddle, elemIntEnd, elemStr, indMiddle),  "mismatch in TreeMap size");
    }

}
