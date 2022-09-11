import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("123456789012345678901234567890");
        BigInteger b = new BigInteger("987654321098765432109876543210");
        BigInteger c = a.add(b);
        System.out.println(c);

        BigInteger d = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger e = new BigInteger("22222222222222222222222222222222222222222222222222222222222222");
        BigInteger f = d.add(e);
        BigInteger g = d.multiply(e);
        System.out.println(f);
        System.out.println(g);
    }
}