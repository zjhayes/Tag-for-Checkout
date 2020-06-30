// Methods for handling searching.

// Search for item with provided SKU from project issues.
function search(projectKey, searchString) {
    AP.context.getToken(function(token) {
        let request = new XMLHttpRequest();
        let endpoint = '/tagSearch?projectKey=' + projectKey + "&sku=" + searchString;
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

function updateIssueStatus() {
    AP.context.getToken(function(token) {
        let request = new XMLHttpRequest();
        let endpoint = '/updateItemStatus';
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