// burger menu
const navElt = document.getElementsByClassName("Header-nav");
const nav = navElt[0];
const burgerElt = document.getElementById("burger");
burgerElt.addEventListener("click", function(e){
    if(nav.className==="Header-nav"){
        nav.className+=" active"
    }
    else{
        nav.className="Header-nav";

    }
    e.preventDefault();

});

//Hero slider
const aElt = document.getElementsByClassName("Social-avengers-nav-link");
const avBoxElt = document.getElementsByClassName("Social-avengers");
console.log(aElt);
for(let i = 0; i<aElt.length ; i++){
    aElt[i].addEventListener("click",function(e){
        e.preventDefault();
        for(let j = 0; j<aElt.length ; j++){
            aElt[j].className="Social-avengers-nav-link";
        }
        this.className+=" active";
        switch (i){
            case 0 :
                avBoxElt[0].className = "Social-avengers spiderBox";
            break;
            case 1 :
                avBoxElt[0].className = "Social-avengers ironBox";
            break;
            case 2 :
                avBoxElt[0].className = "Social-avengers hulkBox";
            break;


        }
    });
}
   