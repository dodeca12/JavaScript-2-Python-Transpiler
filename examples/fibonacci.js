function fibonacci(n) {
  if (n <= 1) {
      return n;
  } else {
      let nMinus1 = n-1;
      let nMinus2 = n-2;
      let fibNMinus1 = fibonacci(nMinus1);
      let fibNMinus2 = fibonacci(nMinus2);
      return fibNMinus1 + fibNMinus2;
  }
}

var numTerms = 10;

for (var i = 0; i < numTerms; i++) {
  console.log(fibonacci(i));
}
