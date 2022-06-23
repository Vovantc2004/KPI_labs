# Номер залікової книжки 1525
# C11 = 7;
# Варіант завдання: визначити клас спортивний інвентар, який складається як мінімум з 5-и полів


# функція для послідовного виводу елементів масиву
def array_print(array):
    for i in array:
        print(i)


# визначаємо клас спортивний інвентар
class SportEquipment:
    def __init__(self, category, brand, model, color, price):
        self.__category = category
        self.__brand = brand
        self.__model = model
        self.__color = color
        self.__price = price

    def __repr__(self):
        return f"category: {self.__category}, brand: {self.__brand}, model: {self.__model}, color: {self.__color}, price: {self.__price}"
    
    def get_category(self):
        return self.__category

    def get_brand(self):
        return self.__brand

    def get_model(self):
        return self.__model

    def get_color(self):
        return self.__color

    def get_price(self):
        return self.__price


equipment1 = SportEquipment("ball", "Nike", "0.1", "brown", 30)
equipment2 = SportEquipment("skateboard", "Santa Cruz", "0.134F", "black", 200)
equipment3 = SportEquipment("dumbell", "AmazonBasics", "1523A", "grey", 90)


l_equipment = [equipment1, equipment2, equipment3]

print("\nArray: ")
array_print(l_equipment)

print("\nArray sorted by brand: ")
l_equipment.sort(key=lambda x: x.get_brand())
array_print(l_equipment)

print("\nArray sorted by price (reversed): ")
l_equipment.sort(key=lambda x: x.get_price(), reverse=True)
array_print(l_equipment)
