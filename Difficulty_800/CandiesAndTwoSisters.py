# Candies and Two Sisters - Problem 1335A

while True:
    try:
        t = int(input()) 
        if t < 1 or t > 10000:
            print("Please choose a number between 1 - 10000 included!")
            continue
        else:
            break
    except:
        print("Please type in a number!")
        
candyStorage = []        
        
for x in range(t):
    try:
        n = int(input()) 
        if n < 1 or n > 2000000000:
            print("Please choose a number between 1 - 1,000,000,000 included!")
            continue
        else:
            candyStorage.append(n)
    except:
        print("Please type in a number!")
        
for candy in candyStorage:
    half = candy//2
    if candy == 1 or candy == 2:
        print(0)
    elif candy%2 == 0:
        print(half-1)
    else:
        print(half)
    
        
    