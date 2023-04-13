class User:

    def __init__(self, first_name, last_name, email, age):
        self.first_name = first_name
        self.last_name = last_name
        self.email = email
        self.age = age
        self.is_rewards_member = False
        self.gold_card_points = 0

    def display_info(self):
        # Display user's information line by line
        print('---')
        print(f"{self.first_name} {self.last_name}, {self.email} || Age: {self.age} || Rewards Member: {self.is_rewards_member}, Points Balance: {self.gold_card_points}")

    def enroll(self):
        if self.is_rewards_member == True:
            print('!!! You are already a rewards member! !!!')
        else:
            self.is_rewards_member = True
            self.gold_card_points += 200
            # print(self.is_rewards_member)
            # print(self.gold_card_points)
            print(f"Thank you, {self.first_name}! You are now enrolled!")
            print(f"Your gold card balance is {self.gold_card_points} points.")

    def spend_points(self, amount):
        self.gold_card_points -= amount
        print(f"{self.first_name}, you have {self.gold_card_points} points remaining.")


user1 = User('Kevin', 'Lucido', 'kevinlucido@outlook.com', 25)
print(user1)  # confirms instantiation with class

user1.enroll()

user2 = User('John', 'Bridges', 'jbridges@yahoo.com', 31)
user3 = User('Allen', 'Watts', 'apwatts@gmail.com', 34)

user1.enroll()  # test to see if user is already enrolled
user1.spend_points(150)
user2.enroll()
user2.spend_points(80)

user1.display_info()
user2.display_info()
user3.display_info()
user3.enroll()
user3.display_info()
user3.enroll()