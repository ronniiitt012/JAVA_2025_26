class shape
{
    public int s,l,b;
    public void ar(int S)
    {
        s=S;
        System.out.println(s*s);
    }
    public void area(int L,int B)
    {
        l=L;
        b=B;
        System.out.println(l*b);
    }
}
public class Main
{
    public static void main(String[] args)
    {
       shape s=new shape();
       s.ar(10);
       shape l=new shape();
       s.ar(10,20);
       
    }
}
