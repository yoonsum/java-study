package base_java.practice_class_base.ex_class_01;

public class NpcUse {
    public static void main(String[] args) {
        Npc npc = new Npc();

        npc.name = "경비";
        npc.hp = 100;

        System.out.println(npc.name + " : " + npc.hp);

        npc.say();
    }
}
