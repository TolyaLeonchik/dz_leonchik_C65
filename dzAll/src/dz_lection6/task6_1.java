package dz_lection6;

public class task6_1 {
    public static void main(String[] args) {
        Computer user = new Computer();
        user.resource = 10;

        user.displayInfo();

        int i = 0;
        while (i < user.resource + 1) {
            if (i < user.resource) {
                user.launch();
                if (user.workingPC) {
                    user.shutdown();
                    //System.out.println(user.rndm);     //для видимости угадал ли число
                } else {
                    System.out.println("You failed to launch the computer");
                    break;
                }
            }
            i = i + 2;
        }
        if (user.workingPC) {
            System.out.println("PC is working");
        } else {
            System.out.println("PC is broken");
        }
    }
}
