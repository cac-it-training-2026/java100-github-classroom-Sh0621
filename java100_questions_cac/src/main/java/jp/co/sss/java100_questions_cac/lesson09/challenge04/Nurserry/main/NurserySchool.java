/**
 * 第8章 保育園のお仕事
 *
 * 問題7 例外クラスの作成
 *
 * 保育士クラスに園児の体温を測る
 * public void takeTemperature(NurserySchoolChild child)メソッドを追加し、
 * もし体温が38度を超えている場合、独自に作成した例外クラスCriticalConditionExceptionを送出して
 * メッセージ「【園児名】は重体です。すぐに病院に行ってください。」を出力してください。
 * ※CriticalConditionExceptionクラスはlesson14.challenge04.Nurserry.Exceptionパッケージ内に作成してください。
 *
 * <実行例>
 * 保育太郎が出勤しました。
 * 保育次郎が出勤しました。
 * 保育三郎が出勤しました。
 * 園児①が登園しました。
 * 園児②が登園しました。
 * 園児③が登園しました。
 *
 * 園児①の体温は36度です。
 *
 * 園児②の体温は36度です。
 *
 * 園児③は重体です。
 *
 * すぐに病院に行ってください。
 *
 */

package jp.co.sss.java100_questions_cac.lesson09.challenge04.Nurserry.main;

import jp.co.sss.java100_questions_cac.lesson09.challenge04.Nurserry.logic.Nurse;
import jp.co.sss.java100_questions_cac.lesson09.challenge04.Nurserry.logic.NurserySchoolChild;

public class NurserySchool {

    public static void main(String[] args) {

        Nurse nurse1 = new Nurse("保育太郎");
        Nurse nurse2 = new Nurse("保育次郎");
        Nurse nurse3 = new Nurse("保育三郎");

        System.out.println(nurse1.getName() + "が出勤しました。");
        System.out.println(nurse2.getName() + "が出勤しました。");
        System.out.println(nurse3.getName() + "が出勤しました。");

        NurserySchoolChild child1 = new NurserySchoolChild("園児①", 36);
        NurserySchoolChild child2 = new NurserySchoolChild("園児②", 36);
        NurserySchoolChild child3 = new NurserySchoolChild("園児③", 38);

        System.out.println(child1.getName() + "が登園しました。");
        System.out.println(child2.getName() + "が登園しました。");
        System.out.println(child3.getName() + "が登園しました。");


        //ここに適切な処理を記述


    }
}
