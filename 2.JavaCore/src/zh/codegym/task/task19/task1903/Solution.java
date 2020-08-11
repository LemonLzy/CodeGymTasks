package zh.codegym.task.task19.task1903;

/* 
适配多个接口
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "乌克兰");
        countries.put("US", "美国");
        countries.put("FR", "法国");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact{
        private IncomeData data;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.data = incomeData;
        }

        @Override
        public String getCompanyName() {
            return this.data.getCompany();
        }

        @Override
        public String getCountryName() {
            String countryCode = this.data.getCountryCode();
            return countries.get(countryCode);
        }

        @Override
        public String getName() {
            return this.data.getContactLastName() + ", " + this.data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String phoneNumber = String.format("%010d", this.data.getPhoneNumber());
            return "+" + this.data.getCountryPhoneCode() + "(" + phoneNumber.substring(0, 3) + ")" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6, 8) + "-" + phoneNumber.substring(8, 10);
        }

    }


    public static interface IncomeData {
        String getCountryCode();        // 例如：US

        String getCompany();            // 例如：CodeGym Ltd.

        String getContactFirstName();   // 例如：约翰

        String getContactLastName();    // 例如：史密斯

        int getCountryPhoneCode();      // 例如：1

        int getPhoneNumber();           // 例如：991234567
    }

    public static interface Customer {
        String getCompanyName();        // 例如：CodeGym Ltd.

        String getCountryName();        // 例如：美国
    }

    public static interface Contact {
        String getName();               // 例如：史密斯, 约翰

        String getPhoneNumber();        // 例如：+1(099)123-45-67
    }
}