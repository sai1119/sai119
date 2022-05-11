/*
You are given two strings, string A and string B. Your task is to determine whether string A can be transformed into string B by performing only one of the following operations at most one (or maybe zero) time.
1. You can delete a character from any position.
2. You can replace a character with any other character.
3. You can insert a character at any position. 
Note :
1. The strings are non-empty.
2. The strings only contain lowercase English letters.
Input Format :
The first line of the input contains an integer T denoting the number of test cases.
The first line of each test case contains a string A. 
The second line of each test case contains a string B.
Output Format :
For each test case print in a new line, “True” if string A can be transformed into string B or “False” if this can’t be done.
Note :
You do not need to print anything, it has already been taken care of. Just implement the given function.
Constraints :
1 <= T <= 100
1 <= |A| <= 10^4
1 <= |B| <= 10^4
Where where |A| represents the size of the string A and where |B| represents the size of the string B.
Time Limit: 1sec

Sample Input 1 :
1
abcde
abcd
Sample Output 1 :
True
Explanation For Sample Input 1 :
For the strings “abcde” and “abcd”, we can observe that string B has one less character than the string A and all the characters of the strings are matching up to this length and in fact string A has one extra character. This means that we can simply delete this extra character and can get a string equal to the string B as the resultant string. Since we only used one of the operations only once, we can return “true”.

Sample Input 2 :
1
stbr
start
Sample Output 2 :
False
Explanation For Sample Input 2 :
For the strings “stbr” and “start”, we can observe that we require at least two operations to convert string A into string B. In one operation, we can replace ‘b’ with ‘a’ and we get “star” as the resultant string. This resultant string is not equal to the string B, “start”. We still need one more operation to convert it into string B. We can achieve this by adding ‘t’ to the resultant string so it will become “start”  But this would take two operations. So we print “false”. 
*/

public class Solution {
    public static boolean isOneAway(String a, String b) {
        // Write your code here.
		if (a.length()==b.length())
			return replace(a, b);
		else if (a.length()+1==b.length())
			return insert(a, b);
		else if (a.length()==b.length()+1)
			return insert(b, a);
		return false;
    }

	public static boolean replace(String a, String b)
	{
		boolean diff=false;
		for(int i=0;i<a.length();i++)
		{
			if ((a.charAt(i))!=(b.charAt(i)))
			{
				if (diff)
					return false;
				diff=true;
			}
		}
		return true;
	}

	public static boolean insert(String a, String b)
	{
		int i1=0;
		int i2=0;
		while((i2<b.length()) && (i1<a.length()))
		{
			if (a.charAt(i1) != b.charAt(i2))
			{
				if (i1!=i2)
					return false;
				i2++;
			}
			else
			{
				i1++;
				i2++;
			}
		}
		return true;
	}
}
