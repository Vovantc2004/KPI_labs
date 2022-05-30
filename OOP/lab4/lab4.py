'''
Номер залікової книжки 1525
C11 = 7;
Варіант завдання: визначити клас спортивний інвентар, який складається як мінімум з 5-и полів.
'''


# функція для послідовного виводу елементів масиву
def array_print(array):
    for i in array:
        print(i)


# визначаємо клас спортивний інвентар
class SportEquipment:
    def __init__(self, type, brand, model, color, price):
        self.type = type
        self.brand = brand
        self.model = model
        self.color = color
        self.price = price

    def __str__(self):
        return f"type: {self.type}, brand: {self.brand}, model: {self.model}, color: {self.color}, price: {self.price}"

    def __repr__(self):
        return f"type: {self.type}, brand: {self.brand}, model: {self.model}, color: {self.color}, price: {self.price}"


equipment1 = SportEquipment("ball", "Nike", "0.1", "brown", 30)
equipment2 = SportEquipment("skateboard", "Santa Cruz", "0.134F", "black", 200)
equipment3 = SportEquipment("dumbell", "AmazonBasics", "1523A", "grey", 90)

l_equipment = [equipment1, equipment2, equipment3]

print("\nArray: ")
array_print(l_equipment)

print("\nArray sorted by brand: ")
l_equipment.sort(key=lambda x: x.brand)
array_print(l_equipment)

print("\nArray sorted by price (reversed): ")
l_equipment.sort(key=lambda x: x.price, reverse=True)
array_print(l_equipment)
