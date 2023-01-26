import java.text.DecimalFormat;
import java.text.NumberFormat;


public class PricelessScript {
    /**
     * Proof that MasterCard marketing is in your DNA
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // String variables, some with format specifiers
        String scriptTemplateLine1 = "%d tickets: %s";
        String scriptTemplateLine2 = "%d hotdogs, %d popcorn, %d sodas: %s";
        String scriptTemplateLine3 = "2 autographed baseball %s";
        String scriptTemplateLine4 = "watching the Giants win: %s";
        String priceless = "priceless";

        // integer variable
        int people = 3;
        // 32 bit floating point variable
        float ticketPrice = 14.0f;  // 32 Bit, but it does exist!
        // double precision floating point variable
        double itemPrice = 9.0;    // Double precision
        // boolean variable
        boolean trueOrFalse = false;

        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.println(
                String.format(scriptTemplateLine1, people,
                        formatter.format(people * ticketPrice)));

        // Example of using printf and platform specific line separator "%n" to
        // format instead of String.format
        System.out.printf((scriptTemplateLine2) + "%n", people, people, people,
                formatter.format(people * itemPrice));

        itemPrice = 90.0;
        System.out.println(
                String.format(scriptTemplateLine3, formatter.format(itemPrice)));

        System.out.println(
                String.format(scriptTemplateLine4, priceless));

        System.out.println(trueOrFalse);

        float a = 1.6f;
        boolean b = false;
        String c = "C";
        int d = 5000;
        double e = 0.65676566577658;
        formatter = new DecimalFormat("0.#####E0");
        double f = 9.512;

        String h = "6756456";

        int o = 0765;
        String s = "This is a string";
        //DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime();
        //LocalDateTime t = LocalDateTime.now();
        //BigInteger(1, 0AE3).toString(16);


        System.out.println("=========================================");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(formatter.format(e));
        System.out.println(f);
        //System.out.println(g);
        System.out.println(h.hashCode());
        System.out.println(System.lineSeparator());
        System.out.println(o);
        System.out.println(s);
        System.out.println(java.time.LocalDateTime.now());
        //System.out.println(Hex.encodeHexString(bytes));
        //String.format("%X", ByteBuffer.wrap(eightByteArray).getLong());


    }

}
