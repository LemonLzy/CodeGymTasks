package zh.codegym.task.task19.task1918;

/* 
标记简介，来自社区的回答，暂未理清此题思路
*/

import java.io.*;

import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        String tag = "";
        if (args.length > 0)
            tag = args[0];

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while (br.ready())
            sb.append(br.readLine());
        br.close();

        String line = sb.toString();
        String openTag = "<" + tag;
        String closeTag = "</" + tag + ">";
        String openIcon = "开";
        String closeIcon = "关";
        line = line.replaceAll(openTag, openIcon)
                .replace(closeTag, closeIcon)
                .substring(line.indexOf(openTag));

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, String> lineMap = new HashMap<>();
        int count = 0;
        String[] arr = line.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(openIcon)) {
                stack.push(i);
            }

            if (arr[i].equals(closeIcon)) {
                int currentPosition = stack.pop();
                lineMap.put(currentPosition, line.substring(currentPosition, i + 1));
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, String> pair : lineMap.entrySet()) {
            //replace tag back to string
            list.add(pair.getKey());
        }

        Collections.sort(list);

        for (int i : list) {
            String newLine = lineMap.get(i).replace(openIcon, openTag).replace(closeIcon, closeTag);
            System.out.println(newLine);
        }
    }
}
