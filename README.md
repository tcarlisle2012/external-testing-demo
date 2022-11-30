# Externalized Testing Demo/POC

This is a demo/proof of concept on a proposed way of doing better externalized testing of our back end services. 

## What is "Better"?

Postman is a gret tool for developing against APIs, etc. not so great as a platform for externalized, comprehensive tests, a.k.a "smoke tests". 

- No debugging/tracing
- No OOP
- Not a clean/efficient way to write tests that are extensible, re-useable, etc. 

## What is Being Proposed?

We leverage Open API code generation to automatically generate client code that is custom to our back end service API structure. We write our externalized/comprehensive tests in our chosen language which we are all experts, and write our tests the same way we do now, but in a separate code base that is using http/rest/graphql etc. instead of spring/mockito mocking.

- We build and maintain an external tests suite that hits our back end services just as a real world client would. 
- Deploy and point ot pre-prd and prod. 
- Kick off tests via a REST call to our testing machine...
- or, create scheduled tasks to periodically run tests, and our tests become a monitoring tool. 

# How to Use this Demo


1. Copy an api-docs.json file to the root of the repo. I can't include this file in a public repository. 
2. Install open API codegen tool:
```npm install @openapitools/openapi-generator-cli -g```
3. Run the script: 
```./client-generate.sh```
4. Watch it automatically build three API clients: java using webclient, kotlin using okhttp3, and javascript

Notice these client api's are complete, with comments and documentation. This is how most enterprises generate their client API's in the various languages. 

We should also get our mobile/front ends used to using the same client libraries. Because if they use these lib's, when we change/add features and regenerate the client library, they get our changes, and the majority of their codebase is isolated from these changes.