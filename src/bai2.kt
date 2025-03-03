fun main(args: Array<String>) {
    var a:Int =65;//Khai báo tường minh
    println("a = "+a)
    println("Gia tri của số a là : $a")
    var b = 9.5f;//khai báo tắt
    var c = 10.75;//kieu double
    println("b kieu loai "+(b::class.java.typeName));
    println("c kieu loai "+(c::class.java.typeName));

    var str = """
        Thân em vừa trắng lại vừa tròn
        Bẩy nổi ba chìm với nước non
        Rắn nát mặc dầu tay kẻ lặn
        Mà em vẫn giữ tấm lòng son
    """
    //Mang
    var myArr :FloatArray = floatArrayOf(0.5f,1f,1.5f,7.3f);
    var mangKyTu :CharArray = charArrayOf('a','b','c');

    //Const
    val nhietDoSoi:Int =100;
}