let = ""
msg = ""

let = '5Z'
let = let[1]
if (let >= 'A' and let <= 'Z'):
	msg = "letra mayúscula"
elif (let >= 'a' and let <= 'z'):
	msg = "letra minúscula"
elif (let >= '0' and let <= '9'):
	msg = "dígito"
else:
	msg = "algún otro"
print("\nEl carácter que usted ingresó es ", msg)
