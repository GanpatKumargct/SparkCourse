var a = 10;
console.log(a);

console.log("HEllOW FELLOW DEVLOPER")

var b = 92
console.log(b)

console.warn("i'm waring.")
console.error("Error message")

//var
var f = 62;
f = 70;
console.log(f);


//Let Variable
let c = "ganpat";
c = "kumar";
console.log(c);


//Constant
const d = "gam";
console.log(d);

//not change to K
var a = 10;
k = a;

a = a+2;
console.log(a);
console.log(k);





//Array
var arr = [1,2,6,5,8];
arr1 = arr;

arr.pop();

console.log(arr);
console.log(arr1);

//Array with spread

var arr = [1,2,6,5,8];
arr1 = [...arr];

arr.pop();

console.log(arr);
console.log(arr1);

//Conditional Statement

var z = 10;

if(z>5){
    console.log("hii");
    
}else{
    console.log("Bye");
    
}

//For Loop

for(var v = 1; v<=5; v++){
    console.log(v);
}

//while loop
let count = 1;
while (count <= 5) {
  console.log(count);
  count++;
}
//for each loop
var arr = [5,8,4,6,8]
arr.forEach(data=>{
    console.log(data);
    
})

//Function
function print(name){
    console.log("Hello : "+name);
    
}
print("niraj");

//Function with return type
function hello(name){
    console.log("HEllo : "+name);
    return "Byy jii..";
}
var v = hello("ritu");
console.log(v);

//Function with Expression
var fun = function(){
    console.log("Expression Function");
    
}
fun();

//anonymys Function

// function {
//     console.log("hello jii");
    
// }

//Function in ES6
console.log("Function in ES6");

//fat arrow fn
var fun =() =>{
    console.log("Hello Ritu...");
    
}
fun();


//fat arrow with one parameter
var fun =(name) => {
    console.log("Hii "+name+" baby");
    return "Kaise hai aap?";

}
var res1 = fun("Ganpat");

//fat arrow with implict return Function
var fun =() => "Ganpat Kumar";
let res2 = fun();
console.log(res2);


//array in js
var arr1 = [5,10,48,"kumar", [], function(){}];
console.log(arr1[2]);
console.log(arr1[3]);
console.log(arr1[4]);
console.log(arr1[5]);


//Object 
var obj ={
    "Name":"Ganpat",
    "Age":19,
    "Email":"ganpat@gmail.com",
    "Mobile":"99556524377"
}

console.log(obj.Name);
console.log(obj.Age);
console.log(obj.Email);

//this in js
function print1(){
    console.log(this);
}
print1();

//method
var obj = {
    Name:function(){
        console.log(this);
    },
    "Age":26
}
obj.Name();

//Function Inside method-ES5
console.log("..............");
var obj = {
    parent:function(){
        function child(){
            console.log(this);
            
        }
        child();
    }
}

obj.parent();

//Function Inside method-ES6
console.log("..............");

var obj = {
    Name1 : function(){
        var child =() => {
            console.log(this);
            
        }
        child();
    }
}
obj.Name1();

//Constructor
console.log("Constructor.............");

function print2(){
    console.log(this);
    
}
var obj = new print2();

//Event Listener
console.log("Event listener");

document.querySelector("button")
.addEventListener("click",function(){
    console.log(this);
    
})


//Call : through call we can change this value in function
var obj ={
    Nm : "Manish"
}

function funct(){
    console.log(this);
}

funct.call(obj.Nm);

//apply
var obj ={
    Nn : "Manish"
}

function fu(x,y,z){
    console.log(this,x,y,z);
}

fu.apply(obj,['a',3,"gan"]);

//Bind
var obj = {
    nn : "nitish"
}

function ff(){
    console.log(this);
}

var ff = ff.bind(obj);
ff();

//Closure
function print(){
    var p = 10;
    return function child(){
        console.log(p);
    }
}

var fff = print();
fff();