import java.lang.Math;
import java.util.List;
import java.util.ArrayList;
public class PythagoreanTriplet
{
    private int a, b, c;
    private static int num;
    
    private static List<PythagoreanTriplet> triplets;
    private static PythagoreanTriplet triplet = new PythagoreanTriplet();
    public PythagoreanTriplet()
    {
    }
    public PythagoreanTriplet(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static PythagoreanTriplet makeTripletsList()
    {
        triplets = new ArrayList<PythagoreanTriplet>();
        return triplet;
    }
    public static PythagoreanTriplet withFactorsLessThanOrEqualTo(int n)
    {
        num = n;
        return triplet;
    }
    public static PythagoreanTriplet thatSumTo(int n)
    {
        num = n;
        return triplet;
    }
    public static List<PythagoreanTriplet> build()
    {
        for(int i=1; i<=num/2; i++)
            {
                for(int j=i; j<=num/2; j++)
                    {
                        if(Math.pow(i,2) + Math.pow(j,2) == Math.pow(num-i-j,2))
                        {
                            PythagoreanTriplet trip = new PythagoreanTriplet(i,j,num-i-j);
                            triplets.add(trip);
                        }
                    }
            }
        return triplets;
    }
    @Override
    public boolean equals(Object obj) {
        PythagoreanTriplet trip = (PythagoreanTriplet) obj;
        return (trip.a == this.a && trip.b == this.b && trip.c == this.c);
    }
}