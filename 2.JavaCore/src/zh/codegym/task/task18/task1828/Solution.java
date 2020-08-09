package zh.codegym.task.task18.task1828;

/*
Prices 2，暂时未通过验证
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        InputStream file = new FileInputStream(name);

        if (args.length != 0) {
            if (args[0].equals("-u")) {
                BufferedReader bf = new BufferedReader(new InputStreamReader(file));
                String line;
                ArrayList<String> lines = new ArrayList<>();

                while ((line = bf.readLine()) != null) {
                    lines.add(line);
                    if (line.startsWith(args[1]) && (line.substring(0, args[1].length()).equals(args[1]))) {
                        String id, pname, price, qty;
                        if (args[1].length() < 8) id = args[1] + " ";
                        else id = args[1];
                        if (args[2].length() < 30) pname = args[2] + " ";
                        else pname = args[2];
                        if (args[3].length() < 8) price = args[3] + " ";
                        else price = args[3];
                        if (args[4].length() < 4) qty = args[4] + " ";
                        qty = args[4];
                        lines.set(lines.indexOf(line), id + pname + price + qty);
                    }
                }

                BufferedWriter bw = new BufferedWriter(new FileWriter(name));
                for (int i = 0; i < lines.size() - 1; i++) {
                    bw.write(lines.get(i));
                    bw.newLine();
                }

                bw.write(lines.get(lines.size() - 1));
                file.close();
                bw.close();
            }
            if (args[0].equals("-d")) {
                BufferedReader bf = new BufferedReader(new InputStreamReader(file));
                String line;

                ArrayList<String> lines = new ArrayList<>();
                while ((line = bf.readLine()) != null) {
                    lines.add(line);
                    if (line.startsWith(args[1]) && (line.substring(0, args[1].length()).equals(args[1]))) {

                        if (line.substring(0, args[1].length()).equals(args[1])) {
                            lines.remove(line);
                        }
                    }
                }
                System.out.println(lines);
                BufferedWriter bw = new BufferedWriter(new FileWriter(name));
                for (String s : lines) {
                    bw.write(s);
                    bw.newLine();
                }
                file.close();
                bw.close();
            }
        }
    }
}
