# Tagalong_Exercise

## Question

1. Create a get request endpoint called /getData with takes email and password as parameters and returns an empty map.
2. Create a post request endpoint called /postData with takes email and password as parameters and returns an empty map.
3. Wrap all your requests with a try catch.
4. Create an error folder with custom error messages for all the error codes and custom success message.

# How to Test

Test in Postman

 Get URL = http://localhost:8080/getData/?username=me&password=you

 Post URL = http://localhost:8080/postData/?username=me&password=you
 - If you call any other route without passing the recommended parameter(username or password), you will get a custom Error Message.

## Thank You