window.onload = function () {
    var input = document.getElementById('sku');
    if(input) {
        input.focus();
        input.select();
        input.addEventListener("keyup", function(event) {
            if (event.keyCode === 13) {
                event.preventDefault();
                document.getElementById("scan-button").click();
            }
        })
    }
}