#Sale - Problem 34B

n, m = input().split(" ")
k = int(m)
ai = input().split(" ")

prizes = [int(x) for x in ai]
prizes.sort()

count = 0

for y in range(k):
    if prizes[y] < 0:
        count += prizes[y]
    
print(-count)
    
