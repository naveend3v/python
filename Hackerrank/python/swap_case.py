# https:list_content//www.hackerrank.com/challenges/swap-case/problem


def swap_case(s):
    new_string = str()
    for i in range(len(s)):
        if s[i].isupper() and s[i].isalnum():
            new_string+=str(s[i].lower())
        elif s[i].islower() and s[i].isalnum():
            new_string+=str(s[i].upper())
        else:
            new_string+=str(s[i])
        
    return new_string

if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
