N = int(input())

def get_first_numebr(N):
    x = N // 10
    return x
def get_second_number(N):
    y = N % 10
    return y

num1 = get_first_numebr(N)
num2 = get_second_number(N)
num3 = num1 +num2

new_num = num2 * 10 + num3 % 10
i = 0

while N >= 0 and N <=99:    
    new_num = num2 * 10 + num3 % 10
    num1 = get_first_numebr(new_num)
    num2 = get_second_number(new_num)
    num3 = num1 + num2
    i += 1

    if N == new_num:
        print(i)
        break

