const userBox = document.querySelector('.Header-nav-right-userBox-img');
const menu = document.querySelector('.Header-nav-right');


userBox.addEventListener('click', (e) => {
    
    menu.classList.toggle("active")
    e.preventDefault();
});

