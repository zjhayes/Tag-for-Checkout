
function search(searchString) {
    AP.context.getToken(function(token) {
        console.log("HERE " + token);

        let request = new XMLHttpRequest();
        var endpoint = '/tagSearch?projectKey=BAR';
        request.open('GET', endpoint);
        request.setRequestHeader("Authorization", "JWT " + token)
        request.send();
        request.onreadystatechange = function () {
            if (request.readyState === 4) {
                console.log(request.response[0]);
                document.getElementById('results').innerHTML = request.responseText;
            }
        };
    });
}