class Store {
    Member mem[] = new Member[100];
    int count = 0;

    public void register(Member m) {
        mem[count++] = m;
    }

    public void inviteSale() {
        for (int i = 0; i < count; i++) {
            mem[i].callBack();
        }
    }
}

interface Member {
    public void callBack();
}

class Customer implements Member {
    String customerName;

    public Customer(String name) {
        this.customerName = name;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    @Override
    public void callBack() {
        System.out.println("Ok, I will visit " + this.customerName);
    }
}

public class SCInterfaceCallBack {
    public static void main(String[] args) {
        Store s1 = new Store();
        Customer c1 = new Customer("Naveen");
        Customer c2 = new Customer("Ravi");
        s1.register(c1);
        s1.register(c2);
        s1.inviteSale();

    }
}




