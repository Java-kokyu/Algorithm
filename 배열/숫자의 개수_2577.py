while True:
    A = int(input())
    if A > 0: 
        break
    else:
        print("Please put natural number.")

while True:
    B = int((input()))
    if B > 0: 
        break
    else:
        print("Please put natural number.")

while True:
    C = int((input()))
    if C > 0: 
        break
    else:
        print("Please put natural number.")

result = A * B * C

result = str(result)
print(result.count('0'))
print(result.count('1'))
print(result.count('2'))
print(result.count('3'))
print(result.count('4'))
print(result.count('5'))
print(result.count('6'))
print(result.count('7'))
print(result.count('8'))
print(result.count('9'))
