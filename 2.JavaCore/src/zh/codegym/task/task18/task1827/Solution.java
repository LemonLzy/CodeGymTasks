package zh.codegym.task.task18.task1827;

/* 
价格，采取外国友人的回答，暂未理解其中逻辑
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        if (args.length == 0) {
            return;
        }

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName));
        ArrayList<String> fileLines = new ArrayList<>();

        while (true) {
            String line = bufferedReader1.readLine();
            if (line == null) {
                break;
            } else {
                fileLines.add(line);
            }
        }
        bufferedReader1.close();

        String lastLine = fileLines.get(fileLines.size() - 1);

        int lastId = Integer.parseInt(lastLine.substring(0, 8));

        if (args[0].equals("-c")) {
            StringBuilder productName = new StringBuilder(args[1]);
            StringBuilder id = new StringBuilder(String.valueOf(lastId + 1));
            StringBuilder price = new StringBuilder(String.valueOf(Double.parseDouble(args[2])));
            StringBuilder quantity = new StringBuilder(String.valueOf(Integer.parseInt(args[3])));

            while (id.length() < 8) {
                id.append(" ");
            }

            while (productName.length() < 30) {
                productName.append(" ");
            }

            while (price.length() < 8) {
                price.append(" ");
            }

            while (quantity.length() < 4) {
                quantity.append(" ");
            }

            byte[] bytes = (id + productName.toString() + price + quantity).getBytes();

            String lineSeparator = System.getProperty("line.separator");
            FileOutputStream outputStream = new FileOutputStream(fileName, true);

            outputStream.write(lineSeparator.getBytes());
            File f = new File(fileName);
            outputStream.write(bytes, (int) f.length(), bytes.length);

            outputStream.close();
        }
    }
}
