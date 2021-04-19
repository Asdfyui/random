import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader (fr);
        String line;
        while((line = br.readLine()) != null ){
            //System.out.println("Just Read: " + line);
            lines.add(line);

        }
        String a = "Asdfsadf";
        System.out.println(a.charAt(3));
        br.close();
        for (String s : lines){
            //System.out.println(s);
        }
        FileWriter fw = new FileWriter("out.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        for(String s : lines){
          bw.write(s + "\r");
        }
        bw.close();
    }

    public void ReadWord(String s){


    }
}