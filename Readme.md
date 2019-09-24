#Crypto example
This is a dumb little program I made to play about with the java crypto API.

Messages are encrypted in `AES-256-GCM` then signed using `SHA512withECDSA` in `secp256r1` spec.
Finally it generates a sha512 sum of the cipher text + the signature.

The idea behind this is work out it would be possible to make it as difficult as possible to man in the middle messages being sent. 


###Future Development
- Make it into a client server application
- Add a shared salt between the client and server
  - It's probably worth saying that their will just be an assumption that this will all be happening over TLS (this is ghoulish overkill for the sake of overkill)  
