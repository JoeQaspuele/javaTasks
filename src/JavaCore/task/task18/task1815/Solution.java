package JavaCore.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {
        private TableInterface tableInterface;

        public TableInterfaceWrapper() {
            this.tableInterface = new TableInterfaceWrapper();

        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
        }

        @Override
        public String getHeaderText() {
            return tableInterface.toString().toUpperCase();
        }

        @Override
        public String setHeaderText(String newHeaderText) {
            return tableInterface.toString().toUpperCase();
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        String setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}