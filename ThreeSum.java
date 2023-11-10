public class ThreeSum
{
public static int count(int[] a)
{
int N = a.length;
int count = 0;
for (int i = 0; i < N; i++)
for (int jj = i+1; j < N; j++)
for ( int k = j+1; k < N; k++)
if (a[i] + a[j] + a[k] == 0)
count++;
return count;
}
public static void main(String[] args)
{
In in = new In(args[0]);
int[] a = in.readAllInts();
Stopwatch stopwatch = new Stopwatch();
StdOut.printIn(ThreeSum.count(a));
double time = stopwatch.elapsedTime();
StdOut.printIn("elapsed time" + time);
}
}