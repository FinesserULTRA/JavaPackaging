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
2. Convert the string to an array of characters.
3. For each character in the array:
   1. Convert the character to an integer.
   2. Add 7 to the integer and get the remainder after dividing by 10.
   3. Convert the integer back to a character and store it in the array.
4. Swap the first and third characters, and the second and fourth characters.
5. Convert the array back to a string and return it.

### Decrypt Utility Function

1. Accept a string input.
2. Convert the string to an array of characters.
3. Swap the first and third characters, and the second and fourth characters.
4. For each character in the array:
   1. Convert the character to an integer.
   2. Multiply the integer by 10 and add 3, then get the remainder after dividing by 10.
   3. Convert the integer back to a character and store it in the array.
5. Convert the array back to a string and return it.

## Task 2: Sieve of Eratosthenes

### Main Class

1. Create a boolean array of 1000 elements and initialize all elements to true.
2. Starting from index 2, if an element is true, iterate through the rest of the array and set to false every element whose index is a multiple of the current index.
3. Repeat step 2 for the next element that is true.
4. After the process completes, the elements that are still true correspond to prime numbers. Print these indices.

The utility functions needed for these tasks are `Encrypt.encrypt`, `Decrypt.decrypt`, and the array manipulation functions in the Java standard library.
