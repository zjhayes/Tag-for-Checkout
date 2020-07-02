# Tag for Checkout

This Jira Cloud addon extends the functionality of Checkout, allowing users to search and manage assets with any standard USB barcode reader.



## Installation

Create ngrok tunnel to port 8080

```bash
ngrok http 8080
```

Update the base-url property in application.yml with the ngrok HTTPS forwarding address.

```
base-url: https://{address}.ngrok.io
```

Start Spring Boot

```bash
mvn spring-boot:run
```

Upload app to Jira Cloud.

Navigate to Jira in your Atlassian Cloud instance, then choose Jira settings (cog icon) > Apps > Manage apps.

You must have development enabled.

Click Upload app.

In the 'From this URL' field, provide a link to your app descriptor. 
This URL is the same as the hosted location of your atlassian-connect.json descriptor file.

```bash
https://{address}.ngrok.io/atlassian-connect.json
```

Click Upload.

## Usage

Tag for Checkout will only appear in projects with Checkout enabled.

Once in a Checkout project, click the Tag module.

The SKU search field will automatically be selected. 
Enter the SKU of any Checkout item associated with issues in this project.
The app is intended to be used with any standard barcode reader to quickly run a search.

The search field will automatically be focused, 
so you can run searches without touching their mouse or keyboard.

The 'View Issues' button opens an SQL search with all the issues in a search result.
Individual issues can be viewed by clicking the issue key.