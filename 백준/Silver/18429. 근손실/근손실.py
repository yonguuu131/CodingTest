import sys
input = sys.stdin.readline

n,k=map(int,input().split())
arr=list(map(int,input().split()))
res=0
chk = [False]*(n)


def recur(idx,num):
    global res
    if num < 0:
        return
    if idx==n:
        res+=1
        return
    for i in range(n):
        if chk[i] == False :
            chk[i] = True
            recur(idx+1,num+arr[i]-k)
            chk[i] = False
recur(0,0)
print(res)