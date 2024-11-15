import org.apache.commons.codec.digest.DigestUtils;

public class App {
    public static void main(String[] args) {
        String hash = DigestUtils.md5Hex("tajne haslo");
        System.out.println(hash);
    }
}
