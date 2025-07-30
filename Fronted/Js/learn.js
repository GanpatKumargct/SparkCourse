alert("this is a alert meassage")

console.log("code is running")

var a = prompt("Enter the number ")
console.log("your number is "+a)

var istrue = confirm("Are you sure you want to leave the page")

if(istrue){
    console.log("Page is leaving")
}else{
    console.log("Page is not leave")
}



//naming convension
var nam = 55;

//premitive data types

let x = 55;
let y = 54.5;
let z = "ganpat";
let p = undefined;
let q = null;
const r = true;

console.log(x,y,z,p,q,r);
console.log(typeof x,typeof y,typeof z,typeof p,typeof q,typeof r);

console.log(x+y);


let o = {
    name : "ganpat",
    "job code":154,
    
}
console.log(o);

o.salarly= "5cr";
console.log(o)


let a = 5;
let b = 10;

let c = a+b;

console.log(c)

let age = 89;

if(age>=18 && age<56){
    console.log("You can vote")
}else if(age >= 55){
    console.log("hey baba jii aap to kar hi sakte hai")
}
else{
    console.log("you can't vote")
}


let d = (a>b) ? (a-b) : (b-a)
console.log("ternary operator : "+d)

//Loop 
for (let i = 0; i <= 10; i++) {
    const element = i;
    console.log(element)
}


//for in loop
let obj ={
    name :"gannu",
    class:"cse-a"
}

for (const key in obj) {
    
    const element = obj[key];
    console.log(key,element);
        

}

//for of loop
for (const c of "Ganpat") {
    console.log(c)  
}

//while loop

let i = 1;
while(i<5){
    console.log(i)
    i++;
}


//Function
function nice(name){
    console.log("Hii "+name+" you re a good");
    console.log("hey "+name+", do you known what is this?")
}

nice("nikki");

function sum(a,b){
    console.log(a+b);
}

sum(3,5);

function add(a,b, c=5){
    return a+b+c;
}

res1 = add(5,6);
res2 = add(5, 6.5);
res3 = add(8);
res4 = add(5,"gan")

console.log(res1);
console.log(res2);
console.log(res3);
console.log(res4);

//arrow function
const func =(x) => {
    console.log("i am a arrow function "+x);
}

func(35);
func(36);


//Array
console.log("Array start.....")
let arr = [1,5,6,7,8,9]
console.log(arr);
console.log(arr.length);
console.log(arr.toString());
console.log(arr);
console.log(arr.join());
console.log(arr);
console.log(arr.pop());
console.log(arr);
console.log(arr.push(55));
console.log(arr);
console.log(arr.pop());
console.log(arr);

console.log(arr.shift());
console.log(arr);

console.log(arr.unshift(554));
console.log(arr);

console.log("Hello World");

var a = 10;
console.log(a);


let b = 25;
console.log(b);
console.log(typeof b);

console.log(a+b);


let name = "bucket";
console.log(typeof name);

let obj ={
    id : 101,
    "Full name":"Ganpat kumar",
    age:20
};
console.log(obj);
console.log(typeof obj);

//premitive data types

/* 
int , string, boolean, unidefened,
 null, 
symbol,
 float
*/

// operator -- Arithemetic operator
let num1 = 10;
let num2 = 80;
console.log(num1+num2);

//contdional statement

let money = 10;

if(money >= 99){
    console.log("You got a pizaa..!");
}else{
    console.log("You have not sufficient money for pizaa..!");
}

//loop statement 
for (let i = 1; i <= 100; i++) {
    const element = i;
    console.log(element)
    
}