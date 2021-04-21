/***
Problem

Ada has bought a secret present for her friend John. In order to open the present, Ada wants John to crack a secret code. She decides to give him a hint to make things simple for him. She tells him that the secret code is a number that can be formed by taking the product of two consecutive prime numbers, such that it is the largest number that is smaller than or equal to Z
. Given the value of Z

, help John to determine the secret code.

Formally, let the order of prime numbers 2,3,5,7,11,
... be denoted by p1,p2,p3,p4,p5, ... and so on. Consider Ri to be the product of two consecutive primes pi and pi+1. The secret code is the largest Rj such that Rj≤Z

.
Input

The first line of the input gives the number of test cases, T
. T lines follow.
Each line contains a single integer Z

, representing the number provided by Ada as part of the hint.
Output

For each test case, output one line containing Case #x
: y, where x is the test case number (starting from 1) and y is the secret code - the largest number less than or equal to Z

that is the product of two consecutive prime numbers.
**/
import java.util.*;

public class consecprime {
	public static boolean prime(long n)
	{
		for(int i = 2; i <= Math.sqrt(n); i++)
		{
			if(n % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 1; i <= t; i++)
		{
			
			long n = sc.nextLong();
			//System.out.println(n);
			long sq = (long)(Math.sqrt(n));
			long n1 = sq,n2=sq,n3=sq;
			//Prime less than sqrt of n stored in n1
			for(long j = sq; ;j--)
			{
				if(prime(j))
				{
					n1 = j;
					break;
				}
			}
			//Prime greater than n1 stored in n2
			for(long j = n1+1; ;j++)
			{
				if(prime(j))
				{
					n2 = j;
					break;
				}
			}
			//Prime lesser than n1 stored in n3
			for(long j = n1-1; ;j--)
			{
				if(prime(j))
				{
					n3 = j;
					break;
				}
			}
			//System.out.println(n1+" "+ n2+ " "+ n3+" "+prime(9));
			if(n1*n2 <= n)
				System.out.println("Case #"+i+": "+n1*n2);
			else
				System.out.println("Case #"+i+": "+n1*n3);
			
		}
		sc.close();
	}

}
