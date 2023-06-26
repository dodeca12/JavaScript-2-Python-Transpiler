function calculateSum(a, b) {
    var result = a + b;
    return result;
}

function printSquare(num) {
    console.log(num * num);
}

function isEven(num) {
    let remainder = num % 2;
    if (remainder == 0) {
        return true;
    } else {
        return false;
    }
}

var x = 5;
var y = 3;
var sum = calculateSum(x, y);

console.log("The sum of", x, "and", y, "is", sum);

if (isEven(sum)) {
    console.log(sum, "is an even number.");
} else {
    console.log(sum, "is an odd number.");
}
