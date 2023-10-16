
package com.tuan.mathutil.core;

//class này sẽ chứa các hàm static sinh ra để làm tôl dùng chung
//cho các nơi khác
// cái gì mà dùng chung cho nhiều nơi, nhận info, trả về info qua hàm, mà 
//ko cần lưu trữ gì hết, cái đó nên là Static
//đồ nào mà là static thì gọi trực tiếp qua tên class.
//Ko bao giờ gọi static qua con đường new!!!!!!!!!!!!!
public class MathUtility {
    public static final double PI = 3.14;
    
    
    
        public static long getFactorial(int n){
        if(n<0||n>20)
                throw new IllegalArgumentException("Invalid n. n must be "
                        + "between 0....20");
        if(n==0 || n==1) return 1;//neu co the ket thuc som thi ket thuc ngay
        
        return n * getFactorial(n -1);
    }
    //Đệ quy - Recursion
    //Búp bê nga -Đệ quy  là gọi là chính mình với quy mô nhỏ hơn
                    // nhỏ đến 1 mức dừng lại
        //5!=1*2*3*4*5
        //5! = 5 * 4!
        //5! = 5*4*3!
        //5! = 5*4*3*2!
        //5!=5*4*3*2*1!
        
        //n! =n x (n-1)!
        
        
        
        //Kỹ thụat kiểm thử hồi quy: kiểm lại những thứ cần test để xác nhận nó còn có ổn không 
        //tại sao test lai
        //code theo thời gian có thay đổi vì
        //1.Anh em fix bug,sẽ sửa code
        //2.Anh em tối ưu, chỉnh sửa code để code đẹp hơn, chạy tốt hơn
        // nhanh hơn
        //3.Anh em viết thêm hàm mới, method mới 
        
        
        // khi sửa code, phải test lại để đảm bảo nó vẫn ngon, vẫn xanh
        //Nếu test bằng tay = cực kì mất sức có khi sai sót
        //Nếu có test script ta chỉ việc run và nhìn màu đưa ra
        //Nếu màu xanh, code chỉnh sửa ổn, sửa tiếp cho đến khi nào ổn
        // Ta test lại mà chỉ cần nhìn màu -> xanh, không hao sức, chính xác
        //Miễn đủ test case, test script
        
        //Test lại những thứ đã từng test gọi là test hồi quy Regresstion
//    
//    
//    //hàm tính n!=1.2.3....n
//    //ko có giai thừa số âm, N<0 ko tính ĐC
//    //Nếu N quá lớn thì tràn kiểu long, long chỉ chịu được 18 số 0
//    //20! vừa đủ 18 số 0, do đó 
//    public static long getFactorial(int n){
//        if(n<0||n>20)
//                throw new IllegalArgumentException("Invalid n. n must be "
//                        + "between 0....20");
//        if(n==0 || n==1) return 1;//neu co the ket thuc som thi ket thuc ngay
//        
//        //son sot den cho nay, sure n= 2........20 vì ko chết dọc đường ở
//        // 2 cụm if ở trên rồi, không cần else nếu trước đó xài return
//        
//        long result = 1;// giai thừa khởi đầu là 1
//        //nhan dồn 2,3,4,5...n vào biến này thì thành n!
//        
//        for (int i = 2; i <= n; i++) {
//            result =result *i;
//        }
//        return result;
//    }
}
