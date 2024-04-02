public class Main {
    public static void main(String[] args) {
        //Calculator c = new Calculator(5);
        //c.add(3);
        //c.inmultire(2);
        //c.imparte(4);//System.out.println(c.getresult());

        System.out.println("------------------------------");

        Calculator2 c = new Calculator2(5);
        c.add(3);
        c.inmultire(2);
        c.imparte(4);
        c.sqrt();
        System.out.println(c.getresult());
    }
}