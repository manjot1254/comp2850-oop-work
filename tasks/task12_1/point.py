from math import hypot

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    def distance(self):
        return hypot(self.x,self.y)
    def distanceTo(self, p):
        return hypot(self.x - p.x, self.y - p.y)

x = int(input("Input: "))
y = int(input("Input: "))
p = Point(x,y)

print(p.distanceTo(Point(0,0)))
print(p.distanceTo(Point(4.5,7.0)))