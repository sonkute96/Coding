//: Playground - noun: a place where people can play

import UIKit
// bai 1
func tinhSum(n : Int) -> Int {
    var sum : Int = 0
    for index in 1...n {
        sum += index
    }
    return sum
}
// bai 2
func tinhSumB2(n : Int) -> Int {
    var sum : Int = 0
    for index in 1...n {
        sum += index * index
    }
    return sum
}
// bai 3
func tinhSumB3(n : Int) -> Double {
    var sum : Double = 0
    for index in 1...n {
        sum += Double(1) / Double(index)
    }
    return sum
    
}
// bai 4
func tinhSumB4(n : Int) -> Double {
    var sum : Double = 0
    for index in 1...n {
        sum += Double(1) / Double(2 * index)
    }
    return sum
    
}
// bai 6
func tinhSumB6(n : Int) -> Double {
    var sum : Double = 0
    for index in 1...n {
        sum += Double(1) / Double(index * (index + 1))
    }
    return sum
}
// bai 7
func tinhSumB7(n : Int) -> Double {
    var sum : Double = 0
    for index in 1...n {
        sum += Double(index) / Double(index + 1)
    }
    return sum
}
func tinhSumB8(n : Int) -> Double {
    var sum : Double = 0
    for index in 0...n {
        sum += Double(2 * index + 1) / Double (2 * index + 2)
    }
    return sum
}
// bai 10.
func tinhGiaTriMu(x : Int, n : Int) -> Int {
    var result : Int = 1
    for index in 1...n {
        result *= x
    }
    return result
}
// bai 11.
func tinhGiaiThua(index : Int) -> Int {
    if index == 0 || index == 1 {
        return 1
    }
    return index * tinhGiaiThua(index: index - 1)
}
func tinhSumB11(n : Int) -> Int {
    var sum : Int = 0
    for index in  1...n {
        sum += tinhGiaiThua(index: index)
    }
    return sum
}
func tinhSumB14(n : Int) -> Int {
    var sum : Int = 0
    for index in 0...n {
        sum += tinhGiaTriMu(x: 2, n: (2 * index + 1))
    }
    return sum
}
func tinhSumB16(n : Int) -> Double {
    var sum : Double = 0
    var tempTu : Int = 1
    var x : Int = 2
    var tempMau : Int = 0
    for index in 1...n {
        tempTu *= x
        tempMau += index
        sum += Double(tempTu) / Double(tempMau)
    }
    return sum
}
// test.
var result : Double = tinhSumB16(n: 2)
print(result)

