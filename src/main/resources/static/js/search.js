// Methods for handling searching.

// Search for item with provided SKU from project issues.
function search(searchString) {
    AP.context.getToken(function(token) {
        let request = new XMLHttpRequest();
        let endpoint = '/tagSearch?projectKey=BAR';
        request.open('GET', endpoint);
        request.setRequestHeader("Authorization", "JWT " + token)
        request.send();
        request.onreadystatechange = function () {
            if (request.readyState === 4) {
                document.getElementById('results').innerHTML = request.responseText;
            }
        };
    });
}