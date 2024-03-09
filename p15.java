class Level1 {
    public void level_1() {
        System.out.println("Perant Class Of level 2 and level 3.");
    }
}

class Level2 extends Level1 {
    public void level_2() {
        System.out.println("Child Class Of level 1 and Perant class of level 3.");
    }
}

class Level3 extends Level2 {
    public void level_3() {
        System.out.println("Perant Class Of level 2 and Child Class of level 3.");
    }
}

public class p15 {
    public static void main(String[] args) {
        Level3 obj = new Level3();
        obj.level_1();
        obj.level_2();
        obj.level_3();

    }
}
