public class BitTrie {
    public static void main(String[] args) {
        int num =3;
        System.out.println(num>>0&1);
        System.out.println(num>>2&1);//finding the bit value
        System.out.println(num | (1<<0));
    }
}
