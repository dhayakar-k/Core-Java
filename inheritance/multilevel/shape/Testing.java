package inheritance.multilevel.shape;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Testing {

    public static void main(String[] args) {
       /* Cube cube = new Cube();
        cube.display();
        cube.area();
        cube.volume();*/
        String chineseText = "\u5b9e\u9645\u503c";
        String str = new String(chineseText.getBytes(), StandardCharsets.UTF_8);
        System.out.println("Chinese Text: " + str);
        /*byte[] bytes = chineseText.getBytes();
        String str = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("Chinese Text: " + str);*/
        /*int codePoint = (int) Long.parseUnsignedLong(chineseText.substring(2), 16);
        String result = Character.toString(codePoint);
        System.out.println("Chinese Text: " + result);*/

       String ram = "RAM_THRESOLD_CROSS(ACTUAL-60%,THRESHOLD-25%)";
        String replace = ram.replace("ACTUAL", "bcd1").replace("THRESHOLD", "dhaya");
        System.out.println(replace);
    }
}
