def palindrome(s):
    convert_s = ''.join(char.lower() for char in s if char.isalnum())
    return convert_s == convert_s[::-1]

s = "tacocat o tacocat"
print(palindrome(s))
