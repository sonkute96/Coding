// bai 1.
function tinhSum(n) {
  var sum = 0;
  for(var i = 1; i <= n; i++) {
    sum += i;
  }
  return sum;
}

// bai 2.
function tinhSumB2(n) {
  var sum = 0;
  for(var i = 1; i <= n; i++) {
    sum += i * i;
  }
  return sum;
}

// bai 3
function tinhSumB3(n) {
  var sum = 0;
  for(var i = 1; i <= n; i++) {
    sum += 1 / i;
  }
  return sum;
}
// bai 4
function tinhSumB4(n) {
  var sum = 0;
  for(var i = 1; i <= n; i++) {
    sum += 1 / (2 * i);
  }
  return sum;
}
// bai 6
function tinhSumB6(n) {
  var sum = 0;
  for(var i = 1; i <= n; i++) {
    sum += 1 / (i * (i + 1));
  }
  return sum;
}
function tinhSumB7(n) {
  var sum = 0;
  for(var i = 1; i <= n; i++) {
    sum += i / (i + 1);
  }
  return sum;
}
function tinhSumB8(n) {
  var sum = 0;
  for(var i = 0; i <= n; i++) {
    sum += (2 * i + 1) / (2 * i + 2);
  }
  return sum;
}
// bai 10.
function tinhGiaTriMu(x,n) {
  return Math.pow(x,n);
}
// bai 11.
function tinhGiaiThua(index) {
  if(index == 0 || index == 1) {
    return 1;
  }
  return index * tinhGiaiThua(index - 1);
}
function tinhSumB11(n) {
  var sum = 0;
  for(var i = 1; i <= n; i++) {
    sum += tinhGiaiThua(i);
  }
  return sum;
}
function tinhSumB14(n) {
  var x = 2;
  var sum = 0;
  for(var i = 0; i <= n; i++) {
    sum += Math.pow(x,(2 * i + 1));
  }
  return sum;
}
function tinhSumB16(n) {
  var x = 2;
  var sum = 0;
  var tempTu = 1;
  var tempMau = 0;
  for(var i = 1; i <= n; i++) {
    tempTu *= x;
    tempMau += i;
    sum += tempTu / tempMau;
  }
  return sum;
}
function lietKeTatCaUocSo(n) {
  for(var i = 1; i<=n; i++) {
    if(n % i == 0) {
      console.log(i + " ");
    }
  }
}
lietKeTatCaUocSo(10);
