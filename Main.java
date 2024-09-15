public class Main{
enum DAY{
    SUNDAY("sunnyday"), MONDAY("moneyday"), TUESDAY("tuesday"), WEDNESDAY("weddingday")
    , THURSDAY("thursday"), FRIDAY("friend day"), SATURDAY("saturday")
}
public static void main(String []args){
    DAY day = DAY.values();
    System.out.println(day);
}
}
