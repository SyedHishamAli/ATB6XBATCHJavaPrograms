package May.Ex_18052024.Police;

public class Cop {
    int gun;
    private String idCard;

    Cop(int gun){
        this.gun=gun;
    }

    protected void canIShoot(){
        System.out.println("Sure. Shoot! 5 rounds");
    }
}
