// Importamos el modulo readline para leer la entrada del usuario
const readline = require('readline');

// Creamos una interfaz para leer la entrada y salida
const rl = readline.createInterface({
    input: process.stdin, // La entrada es la consola
    output: process.stdout // La salida es la consola
});

// Preguntamos al usuario por el primer numero
rl.question('Ingresa el primer numero: ', (input) => {
    // Verificamos si no se ha ingresado nada
    if (!input) {
        console.log('Necesitas ingresar ambos numeros para poder las acciones.');
        return rl.close(); // Cerramos la interfaz
    }

    // Verificamos si la entrada no es un numero entero
    if (isNaN(input) || !Number.isInteger(Number(input))) {
        console.log('Debes escribir un numero entero!'); // Mensaje de error
        return rl.close(); // Cerramos la interfaz
    }
    
    // Preguntamos por el segundo numero
    rl.question('Ingresa el segundo numero: ', (input2) => {
        // Verificamos si no se ha ingresado nada
        if (!input2) {
            console.log('Necesitas ingresar ambos numeros para poder las acciones.');
            return rl.close(); // Cerramos la interfaz
        }

        // Verificamos si la entrada no es un numero entero
        if (isNaN(input2) || !Number.isInteger(Number(input2))) {
            console.log('Debes escribir un numero entero!'); // Mensaje de error
            return rl.close(); // Cerramos la interfaz
        }

        // Convertimos las entradas a numeros
        let num = Number(input);
        let num1 = Number(input2);
        
        // Verificamos si el primer numero es mayor que el segundo
        if (num > num1) {
            console.log("El primer numero tiene que ser menor");
            return rl.close(); // Cerramos la interfaz
        }
        
        let primo = true; // Variable para verificar si un numero es primo

        // Iteramos desde el primer numero hasta el segundo
        for (num; num <= num1; num++) {
            primo = true; // Reiniciamos la variable primo

            // Verificamos si el numero actual es primo
            for (let i = 2; i < num; i++) {
                if (num % i === 0) {
                    primo = false; // No es primo
                    break; // Salimos del bucle
                }
            }
            // Si es primo, lo imprimimos
            if (primo && num > 1) { // Aseguramos que num es mayor que 1
                console.log(num);
            }
        }

        rl.close(); // Cerramos la interfaz
    });
});
