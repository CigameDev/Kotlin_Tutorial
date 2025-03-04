fun main(args: Array<String>) {
    var a =10
    var b =0
    //Sử dụng try-catch để chương trình không bị gián đoạn khi có lỗi
    try {
        var c =a/b
        println(c)
        //Nếu k co lỗi thì chạy vào đây
    }
    catch (e:Exception)
    {
        e.printStackTrace()
        println("Co lỗi chạy vào đây")
    }
    finally {
        println("Thoat khoi database")
        //du co gặp lỗi hay không gặp lỗi thì vẫn chạy vào finally
    }
    println("Đoạn code phía sau")

    try {
        Div(5,0)
    }
    catch (e:Exception)
    {
        println(e.message)
    }
    println("Doan code phia sau ham chia")
}

fun Div(a:Int,b:Int):Int
{
    if(b==0)throw Exception("mau =0 ,khong chia duoc")
    return a/b
}