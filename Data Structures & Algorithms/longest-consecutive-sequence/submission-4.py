
class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        store = {}
        base_max = 1000000
        for num in nums : 
            if num not in store:
                store[num] = 1         
            
            
        max_length = 0 
        for key in store : 
            if key-1 not in store: 
                current = key
                temp = 0 
                while current in store:
                    temp += store [current]
                    store[current] = 0 
                    current += 1 
                if temp > max_length:
                    max_length = temp
                
               
           

        return max_length 

        

        
            


    

        