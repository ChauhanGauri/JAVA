abstract class Operations {
    abstract public void display();
    abstract public void withdraw();
    abstract public void deposit();
}

class AnonymousExample {
    public static void main(String[] args) {
        Operations obj = new Operations() {
            public void display() {
                System.out.println("We can display current balance by using this method.");
            }
            public void withdraw() {
                System.out.println("We can perform withdraw.");
            }
            public void deposit() {
                System.out.println("We can perform deposit operation.");
            }
        };
        obj.display();
        obj.withdraw();
        obj.deposit();
    }
}

//Anonymous inner class lets us create a one-time use implementation of an abstract class without writing a separate subclass.