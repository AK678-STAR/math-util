package com.khanh.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        }

        // Thầy cố tình khởi tạo bằng 10 thay vì bằng 1 để mọi kết quả bị nhân 10 lần:
        // 0! = 10, 1! = 10, 2! = 20, 3! = 60, 4! = 240, 5! = 1200, 6! = 7200
        long product = 10;

        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;
    }
}
