package org.yutaka;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import static java.lang.Math.*;

public class AlgorythmsHandsOnExperience {

    // helper - measure executing time
    // long startTime = System.currentTimeMillis(); // for count execution time
    // long endTime = System.currentTimeMillis(); // for count execution time
    // System.out.println(endTime-startTime + "ms");

    /**
     * Java program to calculate and print Fibonacci number using both recursion
     * and Iteration.
     * Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
     * first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
     * <p>
     * This Java program for Fibonacci number using recursion.
     * This program uses tail recursion to calculate Fibonacci number for a given number
     * <p>
     * input int. output long (for int > 48 unsigned or 92 signed)
     *
     * @return Fibonacci number
     * test: testFibonacci1
     */
    long fibonacci1(int n){
        if(n == 1 || n == 2)
            return 1;
        return fibonacci1(n-1) + fibonacci1(n-2); //tail recursion
    }


    /**
     * Java program to calculate Fibonacci number using loop or Iteration.
     * @return Fibonacci number
     * test: testFibonacci2
     */
    long fibonacci2(int n){

        if(n == 1 || n == 2){
            return 1;
        }

        long fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= n; i++){
            //Fibonacci number is sum of previous two Fibonacci numbers
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }

        return fibonacci; //Fibonacci number
    }


    /**
     * Java method to check if an integer number is prime or not.
     * examples -- list of Prime Numbers:
     * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
     * 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, etc.
     * @return true if number is prime, else false
     * test: testIsPrimeNumber1
     */
    boolean isPrimeNumber1(int num) {
        int sqrt = (int) sqrt(num) + 1;
        for (int i = 2; i < sqrt; i++)
            if (num % i == 0)
                // number is perfectly divisible - no prime
                return false;
        return true;
    }


    /**
     * Second version of isPrimeNumber method, with improvement like not
     * checking for division by even number, if its not divisible by 2.
     * @param num
     * @return true if number is prime, else false
     * test: testIsPrimeNumber2
     */
    boolean isPrimeNumber2(int num) {
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        int sqrt = (int) sqrt(num) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    /**
     * Third way to check if a number is prime or not.
     * @param num
     * @return true if number is prime, else false
     * test: testIsPrimeNumber3
     */
    boolean isPrimeNumber3(int num) {
        if (num < 0)
            return false; //not valid
        if (num == 0 || num == 1)
            return false;
        if (num == 2 || num == 3)
            return true;
        if ((num * num - 1) % 24 == 0)
            return true;
        else
            return false;
    }


    /**
     * reverse String Iteratively immutable
     * @param original
     * @return
     * test: testReverseString01
     */
    String reverseString01(String original) {
        String reverse = "";
        for (int i = original.length() - 1 ; i >= 0; i --)
            reverse += original.charAt(i);
        return reverse;
    }


    /**
     * reverse String Iteratively using StringBuilder (Mutable, fast)
     * @param original
     * @return
     * test: testReverseString02
     */
    String reverseString02(String original) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] strChars = original.toCharArray();
        for(int i = strChars.length-1; i >= 0; i--)
            stringBuilder.append(strChars[i]);
        return stringBuilder.toString();
    }


    /**
     * reverse String Iteratively using StringBuffer (mutable, thread safe - sync)
     * @param original
     * @return
     * test: testReverseString03
     */
    String reverseString03(String original) {
        StringBuffer sb = new StringBuffer();
        char[] strChars = original.toCharArray();
        for(int i = strChars.length-1; i>=0; i--)
            sb.append(strChars[i]);
        return sb.toString();
    }


    /**
     * reverse String Iteratively Embedded using StringBuilder (mutable, fast)
     * @param original
     * @return
     * test: testReverseString04
     */
    String reverseString04(String original) {
        StringBuilder stringBuilder = new StringBuilder(original);
        return stringBuilder.reverse().toString();
    }


    /**
     * reverse String Iteratively Embedded using StringBuffer (mutable, thread safe - sync)
     * @param original
     * @return
     * test: testReverseString05
     */
    String reverseString05(String original) {
        StringBuffer stringBuffer = new StringBuffer(original);
        return stringBuffer.reverse().toString();
    }


    /**
     * reverse String Recursively
     * @param s
     * @return
     * test: testReverseString06
     */
    String reverseString06(String s) {
        if (s == null || s.length() <=1)
            return s;
        String reverse = reverseString06(s.substring(1)) + s.charAt(0);
        return reverse;
    }


    /**
     * Reverse Words in a String "the sky is blue" -> "blue is sky the"
     * @param s
     * @return
     * test: testReverseWords
     */
    String reverseWords(String s) {
        if (s == null || s.length() == 0)
            return "";
        String[] a = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = a.length-1; i >= 0; --i)
            if(!a[i].equals(""))
                sb.append(a[i]).append(" ");
        return sb.length() == 0 ? "" : sb.substring(0, sb.length()-1);
    }


    /**
     * reverse a long number using StringBuffer
     * @param num
     * @return
     * test: testReverseLongNumber
     */
    long reverseLongNumber(long num){
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        return Long.parseLong(sb.reverse().toString());
    }


    /**
     * reverse an int number using StringBuilder
     * @param num
     * @return
     * test: testReverseInt
     */
    int reverseInt(int num){
        StringBuilder sb = new StringBuilder(String.valueOf(num)).reverse();
        return Integer.parseInt(sb.toString());
    }


    /**
     * reverse an int array iteratively
     * @param a
     * @return
     * test: testReverseArray1
     */
    int[] reverseArray1(int[] a) {
        int[] b = new int[a.length];
        for(int i = a.length-1, j = 0; i >= 0; i--, j++)
            b[j] = a[i];
        return b;
    }


    /**
     * reverse an Array using Object & Collections
     * @param arr
     * @return
     * test: testReverseArray2
     */
    Object[] reverseArray2(Object[] arr) {
        List<Object> list = Arrays.asList(arr);
        Collections.reverse(list);
        return list.toArray();
    }


    /**
     * is a String a palindrome using embedded reverse + StringBuffer
     * @param s
     * @return
     * test: testIsStringPalindrome1
     */
    boolean isStringPalindrome1(String s) {
        // Amore Roma
        StringBuffer sbuf = new StringBuffer(s.toLowerCase()).reverse();
        return Objects.equals(sbuf.toString().replaceAll("\\s+",""),
                s.toLowerCase().replaceAll("\\s+",""));
    }


    /**
     * is an int number a palindrome. Doesn't matter negative or not
     * @param n
     * @return
     * test: testIsIntPalindrome1
     */
    boolean isIntPalindrome1(int n) {
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        if(sb.charAt(0) == '-')
            sb.deleteCharAt(0);
        String origin = sb.toString();
        sb.reverse();
        return Objects.equals(sb.toString(), origin);
    }


    /**
     * kth largest element in an unsorted array
     * @param a
     * @param k
     * @return
     * test: testFindKthLargest
     */
    int findKthLargest(int[] a, int k) {
        Arrays.sort(a);
        return a[a.length-k];
    }


    /**
     * factorial
     * 4! = 4 × 3 × 2 × 1 = 24
     * 7! = 7 × 6 × 5 × 4 × 3 × 2 × 1 = 5040
     * 1! = 1
     *
     * factorial of an int number recursively
     * @param number
     * @return
     * test: testfactorial1
     */
    long factorial1(int number) {
        if (number == 0)
            return 1;
        return number * factorial1(number - 1);
    }


    /**
     * Bubble Sort int array
     * @param a
     * @return
     * test: testBubbleSort
     */
    int[] bubbleSort(int[] a) {
        int i, temp;
        boolean swap = true;
        while(swap) {
            swap = false;
            for(i = 0; i < a.length-1; i++) {
                if(a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    swap = true;
                }
            }
        }
        return a;
    }


    /**
     * Counting Sort int array
     * @param a
     * @return
     * test: testCountingSort
     */
    int[] countingSort(int[] a) {
        //long startTime = System.currentTimeMillis();

        if (a.length == 0)
            return a;

        // find min & max values
        int min = a[0], max = a[0];
        for(int i = 1; i < a.length; i++) {
            if(a[i] < min)
                min = a[i];
            if(a[i] > max)
                max = a[i];
        }
        int range = max - min + 1;
        int[] count = new int[range];

        // initialize the occurrence of each element in the count array
        for(int i = 0; i < a.length; i++)
            count[a[i] - min]++;

        // calculate sum of indexes
        for(int i = 1; i < range; i++)
            count[i] += count[i - 1];

        // modify original array according to the sum count
        int j = 0;
        for(int i = 0; i < range; i++)
            while(j < count[i])
                a[j++] = i + min;

        //long stopTime = System.currentTimeMillis();
        //long elapsedTime = stopTime - startTime;
        //System.out.println("Counting Sort elapsedTime: " + elapsedTime + " ms");
        return a;
    }


    /**
     * Radix Sort int array -- positive only
     * @param a
     * @return
     * test: testRadixSortSort
     */
    int[] radixSort(int[] a) {
        int i, m = a[0], exp = 1, n = a.length;
        int[] b = new int[10];
        for (i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];
        while (m / exp > 0) {
            int[] bucket = new int[10];

            for (i = 0; i < n; i++)
                bucket[(a[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 10]] = a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;
        }
        return a;
    }


    /**
     * remove duplicate elements from an arraylist without using collections (without using set)
     * @param al
     * @return
     * test: testRemoveDupWithoutCollections
     */
    ArrayList<Object> removeDupWithoutCollections(ArrayList<Object> al) {
        for(int i = 0; i < al.size(); i++) {
            for(int j = i + 1; j < al.size(); j++) {
                if(al.get(i).equals(al.get(j))) {
                    al.remove(j);
                    j--;
                }
            }
        }
        return al;
    }


    /**
     * removes all whitespaces and non-visible characters (e.g., tab, \n)
     * @param s
     * @return
     * test: testRemovingWhitespaceFromString
     */
    String removingWhitespaceFromString(String s) {
        return s.replaceAll("\\s+","");
    }


    /**
     * search first repeated word In String using HashMap wo Set
     * @param s
     * @return
     * test: testFirstRepeatedWordInString
     */
    String firstRepeatedWordInString(String s) {
        String noDupl = "no repeated words";
        if(s==null || s.length()<3)
            return noDupl;
        Map<String, Integer> wordsMap = new HashMap<>();
        String[] words = s.toLowerCase().replaceAll("[!?(),.:;]", "").split(" ");
        for(String word : words)
            if(wordsMap.containsKey(word))
                return word;
            else
                wordsMap.put(word, 1);
        return noDupl;
    }


    /**
     * count repeated words In String using TreeMap. return TreeMap
     * @param s
     * @return TreeMap with repeated words
     * test: testRepeatedWords
     */
    TreeMap repeatedWords(String s) {
        TreeMap<String, Integer> wordsMap = new TreeMap<>();
        String[] allWords = s.toLowerCase().replaceAll("[?!:;,.]", "").split(" ");
        for (String word : allWords)
            if (wordsMap.containsKey(word))
                wordsMap.put(word,  wordsMap.get(word) + 1);
            else
                wordsMap.put(word, 1);
        TreeMap<String, Integer> dubbedWordsMap = new TreeMap<>();
        for (String d : allWords)
            if (wordsMap.containsKey(d) && wordsMap.get(d) > 1)
                dubbedWordsMap.put(d, wordsMap.get(d));
        return dubbedWordsMap;
    }


    /**
     * n most frequenly appears (repeated) words In String[] array. return HashMap
     * @param allWords
     * @return HashMap - word: n times appears
     * test: testMostFrequentWords
     */
    Map mostFrequentWords(String[] allWords, int n){
        Map<String, Integer> duplWordsMap = new LinkedHashMap<>();
        for(String word : allWords)
            duplWordsMap.put(word, duplWordsMap.containsKey(word)?duplWordsMap.get(word)+1:1);
        for(String word : allWords)
            if(duplWordsMap.get(word)==1)
                duplWordsMap.remove(word);
        Map<String, Integer> nMostFreqWordsMap = new LinkedHashMap<>();
        List<Integer> nMostFreqValuesAL = new ArrayList<>();
        for(String word : duplWordsMap.keySet())
            nMostFreqValuesAL.add(duplWordsMap.get(word));
        Collections.sort(nMostFreqValuesAL);
        Collections.reverse(nMostFreqValuesAL);
        for(int i=0; i<n; i++)
            for(String word : duplWordsMap.keySet())
                if(duplWordsMap.get(word)==nMostFreqValuesAL.get(i)){
                    nMostFreqWordsMap.put(word, nMostFreqValuesAL.get(i));
                    if(nMostFreqWordsMap.size()==n)
                        break;
                }
        System.out.println(Arrays.asList(nMostFreqWordsMap));
        return nMostFreqWordsMap;
    }

    /**
     * Count Repeated Words using HashSet
     * @param s
     * @return String with repeated words and number
     * test: testDuplWords
     */
    String duplWords(String s) {
        List<String> allWordsList = Arrays.asList(s.toLowerCase().replaceAll("[,.:;!?]", "").split(" "));
        Set<String> wordsNoDup = new HashSet<>(allWordsList);
        StringBuilder result = new StringBuilder();
        for(String word : wordsNoDup)
            if (Collections.frequency(allWordsList, word) > 1)
                result.append(word + " : " + Collections.frequency(allWordsList, word) + "\n");
        return result.toString();
    }


    /**
     * Repeated Words from String using Map
     * @param s
     * @return
     * test: testRepeatedWords02
     */
    Map repeatedWords02(String s){
        String[] words = s.toLowerCase().replaceAll("[!?.,:;]","").split(" ");
        Map<String, Integer> repeatedWords = new TreeMap<>();
        for(String word : words)
            repeatedWords.put(word,repeatedWords.containsKey(word)?repeatedWords.get(word)+1:1);
        for(String word : words)
            if(repeatedWords.get(word)==1)
                repeatedWords.remove(word);
        //System.out.println(Arrays.asList(repeatedWords));
        return repeatedWords;
    }


    /**
     * Repeated Words from String using ConcurrentHashMap
     * @param s
     * @return
     * test: testRepeatedWords03
     */
    Map<String, Integer> repeatedWords03(String s){
        String[] words = s.toLowerCase().replaceAll("[!?,.:;]", "").split(" ");
        Map<String, Integer> dupl = new ConcurrentHashMap<>();
        for(String word : words)
            dupl.put(word, dupl.containsKey(word)?dupl.get(word)+1:1);
        for(String word : dupl.keySet())
            if (dupl.get(word) == 1)
                dupl.remove(word);
        return dupl;
    }

    /**
     * Repeated Words from String using ConcurrentHashMap, sorted by value
     * @param s
     * @return
     * test: testRepeatedWords04
     */
    Map<String, Integer> repeatedWords04(String s){
        String[] words = s.toLowerCase().replaceAll("[!?,.:;]", "").split(" ");
        Map<String, Integer> dupl = new ConcurrentHashMap<>();
        for(String word : words)
            dupl.put(word, dupl.containsKey(word)?dupl.get(word)+1:1);
        for(String word : dupl.keySet())
            if (dupl.get(word) == 1)
                dupl.remove(word);

        final Map<String, Integer> sortedByValueDesc = dupl.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        return sortedByValueDesc;
    }

    /**
     * Using LinkedHashMap to find first non repeated character of String
     * @param s
     * @return
     * test: testGetFirstNonRepeatedChar
     */
    char getFirstNonRepeatedChar(String s) {
        Map<Character,Integer> counts = new LinkedHashMap<>();
        for (char c : s.toCharArray())
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        for (Map.Entry<Character,Integer> entry : counts.entrySet())
            if (entry.getValue() == 1)
                return entry.getKey();
        throw new RuntimeException("didn't find any non repeated Character");
    }


    /**
     * remove html tags from a string (use regex)
     * @param s
     * @return
     * test: testRemoveHtmlTags
     */
    String removeHtmlTags(String s) {
        return s.replaceAll("\\<.*?\\>", "");
    }


    /**
     * replace chars in a String
     * @param s
     * @param c1
     * @param c2
     * @return
     * test: testReplaceChars
     */
    String replaceChars(String s, char c1, char c2) {
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++)
            if(chars[i] == c1)
                chars[i] = c2;
        return String.valueOf(chars);
    }


    /**
     * the longest substring without repeating characters. Ex "abcabcbb" is 3 ("abc")
     * @param s
     * @return
     * test: testLengthOfLongestSubstring
     */
    int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int result = 0;
        int k = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!set.contains(c)) {
                set.add(c);
                result = max(result, set.size());
            } else {
                while(k < i) {
                    if(s.charAt(k) == c) {
                        k++;
                        break;
                    } else {
                        set.remove(s.charAt(k));
                        k++;
                    }
                }
            }
        }
        return result;
    }


    /**
     * binary search. return boolean. Required a sorted array.
     * @param a
     * @param searchNum
     * @return
     * test: testBinarySearch01
     */
    boolean binarySearchBool01(int[] a, int searchNum) {
        int start = 0;
        int end = a.length - 1;
        int mid;
        while(start <= end) {
            mid = (start + end) / 2;
            if(searchNum == a[mid])
                return true;
            if(searchNum < a[mid])
                end = mid-1;
            else
                start = mid+1;
        }
        return false;
    }

    /**
     * binary search. return index. Required a sorted array.
     * @param a \
     * @param searchNum
     * @return
     * test: testBinarySearchInt01
     */
    int binarySearchInt01(int[] a, int searchNum) {
        int start = 0;
        int end = a.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(searchNum == a[mid])
                return mid;
            if(searchNum < a[mid])
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }


    /**
     * binary Search embedded. Required a sorted array.
     * @param a
     * @param searchNum
     * @return
     * test: testBinarySearchEmbeddedInt01
     */
    boolean binarySearchEmbeddedInt01(int[] a, int searchNum) {
        Arrays.sort(a);
        return Arrays.binarySearch(a, searchNum) >= 0;
    }


    /**
     * binary Search embedded. return index. Required a sorted array.
     * @param a
     * @param searchNum
     * @return
     * test: testBinarySearchEmbeddedInt02
     */
    int binarySearchEmbeddedInt02(int[] a, int searchNum) {
        Arrays.sort(a);
        return Arrays.binarySearch(a, searchNum);
    }


    /**
     * search int number in Array.
     * convert array to ArrayList and then call its contains() method
     * @param a
     * @param searchNum
     * @return
     * test: testSearchInt02
     */
    boolean searchInt02(int[] a, int searchNum){
        List<Integer> al = Arrays.stream(a).boxed().collect(Collectors.toList()); //java 8
        return al.contains(searchNum);
    }


    /**
     * search int number in Object[] Array
     * @param a
     * @param searchNum
     * @return
     * test: testSearchInt03
     */
    boolean searchInt03(Object[] a, int searchNum){
        List<Object> list = Arrays.asList(a);
        return list.contains(searchNum);
    }


    /**
     * search String in Object[] Array
     * @param a
     * @param searchStr
     * @return
     * test: testSearchString04
     */
    boolean searchString04(Object[] a, String searchStr){
        List<Object> list = Arrays.asList(a);
        return list.contains(searchStr);
    }


    /**
     * search word in String. Using conversion to ArrayList and List method 'contains'
     * @param s
     * @param word
     * @return
     * test: testSearchWord05
     */
    boolean searchWord05(String s, String word){
        List<Object> list = Arrays.asList(s.split(" "));
        return list.contains(word);
    }

    /**
     * find largest and smallest number in unsorted array - return ArrayList
     * @param a
     * @return
     * test: testLargestAndSmallestNum01
     */
    ArrayList<Integer> largestAndSmallestNum01(int[] a){
        ArrayList<Integer> result = new ArrayList<>();
        int min=a[0], max=a[0];
        for(int i =0; i<a.length; i++) {
            if (a[i] < min)
                min = a[i];
            if (a[i] > max)
                max = a[i];
        }
        result.add(min);
        result.add(max);
        return result;
    }


    /**
     * find largest and smallest number in unsorted array - return Array
     * @param a
     * @return
     * test: testLargestAndSmallestNum02
     */
    int[] largestAndSmallestNum02(int[] a){
        int[] result = {a[0],a[0]};
        for(int num : a){
            if(num<result[0])
                result[0]=num;
            if(num>result[1])
                result[1]=num;
        }
        return result;
    }


    /**
     * Remove Duplicates from Sorted Array
     * Given a sorted array, remove the duplicates in place such that each element appear only once
     * @param a
     * @return int[] Array b
     * test: testRemoveDuplicates
     */
    int[] removeDuplicates(int[] a) {
        if (a.length < 2)
            return a;
        int j = 0;
        int i = 1;
        while (i < a.length) {
            if (a[i] == a[j]) {
                i++;
            } else {
                j++;
                a[j] = a[i];
                i++;
            }
        }
        int[] b = Arrays.copyOf(a, j + 1);
        return b;
    }


    /**
     * print out HashSet using iterator
     * @param hs
     * test: testPrintHashSet
     */
    void printHashSet(HashSet hs) {
        Iterator<String> it = hs.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }


    /**
     * print out HashMap using set keySet
     * @param hm
     * test: testPrintHashMap
     */
    void printHashMap(HashMap hm) {
        Set<String> keys = hm.keySet();
        for(String key : keys)
            System.out.println(key + " : " + hm.get(key));
    }


    /**
     * print out keySet from Map
     * @param myMap
     * test: testPrintKeySetFromMap
     */
    void printKeySetFromMap(Map<String, Integer> myMap){
        myMap.keySet().stream().forEach(System.out::println);
    }


    /**
     * print out Map in Java 8 - 2 ways
     * @param map
     * test: testPrintMap
     */
    void printMap(Map map){
        map.entrySet().stream().forEach(System.out::println); //august=2
        map.forEach((k,v)->System.out.println(k+" : "+v)); //august : 2
    }


    /**
     * print out array of generic type (objects/wrappers only, not primitives)
     * @param inputArray
     * @param <E>
     * test: testPrintArray
     */
    < E > void printArray(E[] inputArray) {
        // Display array elements
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }


    /**
     * methods to print out Array
     * @param arr
     * test: testPrintArray02
     */
    void printArray02(String[] arr) {

        // 1st: using for loop
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        // 2nd: using for each loop
        for(String elem : arr)
            System.out.println(elem);

        // 3rd: using Arrays.toString(arr)
        System.out.println(Arrays.toString(arr));

        // 4th: using  Arrays.deepToString(arr) for 2 dimensional int[][]  or one dim String[] : [a, b, c]
        System.out.println(Arrays.deepToString(arr));

        // 5th: using  Arrays.asList(arr) for String[] (not for int[]):  [a, b, c]
        System.out.println(Arrays.asList(arr));

        // 6th a: String[] - JDK 8 Stream
        String[] arrayStr = new String[]{"Java", "Node", "Python", "Ruby"};
        Arrays.stream(arrayStr).forEach(System.out::println);

        // 6th b: int[] - JDK 8 Stream
        int[] arrayInt = {1, 3, 5, 7, 9};
        Arrays.stream(arrayInt).forEach(System.out::println);

        // 7th a: String[][] - JDK 8 Stream
        String[][] deepArrayStr = new String[][]{{"mkyong1", "mkyong2"}, {"mkyong3", "mkyong4"}};
        Arrays.stream(deepArrayStr).flatMap(x -> Arrays.stream(x)).forEach(System.out::println);

        // 7th b: int[][] - JDK 8 Stream
        int[][] deepArrayInt = new int[][]{{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}};
        Arrays.stream(deepArrayInt).flatMapToInt(x -> Arrays.stream(x)).forEach(System.out::println);
    }


    /**
     * iterate ArrayList using for-loop, while-loop, advance for-loop, Java 8, and println(al)
     * test: testPrintArrayListFourMethods
     */
    void printArrayListFourMethods(ArrayList al){
        System.out.println("al.size(): " + al.size() + '\n');

        System.out.println("=== While Loop: ===");
        Iterator it = al.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        System.out.println("== For Loop: ==");
        for(int i = 0; i<al.size(); i++)
            System.out.println(al.get(i));

        System.out.println("=== Advanced For Loop: ===");
        for(Object obj : al)
            System.out.println(obj);

        System.out.println("=== Java 8: ===");
        al.forEach(System.out::println);

        System.out.println("=== println(al): ===");
        System.out.println(al);
    }

    /**
     * print out the odd numbers (2, 4, 6, 8, 10...) from 1 to max in one line
     * @param max
     * test: testPrintOddNumbers
     */
    void printOddNumbers(int max) {
        for (int i = 1; i <= max; i++)
            if (i % 2 != 0)
                System.out.print(i + " ");
    }


    /**
     * print out the odd numbers (2, 4, 6, 8, 10...) from 1 to max in one line. Var 2
     * @param max
     * test: testPrintOddNumbers2
     */
    void printOddNumbers2(int max){
        for (int i = 2; i <= max; i+=2)
            System.out.print(i + " ");
    }


    /**
     * length of last word in a string
     * @param s
     * @return
     * test: testLengthLastWord
     */
    int lengthLastWord(String s) {
        s = s.trim(); // eliminates leading and trailing spaces
        String[] words = s.split(" ");
        if(s.length() == 0)
            return 0;
        else
            return words[words.length - 1].length();
    }


    /**
     * find a number that is missing from the array. Ex, given nums = [0, 1, 3] return 2
     * @param nums
     * @return
     * test: testMissingNumber
     */
    int missingNumber(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
            sum += nums[i];
        int n = nums.length;
        return n * (n + 1) / 2 - sum;
    }


    /**
     * swap two numbers with using the third variable
     * @param x
     * @param y
     * @return
     * test: testSwapTwoIntNumbers01
     */
    String swapTwoIntNumbers01(int x, int y){
        int temp;
        temp = x;
        x = y;
        y = temp;
        return x + " " + y;
    }


    /**
     * swap two numbers without using the third variable
     * @param x
     * @param y
     * @return
     */
    String swapTwoIntNumbers02(int x, int y){
        x = x + y;
        y = x - y;
        x = x - y;
        return x + " " + y;
    }


    /**
     * count the number of words in a string using Array
     * @param s
     * @return
     * test: testNumberOfWordsUsingArray
     */
    int numberOfWordsUsingArray(String s){
        String[] allWordsArray = s.split(" ");
        return allWordsArray.length;
    }


    /**
     * iterate HashMap using While and advance for loop
     *
     * The size of the map can get using size() method. Thereafter, we have used While loop for iterating through
     * the map which contains one key-value pair for each element. Keys and Values can be retrieved through
     * getKey() and getValue().
     * @param map
     * @return
     * test: testHashMapIteration
     */
    String hashMapIteration(HashMap<Integer, String> map){
        /*String hashMapIteration(HashMap map){*/
        String result = "HashMap.size() = " + map.size() + '\n';

        Iterator it = map.entrySet().iterator();
        result += "==== while loop ====\n";
        while(it.hasNext()){
            Map.Entry me = (Map.Entry) it.next();
            result += "Key is: " + me.getKey() + "  Value is: " + me.getValue() + '\n';
        }

        result += "\n==== for loop ====\n";
        for(Map.Entry me2 : map.entrySet())
            result += "Key is: " + me2.getKey() + "  Value is: " + me2.getValue() + '\n';

        return result;
    }


    /**
     * check Armstrong number
     *
     * Armstrong number is the number
     * which is the sum of the cubes of all its unit, tens and hundred digits for three digit number.
     * 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
     * 153, 370, 371, 407 - works for 3 digits only
     * @param num
     * @return
     * test: testIsArmstrongNumber
     */
    boolean isArmstrongNumber(int num){
        int a, c=0, temp=num;
        while(num>0){
            a=num%10;
            num=num/10;
            c+=a*a*a;
        }
        return temp==c?true:false;
    }


    /**
     * find repeated numbers in an array if it contains multiple duplicates v1
     * @param a
     * @return
     * test: testRepeatedNumbers01
     */
    Map repeatedNumbers01(int[] a){
        Map<Integer, Integer> numbers = new TreeMap<>();
        for(int num : a)
            numbers.put(num, numbers.containsKey(num)?(numbers.get(num)+1):1);
        for(int num : a)
            if(numbers.get(num)==1)
                numbers.remove(num);
        return numbers;
    }


    /**
     * find repeated numbers in an array if it contains multiple duplicates v2
     * @param a
     * @return
     * test: testRepeatedNumbers02
     */
    //Map<Integer, Integer> repeatedNumbers02(int[] a){
    Map repeatedNumbers02(int[] a){
        Map<Integer, Integer> dupl = new ConcurrentHashMap<>();
        for(int num : a)
            dupl.put(num, dupl.containsKey(num)?dupl.get(num)+1:1);
        for(int num : dupl.keySet())
            if(dupl.get(num)==1)
                dupl.remove(num);
        return dupl;
    }


    /**
     * rearrange words in a string by length.
     * First letter should be capital again. New sentence should ends with a period.
     * Words in a string. -> String words in a.
     *
     * @param s
     * @return
     * test: testRearrangeWordsInString
     */
    String rearrangeWordsInString(String s){
        String[] words = s.toLowerCase().substring(0,s.length()-1).split(" ");
        Arrays.sort(words,((a,b)->Integer.compare(b.length(),a.length())));
        StringBuilder result = new StringBuilder();
        for(int i=0;i<words.length;i++){
            result.append(words[i]);
            if(i!=words.length-1)
                result.append(" ");
        }
        result.append(".");
        return result.substring(0,1).toUpperCase()+result.substring(1);
    }


    /**
     * sum all elements in 2 dimensional array
     * @param a
     * @return int sum
     * test: testSun2DimArr
     */
    int sun2DimArr(int[][] a){
        int sum=0;
        for(int i=0; i<a.length; i++)
            for(int j=0;j<a[0].length;j++)
                sum+=a[i][j];
        return sum;
    }


    /**
     * hour Glass Sum 3x3
     * @param a
     * @return int sum
     * test: testHourGlassSum
     */
    int hourGlassSum3x3(int[][] a){
        int sum=0;
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                if(i==1 && (j==0 || j==2))
                    sum+=0;
                else
                    sum+=a[i][j];
        return sum;
    }


    /**
     * hourGlassSum 3x3 from bigger array 4x4
     * @param a
     * @return
     * test: testHourGlassSum02
     */
    int hourGlassSum02(int[][] a){
        int sum1=0, sum2=0, i, j, s=1, f=3;

        for(i=s;i<=f;i++)
            for(j=s;j<=f;j++) {
                if(1==1)
                    sum1 += a[i][j];
                else
                    sum2+=a[i][j];
            }
        return sum1;
    }










}
