// Methods for handling searching.

// Search for item with provided SKU from project issues.
function search(projectKey) {
    console.log(projectKey);
    AP.context.getToken(function(token) {
        let sku = document.getElementById("sku").value;
        resetSearch();
        let request = new XMLHttpRequest();
        let endpoint = '/tagSearch?projectKey=' + projectKey + "&sku=" + sku;
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

function resetSearch() {
    let input = document.getElementById('sku');
    if(input) {
        //input.value = '';
        input.focus();
        input.select();
    }
}