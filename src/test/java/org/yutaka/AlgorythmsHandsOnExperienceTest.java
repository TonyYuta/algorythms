package org.yutaka;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlgorythmsHandsOnExperienceTest {

    AlgorythmsHandsOnExperience ahe = new AlgorythmsHandsOnExperience();

    int number01 = 1;
    long expected01 = 1;

    int number02 = 1;
    long expected02 = 1;

    int number03 = 2;
    long expected03 = 1;

    int number04 = 3;
    long expected04 = 2;

    int number05 = 10;
    long expected05 = 55;

    int number06 = 46;
    long expected06 = 1836311903; // max possible int output

    int number07 = 47;
    long expected07 = 2971215073L; // should be at least long

    int[] primeArray = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
            103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};

    int[] notPrimeArray = {
            4, 6, 8, 10, 14, 16, 20, 24, 28, 32, 36, 40, 42, 46, 52, 58, 60, 66, 70, 72, 78, 82, 88, 96, 100, 200};

    String[] originForRev = {"a bc", ".", "333", "%20s", "", "AAA bbb"};
    String[] reverseExpected = {"cb a", ".", "333", "s02%", "", "bbb AAA"};

    long[] originLongNumbers    = {123456789012345678L, 223456789012345678L, 323456789012345678L};
    long[] reversedLongNumbers  = {876543210987654321L, 876543210987654322L, 876543210987654323L};

    int[] originIntNumbers    = {123456789, 223456789, 323456789};
    int[] reversedIntNumbers  = {987654321, 987654322, 987654323};
    int[] reversedIntArray = {323456789, 223456789, 123456789};

    @Test(
            enabled = true,
            description = "fibonacci1",
            groups = {"fibonacci"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void test01fibonacci1() {
        Assert.assertEquals(ahe.fibonacci1(number01), expected01, "mismatch in fibonacci1 result 01");
        Assert.assertEquals(ahe.fibonacci1(number02), expected02, "mismatch in fibonacci1 result 02");
        Assert.assertEquals(ahe.fibonacci1(number03), expected03, "mismatch in fibonacci1 result 03");
        Assert.assertEquals(ahe.fibonacci1(number04), expected04, "mismatch in fibonacci1 result 04");
        Assert.assertEquals(ahe.fibonacci1(number05), expected05, "mismatch in fibonacci1 result 05");
       // Assert.assertEquals(ahe.fibonacci1(number06), expected06, "mismatch in fibonacci1 result 06");
       // Assert.assertEquals(ahe.fibonacci1(number07), expected07, "mismatch in fibonacci1 result 07");
    }

    @Test(
            enabled = true,
            description = "fibonacci2",
            groups = {"fibonacci"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void test01fibonacci2() {
        Assert.assertEquals(ahe.fibonacci2(number01), expected01, "mismatch in fibonacci2 result 01");
        Assert.assertEquals(ahe.fibonacci2(number02), expected02, "mismatch in fibonacci2 result 02");
        Assert.assertEquals(ahe.fibonacci2(number03), expected03, "mismatch in fibonacci2 result 03");
        Assert.assertEquals(ahe.fibonacci2(number04), expected04, "mismatch in fibonacci2 result 04");
        Assert.assertEquals(ahe.fibonacci2(number05), expected05, "mismatch in fibonacci2 result 05");
       // Assert.assertEquals(ahe.fibonacci2(number06), expected06, "mismatch in fibonacci2 result 06");
       // Assert.assertEquals(ahe.fibonacci2(number07), expected07, "mismatch in fibonacci2 result 07");
    }

    @Test(
            enabled = true,
            description = "prime number 1",
            groups = {"prime"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void test01IsPrimeNumber1() {
        Assert.assertTrue(ahe.isPrimeNumber1(2));
        for(int i : primeArray) {
            Assert.assertTrue(ahe.isPrimeNumber1(i));
        }
    }

    @Test(
            enabled = true,
            description = "prime number 1",
            groups = {"prime"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void test02IsPrimeNumber1() {
        Assert.assertFalse(ahe.isPrimeNumber1(4));
        for(int i : notPrimeArray) {
            Assert.assertFalse(ahe.isPrimeNumber1(i));
        }
    }

    @Test(
            enabled = true,
            description = "prime number 2",
            groups = {"prime"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void test01IsPrimeNumber2() {
        Assert.assertTrue(ahe.isPrimeNumber2(2));
        for(int i : primeArray) {
            Assert.assertTrue(ahe.isPrimeNumber2(i));
        }
    }

    @Test(
            enabled = true,
            description = "prime number 2",
            groups = {"prime"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void test02IsPrimeNumber2() {
        int[] notPrimeArray = {
                4, 6, 8, 10, 14, 16, 20, 24, 28, 32, 36, 40, 42, 46, 52, 58, 60, 66, 70, 72, 78, 82, 88, 96, 100, 200};
        Assert.assertFalse(ahe.isPrimeNumber2(4));
        for(int i : notPrimeArray) {
            Assert.assertFalse(ahe.isPrimeNumber2(i));
        }
    }


    @Test(
            enabled = true,
            description = "prime number 3",
            groups = {"prime"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void test01IsPrimeNumber3() {
        Assert.assertTrue(ahe.isPrimeNumber3(2));
        for(int i : primeArray) {
            Assert.assertTrue(ahe.isPrimeNumber3(i));
        }
    }

    @Test(
            enabled = true,
            description = "prime number 3",
            groups = {"prime"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void test02IsPrimeNumber3() {
        Assert.assertFalse(ahe.isPrimeNumber3(4));
        for(int i : notPrimeArray) {
            Assert.assertFalse(ahe.isPrimeNumber3(i));
        }
    }

    @Test(
            enabled = true,
            description = "reverse string 01",
            groups = {"reverse"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void test01ReverseString01() {
        for(int i = 0; i <  originForRev.length; i++) {
            Assert.assertEquals(ahe.reverseString01(originForRev[i]), reverseExpected[i], "mismatch in reverse String " + i);
        }
    }

    @Test(
            enabled = true,
            description = "reverse string 02",
            groups = {"reverse"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void test01ReverseString02() {
        for(int i = 0; i <  originForRev.length; i++) {
            Assert.assertEquals(ahe.reverseString02(originForRev[i]), reverseExpected[i], "mismatch in reverse String " + i);
        }
    }


    @Test(
            enabled = true,
            description = "reverse string 03",
            groups = {"reverse"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void test01ReverseString03() {
        for(int i = 0; i <  originForRev.length; i++) {
            Assert.assertEquals(ahe.reverseString03(originForRev[i]), reverseExpected[i], "mismatch in reverse String " + i);
        }
    }

    @Test(
            enabled = true,
            description = "reverse string 04",
            groups = {"reverse"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void test01ReverseString04() {
        for(int i = 0; i <  originForRev.length; i++) {
            Assert.assertEquals(ahe.reverseString04(originForRev[i]), reverseExpected[i], "mismatch in reverse String " + i);
        }
    }


    @Test(
            enabled = true,
            description = "reverse string 05",
            groups = {"reverse"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void test01ReverseString05() {
        for(int i = 0; i <  originForRev.length; i++) {
            Assert.assertEquals(ahe.reverseString05(originForRev[i]), reverseExpected[i], "mismatch in reverse String " + i);
        }
    }


    @Test(
            enabled = true,
            description = "reverse string 06",
            groups = {"reverse"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void test01ReverseString06() {
        for(int i = 0; i <  originForRev.length; i++) {
            Assert.assertEquals(ahe.reverseString06(originForRev[i]), reverseExpected[i], "mismatch in reverse String " + i);
        }
    }

    @Test(
            enabled = true,
            description = "reverse words in a string",
            groups = {"reverse"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void testReverseWords() {
        String origin = "the sky is blue";
        String expected = "blue is sky the";
            Assert.assertEquals(ahe.reverseWords(origin), expected, "mismatch in reverse words in a String");
    }


    @Test(
            enabled = true,
            description = "reverse a long number",
            groups = {"reverse"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void testReverseLongNumber() {
        for(int i = 0; i <  originLongNumbers.length; i++)
            Assert.assertEquals(ahe.reverseLongNumber(originLongNumbers[i]), reversedLongNumbers[i], "mismatch in reverse long number");
    }

    @Test(
            enabled = true,
            description = "reverse a int number",
            groups = {"reverse"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void testReverseIntNumber() {
        for(int i = 0; i <  originIntNumbers.length; i++)
            Assert.assertEquals(ahe.reverseInt(originIntNumbers[i]), reversedIntNumbers[i], "mismatch in reverse int number");
    }


    @Test(
            enabled = true,
            description = "reverse a int array",
            groups = {"reverse"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void testReverseArray1() {
        for(int i = 0; i <  originIntNumbers.length; i++)
            Assert.assertEquals(ahe.reverseArray1(originIntNumbers), reversedIntArray, "mismatch in reverse int number");
    }

}
