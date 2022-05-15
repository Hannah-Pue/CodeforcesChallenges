'''Watermelon - Problem 4A'''

while True:
    
    try:
        w = int(input()) 
        if w < 1 or w > 100:
            print("Please choose a number between 1 - 100 included!")
            continue
        else:
            if w % 2 == 0 and w>2:
                print("YES")
            else:
                print("NO")
            break
    except:
        print("Please type in a number!")
        




    