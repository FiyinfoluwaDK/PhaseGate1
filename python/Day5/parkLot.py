# Initialize the parking lot with 20 empty slots
# Make functions for parking, car entering and car leaves


parkingLot = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

def showParking():
    print("Parking Lot:")
    for space in range(20):
        print(parkingLot[space], end=' ')
    print("\n")

def carEnters():
    for space in range(20):
        if parkingLot[space] == 0:
            parkingLot[space] = 1
            print("Car entered slot", space )
            

def carLeaves():
        