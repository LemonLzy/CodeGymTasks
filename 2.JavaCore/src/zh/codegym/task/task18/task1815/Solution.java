package zh.codegym.task.task18.task1815;

import java.util.List;

/* 
表，均使用包装类，保证子类的方法均使用接口对象进行调用
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {

        private TableInterface tableInterface;

        public TableInterfaceWrapper(TableInterface tableInterface1) {
            this.tableInterface = tableInterface1;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            tableInterface.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return tableInterface.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            tableInterface.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}