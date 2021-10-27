/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cyv2098
 */
public final class QuizLevelConstant {

    public static final String EASY = "Easy";
    public static final String MEDIUM = "Medium";
    public static final String HARD = "Hard";
    private static List<String> allLevel;
    //thoi gian cho 1 cau de la 1 phut
    public static final int TIME_PER_QUESTION_EASY = 60;
    //thoi gian cho 1 cau trung binh la 1 phut 30s
    public static final int TIME_PER_QUESTION_MEDIUM = 90;
    //thoi gian cho cau kho la 2 phut
    public static final int TIME_PER_QUESTION_HARD = 120;

    public static List<String> getAllLevel() {
        allLevel = new ArrayList<>();
        allLevel.add(EASY);
        allLevel.add(MEDIUM);
        allLevel.add(HARD);
        return allLevel;
    }
}
