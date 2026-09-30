class Solution:
    def isPalindrome(self, s: str) -> bool:
        words = ""
        for char in s:
            if char.isalnum():
                words += char.lower()
           
        words.split(" ")
        max_length = len(words) -1 

        for i in range(len(words)):
            if (i == max_length):
                break
            elif (words[i] != words[max_length]):
                return False
            max_length -= 1
        return True



        