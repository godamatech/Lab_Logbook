
for ( var i = 0; i < document.querySelector(".car").clientHeight; i++) {
    document.querySelectorAll(".car")[i].addEventListener("click", function () {
        var sound = new Audio("sound/AL'URJUZATUL MI'IYYAH.mp3");
        if (this.innerHTML === "A") {
            alert("Hello from A !!!");            
            sound.play();
            
        } else if (this.innerHTML === "B") {
            alert("Hello from B !!!");
            sound.pause;
        }else {
            alert( "@Hello "+ this.innerHTML);
        }
        
 });
}