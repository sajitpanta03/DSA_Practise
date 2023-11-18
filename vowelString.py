class Solution:
  def sortVowels(self, s: str) -> str:
    kVowels = 'aeiouAEIOU'
    ans = []
    vowels = sorted([c for c in s if c in kVowels])

    i = 0  # vowels' index
    for c in s:
      if c in kVowels:
        ans.append(vowels[i])
        i += 1
      else:
        ans.append(c)

    return ''.join(ans)


class Solution:
    def sortVowels(self, s: str) -> str:
        kVowels = set('aeiouAEIOU')
        vowels_indices = sorted((i, c) for i, c in enumerate(s) if c in kVowels)

        ans = list(s)
        for index, vowel in vowels_indices:
            ans[index] = vowel

        return ''.join(ans)
