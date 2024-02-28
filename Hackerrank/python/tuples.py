# https://www.hackerrank.com/challenges/python-tuples/problem

n , t = int(input()), tuple(map(int, input().split()))
print(hash(t))