

const batman:string ='Bruce';
const superman:string ='Clark';

const existe:boolean = false;

//TUPLAS
const parejaHeroes:[string,string]=[batman,superman];
const villano:[string,number,boolean] = ['Lex Lutor',5,true];


//Arreglos

const aliadors:string[]= ['Mujer Maravilla','Acuaman','San','Flash'];

//Enumaraciones
//const fuerzaFlash=5;
//const fuerzaSuperman =100;
//const fuerzaBatman=1;
//const fuerzaAcuaman = 0;

enum fuerzas{
    fuerzaFlash=10,
    fuerzaSuperman,
    fuerzaBatman=9,
    fuerzaAcuaman,
}
function saludar(mensaje:string ="mundo"){
    console.log("Hola" +mensaje);
}

saludar("hola");

//Retorno de funciones
function activar_batiseñal():string{
    return 'activada'
}

function pedir_ayuda():void{
    console.log('Auxilio');

}

//Aserciones de Tipo

const poder: string='100'
const largoDelPoder:number = poder.length;
console.log(largoDelPoder);
