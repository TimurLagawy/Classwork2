public class Ship extends Sea_objekt implements Swimmaible{
    @Override
    void print(){
        System.out.println("мы плывем!");
    }

    @Override
    public void swim(){
        System.out.println("плывёт корабль");

    }
}