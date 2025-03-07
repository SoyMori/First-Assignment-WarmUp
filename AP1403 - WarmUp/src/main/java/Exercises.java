public class Exercises {

    /*
        complete this function to check if the input number is prime or not
     */
    public boolean isPrime(long n)
    {
        // todo
        for (int i = 2; i * i <= n; i++)
        {
            if (n%i==0)
                return false;

        }
       return true ;
    }
    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */
    public long fibonacciIndex(long n) {
        // todo
        if (n<=0)
            return -1 ;
        int x=0 , z=1 , index=0 ;
        while (x<=n)
        {
            if (x==n)
                return index;
            int temp=x+z;
            x=z;
            z = temp ;
            index++;
        }
        return -1;
    }

    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public char[][] generateTriangle(int n) {
        // todo
        char[][] matrix = new char[n][];
        for (int a = 0; a< n; a++)
            matrix[a]= new char [a+1];

        for (int i = 0; i < n; i++)
            for (int j = 0; j <=i; j++) {
                if (j == 0 || j == i || i == n - 1)
                    matrix[i][j] = '*';
                else
                    matrix[i][j] = ' ';
                }

        return matrix;
    }

    public static void main(String[] args) {
        // you can test your code here, but then it should be checked with test cases
        char[][] mat = new Exercises().generateTriangle(5);
        for (int i=0 ; i<5 ; i++)
        {
            for ( int j=0 ; j<=i ; j++ )
            {
                System.out.print(mat[i][j]);
            }
            System.out.print("\n");
        }
    }
}
