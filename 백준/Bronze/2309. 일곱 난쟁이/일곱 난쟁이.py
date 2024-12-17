a=[int(input()) for _ in range(9)]
a.sort()
suma=sum(a)

for i in range(len(a)):
    for j in range(i+1,len(a)):
        if suma-a[i]-a[j]==100:
            for k in range(len(a)):
                if k==i or k==j:
                    pass
                else:
                    print(a[k])
            exit()