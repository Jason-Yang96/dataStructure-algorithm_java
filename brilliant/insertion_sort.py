a = input()
for current in range(2, len(a)):
    i = current
    while i > 1 & a[i] < a[i-1]:
        a[i] = a[i-1]
        i = i - 1

# shit what's the problem in my code...