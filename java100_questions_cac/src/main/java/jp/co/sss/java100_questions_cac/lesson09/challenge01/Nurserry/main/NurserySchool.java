/**
 * 第8章 保育園のお仕事
 *
 * 問題4 例外処理①
 *
 * 入力された出席番号の園児が存在しないときArrayIndexOutOfBoundsException
 * をcatchして「その番号の園児は出席してません。」と表示する
 * public void takeAttendance(NurserySchoolChild[] childs, int num)メソッドを
 * 保育士クラスに作成してください。
 *
 * <実行例>
 * 保育太郎が出勤しました。
 * 保育次郎が出勤しました。
 * 保育三郎が出勤しました。
 * 園児①が登園しました。
 * 園児②が登園しました。
 * 園児③が登園しました。
 *
 * 出席番号4番の園児は来てますか？
 *
 * その番号の園児は出席してません。
 *
 */

package jp.co.sss.java100_questions_cac.lesson09.challenge01.Nurserry.main;

import jp.co.sss.java100_questions_cac.lesson09.challenge01.Nurserry.logic.Nurse;
import jp.co.sss.java100_questions_cac.lesson09.challenge01.Nurserry.logic.NurserySchoolChild;

public class NurserySchool {

	public static void main(String[] args) {

		Nurse nurse1 = new Nurse("保育太郎");
		Nurse nurse2 = new Nurse("保育次郎");
		Nurse nurse3 = new Nurse("保育三郎");

		System.out.println(nurse1.getName() + "が出勤しました。");
		System.out.println(nurse2.getName() + "が出勤しました。");
		System.out.println(nurse3.getName() + "が出勤しました。");

		NurserySchoolChild child1 = new NurserySchoolChild("園児①");
		NurserySchoolChild child2 = new NurserySchoolChild("園児②");
		NurserySchoolChild child3 = new NurserySchoolChild("園児③");

		System.out.println(child1.getName() + "が登園しました。");
		System.out.println(child2.getName() + "が登園しました。");
		System.out.println(child3.getName() + "が登園しました。");

		NurserySchoolChild[] childs = new NurserySchoolChild[3];
		childs[0] = child1;
		childs[1] = child2;
		childs[2] = child3;

		System.out.println("\n出席番号4番の園児は来てますか？\n");

		nurse1.takeAttendance(childs, 4);
	}
}
