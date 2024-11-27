// Importamos el modulo readline para leer la entrada del usuario
const readline = require('readline');

// Creamos una interfaz para leer la entrada y salida
const rl = readline.createInterface({
    input: process.stdin, // La entrada es la consola
    output: process.stdout // La salida es la consola
});

// Preguntamos al usuario que introduzca un año entre 1900 y 3000
rl.question('Introduce un año entre 1900 y 3000: ', (input) => {
    
    // Convertimos la entrada a un numero
    const anyo = Number(input);

    // Verificamos si no es un numero entero o si es nulo
    if (!Number.isInteger(anyo) || isNaN(anyo)) {
        console.log("No se ha introducido un numero entero"); // Mensaje de error
    } else if (anyo < 1900 || anyo > 3000) {
        console.log("Numero mal introducido. Debe estar entre 1900 y 3000."); // Mensaje de error
    } else {
        // Comprobamos si el año es bisiesto
        if ((anyo % 4 === 0 && anyo % 100 !== 0) || (anyo % 400 === 0)) {
            console.log("El año " + anyo + " es bisiesto"); // Mensaje si es bisiesto
        } else {
            console.log("El año " + anyo + " no es bisiesto"); // Mensaje si no es bisiesto
        }
    }

    rl.close(); // Cerramos la interfaz de lectura
});






