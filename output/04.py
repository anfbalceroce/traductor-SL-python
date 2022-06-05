let = ""
msg = ""

let =  '5Z' 
let =  let  [  1  ] 
if ( let  >=  'A'  andlet  <=  'Z' ):
	msg =  "letra mayúscula" 
elif ( let  >=  'a'  andlet  <=  'z' ):
	msg =  "letra minúscula" 
elif ( let  >=  '0'  andlet  <=  '9' ):
	msg =  "dígito" 
else:
	msg =  "algún otro" 
print("\nEl carácter que usted ingresó es ",msg)
