/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題7 宇宙船の台数を記録する
 *
 * 宇宙船クラス（Spaceship）にクラス変数numberを追加して、
 * コンストラクタの記述を変更し、新しいオブジェクトが作成されるごとに
 * Spaceshipクラスのオブジェクトをカウントし,１隻目の燃料を10、
 * 2隻目の燃料を20にセットして、それぞれの燃料を画面表示してください。
 * 
 * また、最後に宇宙船の数を画面表示してください。
 *
 * 
 */
package jp.co.sss.java100_questions_cac.lesson06.challenge07;

class Spaceship {
    private int air;
    private int fuel;
    //ここにクラス変数を記述する。

    
    
    //ここに適切な処理を記述する。
    //一隻目の宇宙船には燃料10をセットし、
    //二席目の宇宙船には燃料20をセットしてください
   
    public Spaceship(int air, int fuel) {
        this.air = air;
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getAir() {
        return air;
    }

    public void setAir(int air) {
        this.air = air;
    }

    public static void showsum(){
    	System.out.println("宇宙船の数は" + number + "隻です"); 
    }
}

public class Astronaut {

    public static void main(String[] args) {

        Spaceship spaceship1 = new Spaceship();
        System.out.println("1隻目の燃料は" + spaceship1.getFuel() + "です");        
        Spaceship spaceship2 = new Spaceship();
        System.out.println("2隻目の燃料は" + spaceship2.getFuel() + "です"); 

        //ここに処理を記述する
    }
}
