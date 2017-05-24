import org.apache.commons.lang3.builder.ToStringBuilder;
import java.util.Date;


public class CreditCard {

    private String  icChip;
    private String  number;
    private String  memberName;
    private String  brand;
    private Date    validThrough;

    public CreditCard(String icChip, String number, String memberName, String brand, Date validThrough) {
        this.icChip = icChip;
        this.number = number;
        this.memberName = memberName;
        this.brand = brand;
        this.validThrough = validThrough;
    }

    public String getIcChip(){
        return icChip;
    }

    public String getNumber(){
        return number;
    }

    public String getMemberName(){
        return memberName;
    }

    public String getBrand(){
        return brand;
    }

    public Date getValidThrough() {
        return validThrough;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setValidThrough(Date validThrough) {
        this.validThrough = validThrough;
    }

    public boolean isValid(Date targetDate){
        return this.validThrough.after(targetDate) | this.validThrough.equals(targetDate);
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
