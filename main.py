import pygame
import time
import random

width, height = 1000, 800 # In pixels, take account of size of user device
win = pygame.display.set_mode((width, height))
pygame.display.set_caption("Space Dodge")

def main(): # Main logic of the game
    run = True
    
    while run:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                run = False
                break
    
    pygame.quit()
    
if __name__ == "__main__":
    main()