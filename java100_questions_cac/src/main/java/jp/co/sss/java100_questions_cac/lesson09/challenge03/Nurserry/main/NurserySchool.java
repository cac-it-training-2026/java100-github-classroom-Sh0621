/**
 * 第8章 保育園のお仕事
 *
 * 問題6 finallyブロック
 *
 * 問題5で作成したdivideを改変し、園児がいてもいなくても
 * 必ず最後に「ケーキの分配が終わりました。」と表示する
 * ようにしてください。
 *
 * <実行例>
 * 保育太郎が出勤しました。
 * 保育次郎が出勤しました。
 * 保育三郎が出勤しました。
 * 園児①が登園しました。
 * 園児②が登園しました。
 * 園児③が登園しました。
 *
 * いただいたケーキの数を入力してください＞○
 *
 * 園児の人数を入力してください＞○
 *
 * ケーキを食べる園児がいません。
 *
 * ケーキの分配が終わりました。
 *
 */

package jp.co.sss.java100_questions_cac.lesson09.challenge03.Nurserry.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.co.sss.java100_questions_cac.lesson09.challenge03.Nurserry.logic.Nurse;
import jp.co.sss.java100_questions_cac.lesson09.challenge03.Nurserry.logic.NurserySchoolChild;

public class NurserySchool {

    public static void main(String[] args) throws IOException {

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

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nいただいたケーキの数を入力してください＞");
        String cakesStr = br.readLine();
        int cakes = Integer.parseInt(cakesStr);

        System.out.print("\n園児の人数を入力してください＞");
        String childsStr = br.readLine();
        int childs = Integer.parseInt(childsStr);

        nurse1.divide(cakes, childs);
    }
}
