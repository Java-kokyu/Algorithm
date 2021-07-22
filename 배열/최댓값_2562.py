def num_conditon(num):
    	return num > 0 and num < 100

new_list = []

for i in range(9):
    try:
        a = int(input())
        new_list.append(a)
    except:
        continue

new_list = list(filter(num_conditon, new_list))

MAX = max(new_list)
MAX_index = new_list.index(MAX)

print(MAX)
print(MAX_index+1)
