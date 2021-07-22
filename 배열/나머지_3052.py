num_list = []

while len(num_list) != 10:
    num = int(input())
    if num > 1000 or num < 0:
        print("please put 1000 or less natural numebr.")
        continue
    num_list.append(num)

remainder_list = []

for i in range(len(num_list)):
    remainder_num = num_list[i] % 42
    remainder_list.append(remainder_num)

remainder_set = set(remainder_list)

print(len(remainder_set))