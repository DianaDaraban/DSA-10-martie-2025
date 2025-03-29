function fizzBuzz(){
    let fizzBuzzList = []
for(let i =1; i<=100; i++){
    fizzBuzzList.push(
        i % 5=== 0 && i % 3 === 0  ? "FizzBuzz" :
        i % 3 === 0 ? "Fizz" :
        i % 5 === 0 ? "Buzz" :
        i
    );
}
return fizzBuzzList
}
fizzBuzz()

console.log(fizzBuzz())