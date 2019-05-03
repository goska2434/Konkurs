import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static BufferedReader reader;
    static String line;
    static String[] stringsArr;
    static int[]intsArr;
    static long sumOfSurfaceArea =0;
    public static void main(String[] args) {

        try {
            reader = new BufferedReader(new FileReader("input.txt"));

            while ((line = reader.readLine()) != null) {

                    stringsArr = line.split("x");
                int a = Integer.parseInt(stringsArr[0]);
                int b = Integer.parseInt(stringsArr[1]);
                int c = Integer.parseInt(stringsArr[2]);
                    intsArr = new int []{a,b,c};
                    Arrays.sort(intsArr);

                    a = intsArr[0];
                    b = intsArr[1];
                    c = intsArr[2];

                    int surfaceArea = 3 * a* b + 2 * b * c + 2 * a * c;
                    sumOfSurfaceArea+=surfaceArea;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(sumOfSurfaceArea);
        try {

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

