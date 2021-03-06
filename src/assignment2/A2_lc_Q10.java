package assignment2;

public class A2_lc_Q10 {
    // T: O(n^2)
    // S: 0(1)
    public static int compress(char[] chars) {
        int write  = 0, anchor = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                chars[write++] = chars[anchor];
                if (read > anchor) {
                    for (char c: ("" + (read - anchor +1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                anchor = read + 1;
            }
        }
        return write;
    }
}
