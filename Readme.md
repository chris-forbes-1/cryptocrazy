# Crypto example
This is a dumb little program I made to play about with the java crypto API.

Messages are encrypted in `AES-256-GCM` then signed using `SHA512withECDSA` in `secp256r1` spec.
Finally it generates a sha512 sum of the cipher text + the signature.

The idea behind this is work out it would be possible to make it as difficult as possible to man in the middle messages being sent. 

> **Make sure to take out all the logging if you plan to make use of this in your projects, it writes things like private keys to the logs**

### Future Development
- Make it into a client server application
- Add a shared salt between the client and server
  - It's probably worth saying that their will just be an assumption that this will all be happening over TLS. The point of this project is to try out things to do with crypto and make it as over the top as possible
