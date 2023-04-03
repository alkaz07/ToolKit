public class Main {

    public static void main(String[] args) {
	    exemple1();
    }

    private static void exemple1() {
        Table tab1 = new Table("кофейный столик");
        Table tab2 = new Table("рабочий стол");
        Roulette ruler = new Roulette();
        double d = ruler.measureDistance(tab2, tab1);
        System.out.println(d);
    }
}

class Table{
    String name;

    public Table(String name) {
        this.name = name;
    }
}
