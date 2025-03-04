fun main(args: Array<String>) {
    var kt1:Char = 'a'
    var kt2 ='b'//vẫn đúng nhưng mất thêm thời gian nội suy,nên khai báo tường minh
    var kt4:Char = Char(64)
    println(kt1)
    println(kt4)
    var s = "hello";
    var kt3:Char = s.first()
    println(kt3)
    println('a'.compareTo('b'))//-1 =>a<b,có 3 trường hợp -1,0,1
    println('a'.equals('a'))//true
    
}