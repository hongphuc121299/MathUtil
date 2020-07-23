/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuc.util;

/**
 *
 * @author Admin
 */
public class MathUtil {
    public static long computeFactorial(int n){
        //chặn cà chớn dựa vào, ném về ngoại lệ
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("n must be >= 0 & n <= 15");
        }
//        long result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;
        if (n == 0 || n == 1) {
            return 1; //điểm dừng
        }
        //sống sốt đến lệnh này, sure, n > 1
        return n * computeFactorial(n - 1);
    }
}
