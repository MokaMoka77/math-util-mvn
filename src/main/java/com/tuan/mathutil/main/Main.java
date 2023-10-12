package com.tuan.mathutil.main;


//package com.tuan.mathutil.main;
import com.tuan.mathutil.core.MathUtility;



public class Main {
    public static void main(String[] args) {
        //Test case#1 xem mo tả chi tiết ở phần ghi chú
        int n =0;// hàm ý kiểm tra 0!
        long expected = 1;//hàm ý răngf, hy vọng rằng n = 0! và trả về 1
        long actual = MathUtility.getFactorial(n);// thực tế là mấy
        
        //so sánh giữa expected == actual hay không 
        System.out.println(n + "! -> expected: "+ expected + " | actual "+actual);
        n = 5;
        expected = 120;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! -> expected: "+ expected + " | actual "+actual);
    }
        
}
// dân dev viết ra code: hàm, class đồng thời có trách nhiệm test code của mình
//test code của mih làm ră
// làm sao test?
//có 3 cách
//cách1: om ra màn hình kết quả xử lí của hàm
//cách 2: in ra log file
//cách 3: dùng đồ chơi bên ngoài đem vào - thư viện đem vào!!!!!!

//nhưng dù là kiểm thửu thế nào thì cũng gồm 3 công việc
//thiết kế test case
//Thực thi test case - test run
//Ghi Bug nếu có = LOG BUG

//Testt case là : bộ data đưa vào app để xem app hành xử đúng hok
//                                       kèm thêm expected value để xem app trả về đúngh ko
//                                       kèm thêm hướng dẫn sử dụng app với data đưa vào
//                                       kèm thêm trạng thái của test case: app đúng hay sai

//Cấu trúc test case như sau
//Dùng trong thực tế đi làm và dùng trong bài thi pe


//Một test case gồm nhưnxh info sau:
//Test case id| test case description | steps/procedures
//expected result | Status(Passed | Failed)

//Test case là tình huống xài app với bô data đưa vào và 
// giá trị kì vọng trả về
//Giờ ta mún test hàm getF() ta phải thiết kế các test case coi xem 
// hàm trả về đúng ko


//TEST CASE 1: VERIFILE GetFactorial (with n =0) check 0! correct or not?
//TEST STEPS/PROCEDURES
//      1Given n =0
//      2. Call/Invvoke getFactorial(n=0)


//Expected value result:
//          The method must return 1 as the result of 0!
//Status: passed |Falled, just waiting the method




//TEST CASE 2: