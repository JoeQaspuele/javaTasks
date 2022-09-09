package JavaCore.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    BufferedReader bfLines = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader bfRemoveLines = new BufferedReader(new InputStreamReader(System.in));
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName_1 = null;
        String fileName_2 = null;
        try {
            fileName_1 = bf.readLine();
            fileName_2 = bf.readLine();
            BufferedReader bf1 = new BufferedReader(new FileReader(fileName_1));
            String str;
            while ((str = bf1.readLine()) != null) {
                allLines.add(str);
            }
            BufferedReader bf2 = new BufferedReader(new FileReader(fileName_2));
            while ((str = bf2.readLine()) != null) {
                forRemoveLines.add(str);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        int count = 0;
        for (int x=0; x < allLines.size(); x++) {
            for (String str : forRemoveLines) {
                if (allLines.get(x).equals(str)) {
                    allLines.remove(x);
                    count++;
                }
            }
        }
        if (count != forRemoveLines.size()) {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
