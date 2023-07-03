def myCode(str):
    num_rows = int(str)

    for i in range(num_rows):
        print(" " * (num_rows - i - 1) + "*" * (2 * i + 1))

# Test case
input_str = "5"
myCode(input_str)
