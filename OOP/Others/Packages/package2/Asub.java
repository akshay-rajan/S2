package Packages.package2;
import Packages.package1.*;

public class Asub extends A {
    public static void main(String[] args) {
        System.out.println(C.defaultmsg);
        System.out.println(C.protectedmsg);
        System.out.println(A.protectedmsg);
    }
}
