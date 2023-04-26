package com.text.test;

import java.util.Random;

/**
 * 两位数计算题
 * created by sheting on 旺仔
 */
public class test2 {
        public static void main(String[] args) {
            int totalQuestions = 100; // 总题目数量
            int maxNumber = 100; // 最大数值
            int questionsPerLine = 4; // 每行题目数量

            generateMathQuestions(totalQuestions, maxNumber, questionsPerLine);
        }

        public static void generateMathQuestions(int totalQuestions, int maxNumber, int questionsPerLine) {
            Random random = new Random();
            String[] operators = {"+", "-"}; // 定义加法和减法操作符

            for (int i = 1; i <= totalQuestions; i++) {
                int num1, num2, result;
                String operator;
                do {
                    num1 = random.nextInt(maxNumber) + 1; // 生成第一个随机数
                    num2 = random.nextInt(maxNumber) + 1; // 生成第二个随机数

                    // 随机选择操作符号
                    operator = operators[random.nextInt(2)];

                    // 确保结果为正数
                    if (operator.equals("-") && num1 < num2) {
                        int temp = num1;
                        num1 = num2;
                        num2 = temp;
                    }
                    result = evaluateExpression(num1, num2, operator);
                } while (result < 0 || result > maxNumber);

                System.out.print(num1+ operator+ num2 + "="+ "\t");

                // 控制每行题目数量
                if (i % questionsPerLine == 0) {
                    System.out.println();
                } else {
                    System.out.print("\t");
                }
            }
        }

        // 计算表达式的结果
        public static int evaluateExpression(int num1, int num2, String operator) {
            int result;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                default:
                    result = num1 + num2;
                    break;
            }
            return result;
        }




}
