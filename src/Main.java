public class Main {
    /*
    Star star = new Star("near milky way");
    Planet planet=new Planet("inhabited");

        System.out.println();
        System.out.println();
}
*//*
public static void main(String[]args){
Shape shape=new Shape();
Printer printer=new Printer();
printer.print(shape);
Shape triangle= new Triangle();
Shape circle= new Circle();
printer.print(triangle);
printer.print(circle);
}
}
*//*
    public static void main(String[]args){
        Pet pet=new Pet();
        Printer printer=new Printer();
        printer.print(pet);
        Pet cat= new Cat();
        Pet dog= new Dog();
        printer.print(dog);
        printer.print(cat);
    }
}
*//*
    public static void main(String[]args){


        Printer printer=new Printer();

       Man man= new Man();
       printer.print(man);
        }
}
*/
/*
    public static void main(String[]args){

        Printer printer=new Printer();
        Ship ship= new Ship();
        Fish fish=new Fish();
        Man man= new Man();
        printer.print(fish);
        printer.print(ship);
        printer.print(man);

    }
}

 */

        public static void main(String[] args) {
            A a1 = new A();
            A a2 = new A();
            a1.b++;
            System.out.println(a1.b);
            System.out.println(a2.b);
            A.a += 1000000;
            System.out.println(A.a);
        }
    }
