package at.aau.itec.esop18.lesson13;

import com.sun.xml.internal.ws.api.message.Message;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

public class PasswordMap {
    static MessageDigest md;

    static {
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public PasswordMap() throws NoSuchAlgorithmException {
    }

    public static void main(String[] args) {
        HashMap<String, byte[]> user2password = new HashMap<>(16);

        user2password.put("alice", hash("asdf"));
        user2password.put("bob", hash("pokemon"));
        user2password.put("charly", hash("_are!we0ut?now1"));

        for (String key : user2password.keySet()) {
            System.out.println(key + "\t" + new String(user2password.get(key)));
        }

    }

    private static byte[] hash(String password) {
        return password.getBytes();
        // return md.digest(password.getBytes());
    }
}
