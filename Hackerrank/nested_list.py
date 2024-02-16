# https://www.hackerrank.com/challenges/nested-list/problem

# nested-list

name_and_scores = list()
scores = set()

for _ in range(int(input())):
    name = input()
    score = float(input())
    name_and_scores.append([name,score])
    scores.add(score)

second_lowest_score = sorted(scores)[1]
second_lowest_score_names = []

for name,score in name_and_scores:
    if score==second_lowest_score:
        second_lowest_score_names.append(name)

for name in sorted(second_lowest_score_names):
    print(name, end='\n')