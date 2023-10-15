package dev.yuizho;

import org.apache.commons.lang3.StringUtils;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
                var in = Main.class.getClassLoader().getResourceAsStream("message.txt");
                var isr = new InputStreamReader(in);
                var br = new BufferedReader(isr);
        ) {
            var line = br.readLine();
            while (line != null) {
                System.out.println(
                        StringUtils.upperCase(line)
                );
                line = br.readLine();
            }
        }
    }
}