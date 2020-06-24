$(document).ready(function(){
    $('#sku').keypress(function(e){
        if(e.keyCode===13)
            $('#scan-button').click();
    });
});