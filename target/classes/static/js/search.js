window.onload = function() {

}



function search(searchString) {
    AP.context.getToken(function(token) {
        console.log("HERE " + token);

        let request = new XMLHttpRequest();
        var endpoint = '/hello-world?jwt=' + token;
        request.open('GET', endpoint);
        request.send();
        //request.setRequestHeader("Authorization", "JWT " + token)
        request.onreadystatechange = function () {
            if (request.readyState === 4) {
                console.log(request.responseText.toString());
                document.getElementById('error-message').innerHTML = request.responseText;
            }
        };
    });
}