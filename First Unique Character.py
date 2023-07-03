def find_first_non_repeating_character(string):
    # Create a dictionary to store the frequencies of characters
    frequencies = {}

    # Count the frequencies of characters in the string
    for char in string:
        if char in frequencies:
            frequencies[char] += 1
        else:
            frequencies[char] = 1

    # Find the first character with a frequency of 1
    for char in string:
        if frequencies[char] == 1:
            return char

# Test cases
a=input()
print(find_first_non_repeating_character(a))  # Output
