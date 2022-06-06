TAM_TAB = 8
f_inic = c_inic = 0
T = []
k = 0

def marcar (f, c):
	if ((f > 0 and f <= TAM_TAB) and (c > 0 and c <= TAM_TAB)):
		T[f][c] = 'P'


def impr_tablero ():
	f = c = 0
	for f in range(1, TAM_TAB):
		print("\n")
		for c in range(1, TAM_TAB):
			print(T[f][c], ' ')

print("\nIngrese fila y columna donde se encuentra el alfil:")
f_inic = 1
c_inic = 6
T[f_inic][c_inic] = 'A'
k = 1
while k <= TAM_TAB:
	marcar(f_inic - k, c_inic - k)
	marcar(f_inic - k, c_inic + k)
	marcar(f_inic + k, c_inic - k)
	marcar(f_inic + k, c_inic + k)
	k = k + 1
impr_tablero()
