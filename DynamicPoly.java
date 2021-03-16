/**Dynamic Polymorphism Happens during the Runtime.
 * When Methods of the same Names are called using their class obj,
 * JVM decides which method to run by checking the Method signature.
 *
 * Picture this: Two people can have the same name but are completely different.
 * Just like Dynamic polymorphism;
 * */

    //Dynamic Polymorphism with Instance Methods;

public class DynamicPoly {
    //Method Overloading;
    void add(int a, int k) {
        System.out.println("Addition of two numbers = " + (a + k));
    }

    void add(int a, int k, int h) {
        System.out.println("Addition of three Numbers = " + (a + k + h));
    }
}
class DynamicPolyDemo{
    public static void main(String[] args) {
        DynamicPoly dp = new DynamicPoly();
        dp.add(23,58);//JVM checks its signature and calls the appropriate method;
        dp.add(6023,45,123);

    }

}

        /* It's not Possible to write two Methods with the same signature and the same name in the same
         * class. But we can achieve this in sub classes;
         * But always the sub class Methods are Called */

class Super{
    void playSong(){
        System.out.println("Playing 'Love me Like You do' - super");

    }
}
class Sub extends Super{
    void playSong(){
        System.out.println("Playing 'Without Me' - sub");
    }
}
class SubclassDemo{
    public static void main(String[] args) {
        Sub sb = new Sub();
        sb.playSong();  //the sub class Method is Called(Method Overriding)
    }
}

