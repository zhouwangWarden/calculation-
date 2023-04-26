package com.text.test;

import java.util.Random;

/**
 * 三位数计算题
 * created by sheting on 旺仔
 */
public class test {
        public static void main(String[] args) {
            int totalQuestions = 100; // 总题目数量
            int maxNumber = 20; // 最大数值
            int questionsPerLine = 4; // 每行题目数量

            generateMathQuestions(totalQuestions, maxNumber, questionsPerLine);
        }

        public static void generateMathQuestions(int totalQuestions, int maxNumber, int questionsPerLine) {
            Random random = new Random();
            String[] operators = {"+", "-"}; // 定义加法和减法操作符

            for (int i = 1; i <= totalQuestions; i++) {
                int num1, num2, num3, result;
                String operator1, operator2;
                do {
                    num1 = random.nextInt(maxNumber) + 1; // 生成第一个随机数
                    num2 = random.nextInt(maxNumber) + 1; // 生成第二个随机数
                    num3 = random.nextInt(maxNumber) + 1; // 生成第三个随机数

                    // 确保前两个数相减为正数且结果为20以内的正数
                    result = num1 - num2;
                } while (result <= 0||num1+num2>20);

                // 随机选择三个数的操作符号
                operator1 = operators[random.nextInt(2)];
                operator2 = operators[random.nextInt(2)];

                result = evaluateExpression(num1, num2, num3, operator1, operator2);
                if(result>20||result<0) {
                    i--;
                    continue;
                }
                System.out.print(num1  + operator1 + num2  + operator2  + num3 +"="+  "\t");

                // 控制每行题目数量
                if (i % questionsPerLine == 0) {
                    System.out.println();
                } else {
                    System.out.print("\t");
                }
            }
        }

        // 计算表达式的结果
        public static int evaluateExpression(int num1, int num2, int num3, String operator1, String operator2) {
            int result;
            switch (operator1) {
                case "+":
                    switch (operator2) {
                        case "+":
                            result = num1 + num2 + num3;
                            break;
                        case "-":
                            result = num1 + num2 - num3;
                            break;
                        default:
                            result = num1 + num2;
                            break;
                    }
                    break;
                case "-":
                    switch (operator2) {
                        case "+":
                            result = num1 - num2 + num3;
                            break;
                        case "-":
                            result = num1 - num2 - num3;
                            break;
                        default:
                            result = num1 - num2;
                            break;
                    }
                    break;
                default:
                    result = num1 + num2;
                    break;
            }
            return result;
        }









}
