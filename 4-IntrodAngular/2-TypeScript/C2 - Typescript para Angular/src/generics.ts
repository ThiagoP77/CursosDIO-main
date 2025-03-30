/*
  generics: é um recurso que permite a criação de 
  componentes que podem trabalhar com uma variedade 
  de tipos, em vez de um único tipo. 
*/
function concatArray<T>(...itens: T[]): T[] {
  return new Array().concat(...itens);
}

const numArray = concatArray<number[]>([1, 5], [3]);
const stgArray = concatArray<string[]>(["felipe", "goku"], ["vegeta"]);

console.log(numArray);
console.log(stgArray);
