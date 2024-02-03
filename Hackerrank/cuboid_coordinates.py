# https://www.hackerrank.com/challenges/list-comprehensions/problem

# List Comprehensions

# Ref - https://realpython.com/list-comprehension-python/

x,y,z,n=map(int,input('Enter values for x,y,z,n: ').split(",")) # Enter input as "1,1,1,2"
print([[i,j,k] for i in range(x+1) for j in range(y+1) for k in range(z+1) if i+j+k!=n])