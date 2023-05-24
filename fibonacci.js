function fibonacci(n) {
  if (n <= 1) {
    return n;
  } else {
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}

var num = 10;
for (var i = 0; i <= num; i++) {
  console.log(fibonacci(i));
}
