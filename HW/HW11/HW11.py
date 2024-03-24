class Solution:
    def floodFill(self, image, sr, sc, newColor):
        if not image or image[sr][sc] == newColor:
            return image
        
        oldColor = image[sr][sc]
        self.dfs(image, sr, sc, oldColor, newColor)
        return image
    
    def dfs(self, image, r, c, oldColor, newColor):
        if r < 0 or r >= len(image) or c < 0 or c >= len(image[0]) or image[r][c] != oldColor:
            return
        image[r][c] = newColor #
        self.dfs(image, r + 1, c, oldColor, newColor)
        self.dfs(image, r - 1, c, oldColor, newColor)
        self.dfs(image, r, c + 1, oldColor, newColor)
        self.dfs(image, r, c - 1, oldColor, newColor)
