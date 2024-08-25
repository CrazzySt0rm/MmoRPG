package newarch.arenas;


import newarch.models.Casters;
import newarch.models.MeeleDPS;

public class PvpArena {

    public final Casters casters;

    public final MeeleDPS meeleDPS;

    public PvpArena(Casters casters, MeeleDPS meeleDPS) {
        this.casters = casters;
        this.meeleDPS = meeleDPS;
    }

    public static void main(String[] args) {



        System.out.println("Дуэль закончилась ничьей" + "\n");



    }

}
