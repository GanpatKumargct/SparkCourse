let random = Math.random()
console.log(random)
let a = prompt("Enter the First number : ")
let b = prompt("Enter the operation : ")
let c = prompt("Enter the second number : ")

let obj = {
    "+":"-",
    "*":"+",
    "-":"/",
    "/":"**"
}


if(random > 0.5){
    alert(`The Result is ${eval(`${a} ${b} ${c}`)}`)
}else{
    c = obj[c]
    alert(`The Result is ${eval(`${a} ${b} ${c}`)}`)
}
