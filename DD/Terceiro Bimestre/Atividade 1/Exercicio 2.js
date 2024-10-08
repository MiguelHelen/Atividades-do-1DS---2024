var numero = prompt('Digite um número:');
numero = parseInt(numero);
 
var x = numero % 2;

    if (x === 0) {
        console.log('O número ' + numero + ' é par.');
    } else {
        console.log('O número ' + numero + ' é ímpar.');
    }