
package com.tuan.mathutil.core;

//class này sẽ chứa các hàm static sinh ra để làm tôl dùng chung
//cho các nơi khác
// cái gì mà dùng chung cho nhiều nơi, nhận info, trả về info qua hàm, mà 
//ko cần lưu trữ gì hết, cái đó nên là Static
//đồ nào mà là static thì gọi trực tiếp qua tên class.
//Ko bao giờ gọi static qua con đường new!!!!!!!!!!!!!
public class MathUtility {
    public static final double PI = 3.14;
    
    
    
    
    //hàm tính n!=1.2.3....n
    //ko có giai thừa số âm, N<0 ko tính ĐC
    //Nếu N quá lớn thì tràn kiểu long, long chỉ chịu được 18 số 0
    //20! vừa đủ 18 số 0, do đó 
    public static long getFactorial(int n){
        if(n<0||n>20)
                throw new IllegalArgumentException("Invalid n. n must be "
                        + "between 0....20");
        if(n==0 || n==1) return 1;//neu co the ket thuc som thi ket thuc ngay
        
        //son sot den cho nay, sure n= 2........20 vì ko chết dọc đường ở
        // 2 cụm if ở trên rồi, không cần else nếu trước đó xài return
        
        long result = 1;// giai thừa khởi đầu là 1
        //nhan dồn 2,3,4,5...n vào biến này thì thành n!
        
        for (int i = 2; i <= n; i++) {
            result =result *i;
        }
        return result;
    }
}
