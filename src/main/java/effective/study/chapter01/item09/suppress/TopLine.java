package effective.study.chapter01.item09.suppress;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TopLine {

    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BadBufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(firstLineOfFile("pom.xml"));
    }
}
