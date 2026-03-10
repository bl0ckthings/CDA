const navBox = document.querySelector('.Header-navBox');
const navBtn = document.querySelector('.Header-navBox-navBtn');
const mainHeroes = document.querySelector('Main-heroes');
const spiderman = document.querySelector('.Main-heroes-navbar-spiderman');
const ironman = document.querySelector('.Main-heroes-navbar-ironman');
const hulk = document.querySelector('.Main-heroes-navbar-hulk');


navBtn.addEventListener('click', (e) => {
    navBox.classList.toggle('active')
    e.preventDefault()
});

