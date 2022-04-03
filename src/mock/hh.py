ans=[]
n=int(input())
graphs=[[0 for i in range(n)] for j in range(n)]

def display():
  if len(ans)==0:
      print(-1,end="")
  else:
      print(min(ans),end="")
      
def FiNdLinks(m,q3,cout,p):
    for i in range(n):
        if graphs[m][i]==1:
            if i==b:
                ans.append(cout+1)
            graphs[m][i]=0
            FindLinks(i,q3,cout+1,p)
            graphs[m][i]=1
            
def mainInit():
  for i in range(n):
    q3=list(map(int,input().split()))
    for j in q3:
      graphs[i][j-1]=1
  
  h,p=map(int,input().split())
  FindLinks(h-1,graphs,0,p-1)
  display()

mainInit()