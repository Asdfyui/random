import java.io.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        ReadWord("the");
    }

    public static void ReadWord(String word) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> sentences = new ArrayList<>();

        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int line1 = 0;
        int sentence = 0;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }

        for (String number : lines) {
            line1++;
            if (number.contains(word)) {
                System.out.println(word + " Appears in line " + line1 + " " + "sentence: ");
            } else {
                System.out.println(word + " Doesnt appear in line " + line1 + " " + "sentence: ");
            }
            int a = number.indexOf(".");
            System.out.println("a: " + a);
            if (a > 0) {
                sentence++;
                sentences.add(number.substring(0, a + 1));
            }



            int p = number.indexOf(".", a + 1);
            System.out.println("p: " + p);
            if (p > 0) {
                sentence++;
                sentences.add(number.substring(a + 1, p));
            }


            int o = number.indexOf(".", p + 1);

            if (p == -1) {
                o = -1;
            }

            if (o > 0) {
                sentence++;
                sentences.add(number.substring(p + 1, o));

            }

            if (o - p < 5 && o - p > 0) {
                sentence--;
                String merge = sentences.get(sentence - 1);
                String merge2 = sentences.get(sentence);
//                System.out.println("asdfasdfasdf" + sentences.get(sentence));
//                sentences.remove(sentence - 1);
//                sentences.remove(sentence);
//                sentences.add(merge + merge2);
            }

            System.out.println("o: " + o);

            int i = number.indexOf(".", o + 1);

            if (o == -1) {
                i = -1;
            }

            if (i > 0) {
                sentence++;
                sentences.add(number.substring(o + 1, i));
            }

            if (i - o < 5 && i - p > 0) {
                sentence--;
                String merge = sentences.get(sentence - 1);
                String merge2 = sentences.get(sentence);
//                sentences.remove(sentence - 1);
//                sentences.remove(sentence);
//                sentences.add(merge + merge2);
            }

            int u = number.indexOf(".", i + 1);
            if (i == -1) {
                u = -1;
            }

            if (u > 0) {
                sentence++;
                sentences.add(number.substring(i + 1, u));
            }

            System.out.println("u: " + u);

            if (u - i < 5 && i - p > 0) {
                sentence--;
//                String merge = sentences.get(sentence - 1);
//                String merge2 = sentences.get(sentence);
//                sentences.remove(sentence - 1);
//                sentences.remove(sentence);
//                sentences.add(merge + merge2);
            }


            System.out.println("sentences: " + sentence);
        }


        System.out.println(sentence);

        for (int i = 0; i < 18; i++) {
            System.out.println("sentence: " + i + sentences.get(i));

        }
        br.close();
    }
    public static void Merge(){

    }
}



