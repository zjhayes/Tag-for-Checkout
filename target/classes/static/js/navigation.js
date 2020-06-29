// Methods for navigating around Jira.

// Navigate to given Jira Issue.
function goToJiraIssue(issueKey) {
    AP.navigator.go('issue', {
        issueKey: issueKey
    });
}

// Reload parent page.
function reload() {
    AP.navigator.reload();
}

// Navigate to JQL Search.
function goToJQLSearch(sql) {
    let url = '/issues/?jql=' + sql;
    AP.navigator.go('site', {relativeUrl: url});
}