package oops.Encapsulation.pack1;

public class Parent {
    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectVar = 30;
    public int publicVar = 40;
//  1.method is inside same class so all access modifiers are accessible
// that is the reason everything is printed
    public void showInsideParent(){
        System.out.println(privateVar);
        System.out.println(defaultVar);
        System.out.println(protectVar);
        System.out.println(publicVar);

    }
    public static void main(String[] args){
        Parent p = new Parent();
        p.showInsideParent();
    }
}
