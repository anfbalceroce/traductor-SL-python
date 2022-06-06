inicio_tabla = 32
fin_tabla = 255
INCR = 16
RELLENO = ' '
k = tope = 0

def prt_ascii (v1, v2, r):
	k = 0
	for k in range(v1, v2):
		print(chr(k), r)

k = inicio_tabla
while True:
	tope = k + INCR
	if (tope > fin_tabla):
		tope = fin_tabla

	prt_ascii(k, tope, RELLENO);
	print("\n")
	k = tope + 1
	if(tope == fin_tabla):
		break
