fun main(args: Array<String>) {
    var a:Int = 35;
    var b:Long = a.toLong();
    //Không giống C# phải ép kiểu không thể để b = a được
    //Ép từ kiểu bé hơn về lớn hơn có thể mất máy dữ liệu
    var x:Short = 32767;
    var y:Byte = x.toByte();//mất mát dữ liệu vì byte chỉ từ -128 đến 127
}