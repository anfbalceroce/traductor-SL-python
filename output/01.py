n = suma = k = 0

print("\nSuma de numeros pares entre 1 y n.\nPor favor ", "ingrese un valor para n: ")
n = 20
suma = 0
for k in range(2, n, 2):
	suma = suma + k
print("\nLa suma es ", suma)
