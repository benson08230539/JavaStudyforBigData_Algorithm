package ExamMT_QZ2;

/**
 * Description: JavaStudyforBigData (2)
 * Created by L6BD610_Luo on 2022/9/28
 * 考虑下面带额外约束的汉诺塔问题：3个柱子编号为A、B和C，你的任务是将n个圆盘从A移到B上，
 * 确保移动之后大圆盘不能在小圆盘之上，同时圆盘不能直接在A和B之间直接移动，也就是说任何一次圆盘的移动必须涉及C，
 * 请给出每次移动的方向和序号。
 */

/**
 两个栈的问题
 A B C
 1
 3
 2
 ----------------
 A B C
 2
 3
 1
 ----------------
 A B C
 2 3 1

 ----------------

 A B C
 3 2
 1

 ----------------
 A B C
 2 1
 3

 ----------------
 A B C
 1
 2
 3

 第一步：把全部A中的移动到C中，遍历每个圆盘的大小，得到一个序号与大小对应的数组。方向：A->C
 第二步：把C中的圆盘取出放回A，遇到最大的圆盘时把C中最大的圆盘放到B中，方向：C->A (C->B)
 第三步：再把A中的圆盘又放回C中，再重复第二步来获取第二大的圆盘放入B中，方向：A->C
 第四步：再重复第一步。
 */
public class Main6 {
    public static void main(String[] args) {

    }
}
