# Pseudocode

## Task 1: Encryption and Decryption

### Main Class

1. Print the program header.
2. Ask the user to input a 4-digit number.
3. Call the `Encrypt` utility function with the user's number as an argument and store the result in `encryptedNumber`.
4. Print the `encryptedNumber`.
5. Call the `Decrypt` utility function with the `encryptedNumber` as an argument and store the result in `decryptedNumber`.
6. Print the `decryptedNumber`.
7. Print the program footer.

### Encrypt Utility Function

1. Accept a string input.
2. Validate the input. If it's null, not 4 digits, or not a number, throw an exception.
3. Convert the string to an array of characters.
4. For each character in the array:
   1. Convert the character to an integer.
   2. Add 7 to the integer and get the remainder after dividing by 10.
   3. Convert the integer back to a character and store it in the array.
5. Swap the first and third characters, and the second and fourth characters.
6. Convert the array back to a string and return it.

### Decrypt Utility Function

1. Accept a string input.
2. Validate the input. If it's null, not 4 digits, or not a number, throw an exception.
3. Convert the string to an array of characters.
4. Swap the first and third characters, and the second and fourth characters.
5. For each character in the array:
   1. Convert the character to an integer.
   2. Subtract 7 from the integer, add 10, and get the remainder after dividing by 10.
   3. Convert the integer back to a character and store it in the array.
6. Convert the array back to a string and return it.

## Task 2: Sieve of Eratosthenes

### Main Class

1. Print the program header.
2. Define the limit as 10000.
3. Call the `Sieve.primeFinder` function with the limit as an argument and store the result in `prime`.
4. Print the prime numbers between 1 and the limit.
5. Print the program footer.

### Sieve Utility Function

1. Accept an integer input `limit`.
2. Create a boolean array `isPrime` of size `limit` and initialize all elements to true.
3. Create an integer array `prime` of size `limit`.
4. Starting from index 2, if an element in `isPrime` is true, iterate through the rest of the array and set to false every element whose index is a multiple of the current index.
5. Repeat step 4 for the next element that is true.
6. After the process completes, the elements in `isPrime` that are still true correspond to prime numbers. Store these indices in the `prime` array.
7. Return the `prime` array.
