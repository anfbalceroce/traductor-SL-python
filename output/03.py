num = dig = 0

print("\nIngrese un numero entero positivo:")
num = 123456
print("\nLos digitos de ", num, " son:")
while True:
	dig = num % 10
	print("\n", dig)
	num = int(num / 10)
	if(num == 0):
		break
