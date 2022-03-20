public class Man extends Human implements Doctor, Swimmaible{
    @Override
    void print(){
        System.out.println("мужик - ОГО-ГО! C 23 февраля!");
    }

    @Override
    public void healthing() {
        System.out.println("вылечить людей");
    }
    @Override
    public void swim(){
        System.out.println("проплыть 100м");

    }
}