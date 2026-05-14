# Hello RMI Project

##  Description
This is a simple Java RMI project that shows how client and server communicate remotely using Java RMI.

## ⚙️ How it works
- The Server creates and registers a remote service.
- The Client connects to the server using RMI Registry.
- The Client calls a remote method (sayHello).
- The Server returns a message to the Client.

##  Project Structure
- Hello.java → Remote Interface
- HelloImpl.java → Implementation of the interface
- Server.java → Starts the RMI server and registers the service
- Client.java → Connects to server and calls remote methods

##  How to run
1. Run Server first
2. Run Client after server is running

##  Output
Hello RMI
