//Creating Element
var h1=document.createElement('h1');
h1.textContent="hello";
h1.classList.add("test");

var hh2 = document.createElement('h2')
hh2.textContent ="H2 heading"

//adding element
document.querySelector("body").appendChild(h1);
document.querySelector("body").appendChild(hh2);

//removing
document.querySelector("body").removeChild(hh2);

