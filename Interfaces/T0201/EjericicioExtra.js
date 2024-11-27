// Importamos el modulo readline para leer la entrada del usuario
const readline = require('readline');

// Creamos una interfaz para leer la entrada y salida
const rl = readline.createInterface({
    input: process.stdin, // La entrada es la consola
    output: process.stdout // La salida es la consola
});

// Preguntamos al usuario por el ancho
rl.question('Ingresa el ancho: ', (input) => {
    // Verificamos si no se ha ingresado nada
    if (!input) {
        console.log('Necesitas ingresar ambos numeros para poder las acciones.');
        return rl.close(); // 
    }

    // Verificamos si la entrada no es un numero entero
    if (isNaN(input) || !Number.isInteger(Number(input))) {
        console.log('Debes escribir un numero entero!'); // Mensaje de error
        return rl.close(); // 
    }
    
    // Preguntamos por la altura
    rl.question('Ingresa la altura: ', (input2) => {
        // Verificamos si no se ha ingresado nada
        if (!input2) {
            console.log('Necesitas ingresar ambos numeros para poder las acciones.');
            return rl.close(); // 
        }

        // Verificamos si la entrada no es un numero entero
        if (isNaN(input2) || !Number.isInteger(Number(input2))) {
            console.log('Debes escribir un numero entero!'); // Mensaje de error
            return rl.close(); // 
        }

        // Preguntamos cuantas piezas se quieren de un solo corte
        rl.question('Ingresa cuantas piezas quieres de un solo corte: ', (input3) => {
            // Verificamos si no se ha ingresado nada
            if (!input3) {
                console.log('Necesitas ingresar todos los numeros');
                return rl.close(); // 
            }
    
            // Verificamos si la entrada no es un numero entero
            if (isNaN(input3) || !Number.isInteger(Number(input3))) {
                console.log('Debes escribir un numero entero!'); // Mensaje de error
                return rl.close(); // 
            }

            // Convertimos las entradas a numeros
            const num = Number(input);
            const num2 = Number(input2);
            let veces = Number(input3);
            let piezas = num * num2; // Calculamos el total de piezas
            let poder = false; // Variable para verificar si se puede

            // Verificamos si las piezas deseadas son menores que el total
            if (veces < piezas) {
                // Comprobamos si se puede obtener 'veces' cortando por ancho
                for (let i = num; i >= 1; i--) {
                    piezas = i * num2; // Calculamos piezas
                    if (piezas === veces) {
                        poder = true; // Se puede
                        break; // Salimos del bucle
                    }
                }
                
                // Comprobamos si se puede obtener 'veces' cortando por altura
                if (!poder) {
                    for (let i = num2; i >= 1; i--) {
                        piezas = num * i; // Calculamos piezas
                        if (piezas === veces) {
                            poder = true; // Se puede
                            break; // Salimos del bucle
                        }
                    }
                }
            }

            // Imprimimos si se puede o no
            if (poder) {
                console.log("Se puede");
            } else {
                console.log("No se puede");
            }

            rl.close(); // 
        });
    });
});
