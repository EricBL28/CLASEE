// Obtenemos el tercer argumento que se pasa al programa y lo convertimos a un numero
const numero = Number(process.argv[2]); 

// Comprobamos si no es un numero entero o si es NaN (no es un numero)
if (!Number.isInteger(numero) || isNaN(numero)) { 
    // Si no es un numero entero, mostramos un mensaje de error
    console.log("No se ha introducido un numero ENTERO");
} else {
    // Si el numero es par, ejecutamos esta parte
    if (numero % 2 === 0) { 
        console.log("Es par"); // Informamos que el numero es par
    } else {
        console.log("Es impar"); // Informamos que el numero es impar
    }
}
