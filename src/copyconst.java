//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class copyconst {
    int rollno;
    String name;

    copyconst(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        System.out.println(this.rollno + " :" + this.name);
    }

    copyconst(copyconst cmmp) {
        this.rollno = cmmp.rollno;
        this.name = cmmp.name;
        System.out.println(this.rollno + " :" + this.name);
    }

    public static void main(String[] args) {
        copyconst c = new copyconst(13, "Ramashish singh");
        new copyconst(c);
    }
}
