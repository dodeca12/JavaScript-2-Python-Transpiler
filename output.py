def fibonacci(n):
	if n<=1:
		return n
	else: 
		nMinus1 = n-1
		nMinus2 = n-2
		fibNMinus1 = fibonacci(nMinus1)
		fibNMinus2 = fibonacci(nMinus2)
		return fibNMinus1+fibNMinus2


numTerms = 10
for i in range(0, numTerms):
	print(fibonacci(i))

