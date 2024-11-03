public class Account {
    private String id;
    private String name;
    private int balance=0;



public Account(String id, String name){

    this.id= id;
    this.name= name;
}

public Account(String id, String name, int balance){

        this.id= id;
        this.name= name;
        this.balance= balance;
}
public Account(){}

public void setId(String id){
    this.id= id;
}
public void setName(String name){
    this.name= name;
}
public void setBalance(int balance){
    this.balance= balance;
}
public String getId(){
    return id;
}
public String getName(){
    return name;
}
public int getBalance(){
    return balance;
}
public int credit(int amount){
    if(this.balance <= 0){
        System.out.println("balance is insufficient to credit.");
    }
    this.balance+= amount;
    return amount;
}
public int debit(int amount){
    if(this.balance <= 0|| amount > balance){
        System.out.println("Not enough balance to debit.");
    }else this.balance -=amount;
        return amount;
}
public int transferTo(Account a , int amount){
    if (this.balance < amount){
        System.out.println("Not enough balance to transfer.");
    }else {
        this.balance -= amount;
        a.balance += amount;
    }
    return amount;
}
public String toString(){
    return  "name: "+this.name+".\n"+
            "ID: "+this.id+".\n"+
            "balance: "+this.balance+".";
}
}