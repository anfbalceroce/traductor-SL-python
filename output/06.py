tot = 0
n = 0

def imprimir_explicacion ():
	print( "\nEste programa de ejemplo calcula la suma de los enteros"  ,  "\npositivos comprendidos entre 1 y un valor "  ,  "que se ingresa\n" )

def calcular_suma (entero_tope):
	k = 0
	tot =  0 
	for k in range( 1 ,  entero_tope ):
		tot =  tot  +  k 

imprimir_explicacion()
print( "Numero entero? " )
n =  100 
calcular_suma( n )
print( "\nLa suma de los primeros "  ,  n  ,  "números enteros es "  ,  tot )
