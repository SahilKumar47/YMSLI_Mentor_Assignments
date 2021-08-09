import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class A1{
    void foof(String a){
        System.out.println("void foof(String a)");
    }
    void foof(Integer a){
        System.out.println("void foof(Integer a)");
    }
}
public class test {

 

    public static void main(String[] args) {
        A1 a=new A1();
        Set<Account> set = new TreeSet<>();
        Account a1 = new Account(123, "Sahil", 120.23);
        Account a2 = new Account(1243, "zzz", 121.23);
        Account a3 = new Account(1253, "yyy", 145.23);
        set.add(a1);
        set.add(a2);
        set.add(a3);
        ArrayList<Account> list= new ArrayList<>(set);
        Collections.sort(list, new AccountBalanceSorter());
        for(Account account : list) {
        	System.out.println(account.toString());
        }
    }

 

}