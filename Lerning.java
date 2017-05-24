import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;


public class Lerning {
    public static void main(String[] args) throws Exception {

        //カード１
        String  icChip1 = "abcdefg";
        String  number1 = "4123456789101234";
        String  memberName1 = "TARO SHIMIZU";
        String  brand1 = "VISA";
        Date    validThru1;
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy/MM");
        validThru1 = dateTimeFormat.parse("2022/08");

        CreditCard creditCard1 = new CreditCard(icChip1, number1, memberName1, brand1, validThru1);

        System.out.println("*** isValid ***");
        //有効期限前
        String dateString = "2022/07";
        System.out.println("isValid(" + dateString + ") = " + creditCard1.isValid(dateTimeFormat.parse(dateString)));
        //有効期限と同じ
        dateString = "2022/08";
        System.out.println("isValid(" + dateString + ") = " + creditCard1.isValid(dateTimeFormat.parse(dateString)));
        //有効期限後
        dateString = "2022/09";
        System.out.println("isValid(" + dateString + ") = " + creditCard1.isValid(dateTimeFormat.parse(dateString)));

        //カード１を代入
        CreditCard tmp = creditCard1;

        //カード２
        CreditCard creditCard2 = new CreditCard(icChip1, number1, memberName1, brand1, validThru1);

        //カード３
        String  icChip3 = "hijklmn";
        String  number3 = "4123456789101111";
        String  memberName3 = "JIRO SHIMIZU";
        String  brand3 = "VISA";
        Date    validThru3;
        validThru3 = dateTimeFormat.parse("2021/08");
        CreditCard creditCard3 = new CreditCard(icChip3, number3, memberName3, brand3, validThru3);

        //カード４
        String  number4 = "4123456789102222";
        CreditCard creditCard4 = new CreditCard(icChip1, number4, memberName1, brand1, validThru1);

        //equals
        System.out.println("*** equals ***");
        System.out.println("同じインスタンス : " + creditCard1.equals(creditCard1));
        System.out.println("creditCard1を代入したtmp変数 : " + creditCard1.equals(tmp));
        System.out.println("別インスタンス(カード情報は同じ) : " + creditCard1.equals(creditCard2));
        System.out.println("別インスタンス(カード番号のみ違う) : " + creditCard1.equals(creditCard4));

        //hashCode
        System.out.println("*** hashCode ***");
        System.out.println("icChip1.hashCode : " + icChip1.hashCode());
        System.out.println("icChip3.hashCode : " + icChip3.hashCode());
        System.out.println("creditCardNumber1.hashCode : " + number1.hashCode());
        System.out.println("creditCardNumber3.hashCode : " + number3.hashCode());
        System.out.println("creditCard1.hashCode : " + creditCard1.hashCode());
        System.out.println("creditCard2.hashCode : " + creditCard2.hashCode());
        System.out.println("creditCard3.hashCode : " + creditCard3.hashCode());

        //hashMap
        System.out.println("*** hashMap ***");
        HashMap<String, CreditCard> hashmap = new HashMap<String, CreditCard>();
        hashmap.put("creditCard1", creditCard1);
        hashmap.put("creditCard2", creditCard2);
        hashmap.put("creditCard3", creditCard3);
        hashmap.put("creditCard4", creditCard4);

        CreditCard hashMapCC1 = hashmap.get("creditCard1");
        CreditCard hashMapCC2 = hashmap.get("creditCard2");
        CreditCard hashMapCC3 = hashmap.get("creditCard3");
        CreditCard hashMapCC4 = hashmap.get("creditCard4");
        System.out.println("hashMapCC1 : " + creditCard1.equals(hashMapCC1));
        System.out.println("hashMapCC2 : " + creditCard1.equals(hashMapCC2));
        System.out.println("hashMapCC3 : " + creditCard1.equals(hashMapCC3));
        System.out.println("hashMapCC4 : " + creditCard1.equals(hashMapCC4));

        //System.out.println
        System.out.println("*** System.out.println ***");
        System.out.println("creditCard1 = " + creditCard1);
        System.out.println("hasMapCC1   = " + hashMapCC1);

        //toString
        System.out.println("*** toString (ToStringBuilder) ***");
        System.out.println("creditCard1 = " + creditCard1.toString());
        System.out.println("hasMapCC1   = " + hashMapCC1.toString());
    }
}

