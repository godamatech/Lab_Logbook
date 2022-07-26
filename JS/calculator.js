for (var i = 0; i<document.querySelector(".row").clientHeight; i++){
    document.querySelectorAll(".row")[i].addEventListener("click", function () {
        var answer = document.querySelector(".display");
        answer.value += this.textContent;
    });
}




// for (let index = 0; index < document.querySelector(".row").length; index++) {
//     document.querySelector("button")[index].addEventListener("click", function () { 
//     // document.querySelector(".display").value += this.textContent;
//     alert("hhhhhhl");
// });
    
// }