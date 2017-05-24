import org.apache.commons.lang3.builder.ToStringBuilder;
import java.util.Date;


public class CreditCard {

    private String  icChip;
    private String  number;
    private String  memberName;
    private String  brand;
    private Date    validThru;

    public CreditCard(String icChip, String number, String memberName, String brand, Date validThru) {
        this.icChip = icChip;
        this.number = number;
        this.memberName = memberName;
        this.brand = brand;
        this.validThru = validThru;
    }

    public boolean isValid(Date targetDate){
        return this.validThru.after(targetDate) | this.validThru.equals(targetDate);
    }

    //カード番号が同じならtrueとする場合
//    public boolean equals(CreditCard creditCard){
//        return this.number == creditCard.number;
//    }

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }
}
