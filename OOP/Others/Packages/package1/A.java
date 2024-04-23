package Packages.package1;
import Packages.package2.*;

public class A {

    protected static String protectedmsg = "This is a protected message from A";
    public static void main(String[] args) {
        System.out.println(C.defaultmsg);
        // System.out.println(B.privatemsg);
    }

    
}
