package base_java.practice_class_base.ex_abstract_interface_01;

public class Starcraft {
    public static void main(String[] args) {
        Barracks barracks = new Barracks();
        barracks.doBuild();
        barracks.doMakeMarine();
        barracks.flyBuilding();

        Factory factory = new Factory();
        factory.doBuild();
        factory.doMakeTank();
        factory.flyBuilding();

        Bunker bunker = new Bunker();
        bunker.doBuild();
        bunker.doDefense();

    }
}
