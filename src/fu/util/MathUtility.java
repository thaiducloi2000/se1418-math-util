/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util;

/**
 *
 * @author giao-lang
 */
public class MathUtility {
    //class này chứa các hàm tiện ích dùng chung cho mọi nơi
    //do đó nó phải nên là static
    public static final double PI = 3.1415;
    
    //hàm tính n giai thừa. n >= 0 && n <= 20
    //nếu quá 20 tràn kiểu long
    //0! = 1; 1! = 1; n! = 1.2.3...n
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("n must be >= 0 & <= 20");
//        //đưa đầu vào cà chớn, mình hok thèm trả về 1 giá ám chỉ sai rồi
//        //mình chửi luôn
//        if (n == 0 || n == 1)
//            return 1; //0! = 1! = 1
//        //sống sót đến đây, thì n > 1 và <= 20 rồi
//        long result = 1;
//        
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;    
//    }
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("n must be >= 0 & <= 20");
        //đưa đầu vào cà chớn, mình hok thèm trả về 1 giá ám chỉ sai rồi
        //mình chửi luôn
        if (n == 0 || n == 1)
            return 1; //0! = 1! = 1
        
        return n * getFactorial(n - 1); //đệ quy đó em
                                        //gọi lại chính mình với quy mô
                                        //nhỏ hơn
                                        //5! = 5 * 4!
                                        //4! = 4 * 3!
                                        //3! = 3 * 2!
                                        //2! = 2 * 1! //dừng  
                                        //n! = n * (n - 1)!        
    } //chơi lớn ko thèm check local, xem trực tiếp GitHub Action xanh
}

//Math.sqrt(),  .pow(a, b) a^b,  .abs() trị tuyệt đối, .sin()
//Math.PI