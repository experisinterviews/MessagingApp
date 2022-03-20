# Messaging App: Java Spring REST API
**Messaging App**  is a simple message manager REST API that allows a user to manage messages and users.

The app will allow a user to:
* **Manage users :** View all the users, add a user, modify a user and delete a user.
* **Manage messages :** View all the messages, add a message, modify a message and delete a message.

## Task
In this assessment, you are provided a partial implementation of the REST API in which multiple routes are broken. You are required to fix the code such that the routes work as explained below and all APIs return standard HTTP Response Codes.

### ROUTES:
Only 2 routes are available to unauthorized users:
1. Route for adding a new user (Sign up).
2. Route for getting an Authorization header based on username and password.
   (These will not be available to the users with bad authorization headers.)

**All the other routes are available only after the user is authorized.**

As an unauthorized user, you first need to Sign up (ie, Create a user using the **POST**  method on [http://localhost:8080/users](http://localhost:8080/users) and then use the Authorization header with the data provided in form of a string from [http://localhost:8080/authheader](http://localhost:8080/authheader)  to access the API.