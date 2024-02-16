# https://www.hackerrank.com/challenges/finding-the-percentage/problem

# Finding the percentage

n = int(input())
student_marks = {}
for _ in range(n):
    name, *line = input().split()
    scores = list(map(float, line))
    student_marks[name] = scores
query_name = input()

total_marks = 0

for mark in student_marks[query_name]:
    total_marks = total_marks + mark

average = total_marks/len(student_marks[str(query_name)])

print("{:0.2f}".format(average))