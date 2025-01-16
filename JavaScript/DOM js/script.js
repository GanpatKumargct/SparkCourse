
var id = document.querySelector('#idd');
id.textContent = "This is manipulated idd by js DOM (ID)";

//modifying by text content
var classs = document.querySelector('.classs')
classs.textContent = "This is manipulated by JS D0OM (Class)"


//modifying by inner element
var id1 = document.querySelector('.id1');
id1.innerHTML = "<i> This is Italic idd</i>";

var p1 = document.querySelector('.paragraph');
p1.innerHTML = "Windows has a graphical user interface (GUI) that allows users to interact with the computer using icons, buttons, and menus. It also has features like multitasking, which allows multiple applications to run at once, and plug-and-play, which makes it easy to connect devices like printers and scanners.";

var cs = document.querySelector('.csss');
cs.style.color ='blue';
cs.style.fontFamily = "Courier New";

//css class
var libb = document.querySelector('#lib');
libb.classList.remove('lib')

