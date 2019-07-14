
/**
 *
 * @author Huguette
 */
public class StringLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "abcd";
        System.out.println(a.contains("f"));
        System.out.println(a.charAt(3));
        System.out.println(a.lastIndexOf("b"));
        System.out.println (a.isEmpty());
        String r ="Hello";
        String f = "I am home";

    StringBuilder b = new StringBuilder();
    b.append(a);
    b.append(r);
    b.append(f);
    System.out.println(b.indexOf(r));
    System.out.println(b.toString());

    }

}
