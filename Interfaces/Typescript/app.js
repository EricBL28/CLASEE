"use strict";
const batman = 'Bruce';
const superman = 'Clark';
const existe = false;
//TUPLAS
const parejaHeroes = [batman, superman];
const villano = ['Lex Lutor', 5, true];
//Arreglos
const aliadors = ['Mujer Maravilla', 'Acuaman', 'San', 'Flash'];
//Enumaraciones
//const fuerzaFlash=5;
//const fuerzaSuperman =100;
//const fuerzaBatman=1;
//const fuerzaAcuaman = 0;
var fuerzas;
(function (fuerzas) {
    fuerzas[fuerzas["fuerzaFlash"] = 0] = "fuerzaFlash";
    fuerzas[fuerzas["fuerzaSuperman"] = 1] = "fuerzaSuperman";
    fuerzas[fuerzas["fuerzaBatman"] = 2] = "fuerzaBatman";
    fuerzas[fuerzas["fuerzaAcuaman"] = 3] = "fuerzaAcuaman";
})(fuerzas || (fuerzas = {}));
function saludar(mensaje = "mundo") {
    console.log("Hola" + mensaje);
}
saludar("hola");
//Retorno de funciones
function activar_batiseñal() {
    return 'activada';
}
function pedir_ayuda() {
    console.log('Auxilio');
}
//Aserciones de Tipo
const poder = '100';
const largoDelPoder = poder.length;
console.log(largoDelPoder);
