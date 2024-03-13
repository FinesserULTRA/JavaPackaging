# Task 1: Encryption and Decryption

## Main Class

Print "Encryption and Decryption Program"
Prompt user for a 4-digit number and store it in userInput
encryptedNumber = Encrypt(userInput)
Print "Encrypted Number:", encryptedNumber
decryptedNumber = Decrypt(encryptedNumber)
Print "Decrypted Number:", decryptedNumber
Print "Program Completed"

## Encrypt Utility Function

function Encrypt(input):
    characters = convert input to array of characters
    for each character in characters:
        integer = convert character to integer
        integer = (integer + 7) % 10
        character = convert integer to character
    swap characters[0] with characters[2]
    swap characters[1] with characters[3]
    return characters converted to string

## Decrypt Utility Function

function Decrypt(input):
    characters = convert input to array of characters
    swap characters[0] with characters[2]
    swap characters[1] with characters[3]
    for each character in characters:
        integer = convert character to integer
        integer = ((integer * 10) + 3) % 10
        character = convert integer to character
    return characters converted to string

# Task 2: Sieve of Eratosthenes

## Main Class

Create boolean array primes[1000] and initialize all elements to true
for i from 2 to square root of 1000:
    if primes[i] is true:
        for j from i^2 to 1000 with step i:
            primes[j] = false
Print "Prime numbers:"
for i from 2 to 1000:
    if primes[i] is true:
        Print i
