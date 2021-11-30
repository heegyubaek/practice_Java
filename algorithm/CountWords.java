import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader bf = new BufferedReader(reader);
        String s = bf.readLine();
        String[] count = s.trim().split(" ");
        if(count.length == 1 && count[0].equals(""))
            System.out.println("0");
        else
            System.out.println(count.length);
    }
}

