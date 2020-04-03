package midtermreview;
public class Complex {
    int real;
    int imag;
    static String NumType = "Complex";
    public Complex(int real, int imag)
        {
            this.real = real;
            this. imag = imag;
        }
    public String toString()
        {
            return real + "+" + imag + "i";
        }
    public static Complex sum(Complex c1, Complex c2)
    {
        Complex temp = new Complex(0,0);
        temp.real = c1.real + c2.real;
        temp.imag = c1.imag + c2.imag;
        return temp;
    }
    public static void main(String[] args) 
    {
        Complex complex1 = new Complex(2,3);
        System.out.println(complex1);
        
        Complex complex2 = new Complex(3,4);
        
        Complex complex3 = sum(complex1,complex2);
        System.out.println(complex3); //5 + 7i
        
         //Since this var is static it is common to all objs and it doesn't need to be in the constructor
        System.out.println(complex1.NumType);
        
        
    }
    
}