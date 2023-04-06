num = int(input())
for i in range(num):
    len, val = map(int, input().split())
    str = input()
    while val > 0:
        if str[0] == '0':
            str = '1' + str[1:]
            val -= 1
        else:
            str += '0'
            val -= 1
    print(str)