class App {

    static int totalUsers = 1000; // Static variable (shared across all instances)
    String appName = "PUBG"; // Instance variable
    String userName = "Vinay"; // Instance variable
    int storage = 100; // Instance variable

    // Instance method that uses a local variable
    public void login() {
        String welcomeMessage = "Welcome, " + userName + "!";
        System.out.println(welcomeMessage);
    }

    // Static method demonstrating access to static variables
    public static void displayInfo() {
        System.out.println("Total users using app: " + totalUsers);
    }

    public static void main(String[] args) {
        // Local variables inside main()
        String gameType = "Battle Royale"; // Local string variable
        int currentPlayers = 150; // Local integer variable
        double gameVersion = 2.1; // Local double variable

        // Creating an instance of App class
        App user1 = new App();
        user1.login();
        App.displayInfo();
    }
}
